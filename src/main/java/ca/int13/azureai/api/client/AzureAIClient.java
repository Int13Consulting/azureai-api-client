/*
Copyright (c) 2023 Int13 Consulting Inc.

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and/or sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package ca.int13.azureai.api.client;

import ca.int13.azureai.api.classes.AzureAIChatRequest;
import ca.int13.azureai.api.classes.AzureAIChatResponse;
import ca.int13.azureai.api.classes.AzureAICompletionRequest;
import ca.int13.azureai.api.classes.AzureAICompletionsResult;
import ca.int13.azureai.api.classes.AzureAICreateEmbedingResponse;
import ca.int13.azureai.api.classes.AzureAIEmbeddingRequest;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Future;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Request;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.Response;

/**
 *
 * @author mgamble
 */
public class AzureAIClient implements Closeable {

    private static final String JSON = "application/json; charset=UTF-8";
    private final boolean closeClient;
    private final AsyncHttpClient client;
    
    private final String url;
    private final String token;
    private static final Version version = new Version();
    private final String apiVersion;
    private boolean closed = false;
    Gson gson = new Gson();

    public AzureAIClient(String url, String apiKey, String apiVersion) throws Exception {
        this.client = new DefaultAsyncHttpClient();

        this.url = url + "/openai/deployments/";
        this.token = apiKey;
        
        this.apiVersion = apiVersion;
        closeClient = true;
    }

    //////////////////////////////////////////////////////////////////////
    // Closeable interface methods
    //////////////////////////////////////////////////////////////////////
    public boolean isClosed() {
        return closed || client.isClosed();
    }

    public void close() {
        if (closeClient && !client.isClosed()) {
            try {
                client.close();
            } catch (IOException ex) {

            }
        }
        closed = true;
    }

    public static String getVersion() {
        return version.getBuildNumber();
    }

    public static String getBuildName() {
        return version.getBuildName();
    }

    public AzureAICompletionsResult getCompletion(AzureAICompletionRequest completion, String deploymentName) throws Exception {
        //chat/completions
        Future<Response> f = client.executeRequest(buildRequest("POST", "completions?api-version=" + apiVersion, gson.toJson(completion), deploymentName));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not get competion result");
        } else {
            return gson.fromJson(r.getResponseBody(), AzureAICompletionsResult.class);

        }
    }

    public AzureAICreateEmbedingResponse createEmbedding(AzureAIEmbeddingRequest embedding, String deploymentName) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("POST", "embeddings?api-version=" + apiVersion, gson.toJson(embedding), deploymentName));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not create embedding");
        } else {
            return gson.fromJson(r.getResponseBody(), AzureAICreateEmbedingResponse.class);

        }
    }

    public AzureAIChatResponse sendChatRequest(AzureAIChatRequest chatRequest, String deploymentName) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("POST", "chat/completions?api-version=" + apiVersion, gson.toJson(chatRequest), deploymentName));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not create chat request - server resposne was " + r.getStatusCode() + " to url: " + url + "chat/completions?api-version=2023-03-15-preview");
        } else {
         //   System.out.println(gson.toJson(r.getResponseBody()));
            return gson.fromJson(r.getResponseBody(), AzureAIChatResponse.class);

        }
    }

    private Request buildRequest(String type, String subUrl, String deploymentName) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + deploymentName + "/" + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                    .addHeader("api-key", this.token)
                .build();
        return request;
    }

    private Request buildRequest(String type, String subUrl, String requestBody, String deploymentName) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url  + deploymentName + "/" + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("api-key", this.token)
                .setBody(requestBody)
                .build();
        return request;
    }

}
