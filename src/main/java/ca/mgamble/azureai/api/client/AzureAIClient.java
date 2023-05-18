/*
Copyright (c) 2023 Matthew M. Gamble

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

package ca.mgamble.azureai.api.client;

import ca.mgamble.azureai.api.classes.AzureAIChatRequest;
import ca.mgamble.azureai.api.classes.AzureAICompletionRequest;
import ca.mgamble.azureai.api.classes.AzureAICompletionsResult;
import ca.mgamble.azureai.api.classes.AzureAICreateEmbedingResponse;
import ca.mgamble.azureai.api.classes.AzureAIEmbedding;

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
    private final String deploymentName;
    private final String url;
    private final String token;
    private static final Version version = new Version();

    private boolean closed = false;
    Gson gson = new Gson();

    public AzureAIClient(String url, String apiKey, String deploymentName) throws Exception {
        this.client = new DefaultAsyncHttpClient();

        this.url = url + "/openai/deployments/" + deploymentName + "/";
        this.token = apiKey;
        this.deploymentName = deploymentName;
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

    public AzureAICompletionsResult getCompletion(AzureAICompletionRequest completion) throws Exception {
        //chat/completions
        Future<Response> f = client.executeRequest(buildRequest("POST", "/completions", gson.toJson(completion)));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not get competion result");
        } else {
            return gson.fromJson(r.getResponseBody(), AzureAICompletionsResult.class);

        }
    }

    public AzureAICreateEmbedingResponse createEmbedding(AzureAIEmbedding embedding) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("POST", "/embeddings", gson.toJson(embedding)));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not create embedding");
        } else {
            return gson.fromJson(r.getResponseBody(), AzureAICreateEmbedingResponse.class);

        }
    }

    public AzureAICreateEmbedingResponse createChatRequest(AzureAIChatRequest chatRequest) throws Exception {
        Future<Response> f = client.executeRequest(buildRequest("POST", "/chat/completions", gson.toJson(chatRequest)));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not create embedding");
        } else {
            return gson.fromJson(r.getResponseBody(), AzureAICreateEmbedingResponse.class);

        }
    }

    private Request buildRequest(String type, String subUrl) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("Authorization", "Bearer " + this.token)
                .build();
        return request;
    }

    private Request buildRequest(String type, String subUrl, String requestBody) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("api-key", this.token)
                .setBody(requestBody)
                .build();
        return request;
    }

}
