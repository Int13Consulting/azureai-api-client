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

import ca.int13.azureai.api.classes.AzureAIAssistantList;
import ca.int13.azureai.api.classes.AzureAIAssistantMessage;
import ca.int13.azureai.api.classes.AzureAIChatRequest;
import ca.int13.azureai.api.classes.AzureAIChatResponse;
import ca.int13.azureai.api.classes.AzureAICompletionRequest;
import ca.int13.azureai.api.classes.AzureAICompletionsResult;
import ca.int13.azureai.api.classes.AzureAICreateEmbedingResponse;
import ca.int13.azureai.api.classes.AzureAICreateThreadResponse;
import ca.int13.azureai.api.classes.AzureAIEmbeddingRequest;
import ca.int13.azureai.api.classes.AzureAIFileUploadResponse;
import ca.int13.azureai.api.classes.AzureAIRunResult;
import ca.int13.azureai.api.classes.AzureAIRunThreadRequest;
import ca.int13.azureai.api.classes.AzureAICreateThreadMessage;
import ca.int13.azureai.api.classes.AzureAIThreadMessages;

import com.google.gson.Gson;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Future;
 
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Request;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.Response;
import org.asynchttpclient.request.body.multipart.FilePart;
import org.asynchttpclient.request.body.multipart.MultipartBody;
import org.asynchttpclient.request.body.multipart.StringPart;

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

        this.url = url;
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

    // get /openai/assistants
    
    public AzureAIAssistantList getAssistants() throws Exception {
        Future<Response> f = client.executeRequest(buildAssistantRequest("GET", "openai/assistants?api-version=" + apiVersion));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not get list of assistants - response code was " + r.getStatusCode() + " and body " + r.getResponseBody() + " to URL " + r.getUri());
        } else {
            return gson.fromJson(r.getResponseBody(), AzureAIAssistantList.class);

        }
    }
    
    // Upload file https://int13-eus-ai.openai.azure.com/openai/files?api-version=2024-07-01-preview
    
    public AzureAIFileUploadResponse uploadFile(String filePath, String mimeType, String purpose) throws Exception {
         //buildFileUploadRequest(String type, String subUrl, File file, String mimeType, String purpose) 
       
         Future<Response> f = client.executeRequest(buildFileUploadRequest("POST", "openai/files?api-version=" + apiVersion, new File(filePath), mimeType, purpose));
        Response r = f.get();
        if ((r.getStatusCode() != 200)) {
System.out.println(r.getResponseBody());
            throw new Exception("Could not upload file - server resposne was " + r.getStatusCode() + " to url: " + r.getUri().toUrl());
        } else {
 
            return gson.fromJson(r.getResponseBody(), AzureAIFileUploadResponse.class);

        }
        
    }
    
    public void deleteFile(String fileId) throws Exception {
        //DELETE https://YOUR_RESOURCE_NAME.openai.azure.com/openai/threads/{thread_id}?api-version=2024-05-01-preview
        Future<Response> f = client.executeRequest(buildAssistantRequest("DELETE", "openai/files/" + fileId + "?api-version=" + apiVersion));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not delete file");
        }  
    }
        
    
    public AzureAICreateThreadResponse createThread() throws Exception {
        Future<Response> f = client.executeRequest(buildAssistantRequest("POST", "openai/threads?api-version=" + apiVersion));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not create thread");
        } else {
 
            return gson.fromJson(r.getResponseBody(), AzureAICreateThreadResponse.class);

        }
    }
    
    // Create a message in a thread /openai/threads/thread_fm8HTHhKXdUpfhK0w0KRqDtd/messages
  
    
    public void addMessageToThread(String threadID, AzureAICreateThreadMessage message) throws Exception {
        ///openai/threads/thread_fm8HTHhKXdUpfhK0w0KRqDtd/messages
        Future<Response> f = client.executeRequest(buildAssistantRequest("POST", "openai/threads/" + threadID + "/messages?api-version=" + apiVersion, gson.toJson(message)));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not add message to thread - response code was " + r.getStatusCode() + " - with body " + r.getResponseBody());
        }  else {
 
        }
    
    }
    
    // Run a thread
    public AzureAIRunResult runThread(String threadID, AzureAIRunThreadRequest runRequest) throws Exception {
        //POST https://YOUR_RESOURCE_NAME.openai.azure.com/openai/threads/{thread_id}/runs?api-version=2024-08-01-preview
                Future<Response> f = client.executeRequest(buildAssistantRequest("POST", "openai/threads/" + threadID + "/runs?api-version=" + apiVersion, gson.toJson(runRequest)));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not execute runThread request");
        }  else {
            System.out.println("----- runThread result -----");
            System.out.println(r.getResponseBody());
            System.out.println("----- runThread result -----");
            return gson.fromJson(r.getResponseBody(), AzureAIRunResult.class);
        }
    }
    
    // Get a run
    //curl https://YOUR_RESOURCE_NAME.openai.azure.com/openai/threads/{thread_id}/runs/{run_id}?api-version=2024-08-01-preview
    public AzureAIRunResult getRun(String threadID, String runId) throws Exception {
        //POST https://YOUR_RESOURCE_NAME.openai.azure.com/openai/threads/{thread_id}/runs?api-version=2024-08-01-preview
        Future<Response> f = client.executeRequest(buildAssistantRequest("GET", "openai/threads/" + threadID + "/runs/" + runId + "?api-version=" + apiVersion));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not execute getRun request - response code was " + r.getStatusCode() + " - with body " + r.getResponseBody());
        } else {
            System.out.println("----- getRun result -----");
            System.out.println(r.getResponseBody());
            System.out.println("----- getRun result -----");
            return gson.fromJson(r.getResponseBody(), AzureAIRunResult.class);
        }
    }

    public void deleteThread(String threadID) throws Exception {
        //DELETE https://YOUR_RESOURCE_NAME.openai.azure.com/openai/threads/{thread_id}?api-version=2024-05-01-preview
        Future<Response> f = client.executeRequest(buildAssistantRequest("DELETE", "openai/threads/" + threadID + "?api-version=" + apiVersion));
        Response r = f.get();
        if (r.getStatusCode() != 200) {
            throw new Exception("Could not delete thread");
        }  
    }
    
    public AzureAIThreadMessages listThreadMessages(String threadId) throws Exception {
        //GET https://YOUR_RESOURCE_NAME.openai.azure.com/openai/threads/{thread_id}/messages?api-version=2024-08-01-preview
        Future<Response> f = client.executeRequest(buildAssistantRequest("GET", "openai/threads/" + threadId + "/messages?api-version=" + apiVersion));
        Response r = f.get();
        if (r.getStatusCode() != 200) {

            throw new Exception("Could not get list of assistants - response code was " + r.getStatusCode() + " and body " + r.getResponseBody() + " to URL " + r.getUri());
        } else {
            System.out.println("----- listThreadMessages result -----");
            System.out.println(r.getResponseBody());
            System.out.println("----- listThreadMessages result -----");
            return gson.fromJson(r.getResponseBody(), AzureAIThreadMessages.class);

        }
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
            System.out.println("Error running sendChatRequest.  Input was: " + gson.toJson(chatRequest) + " to deploymentName " + deploymentName);
            System.out.println(r.getResponseBody());
            throw new Exception("Could not create chat request - server resposne was " + r.getStatusCode() + " to url: " + r.getUri().toUrl());
        } else {
         //   System.out.println(gson.toJson(r.getResponseBody()));
            return gson.fromJson(r.getResponseBody(), AzureAIChatResponse.class);

        }
    }
    
        private Request buildFileUploadRequest(String type, String subUrl, File file, String mimeType, String purpose) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url  + "/" + subUrl)
                .addHeader("Accept", JSON)
                .addBodyPart(new FilePart("file", file, mimeType))
                 .addBodyPart(new StringPart("purpose", purpose))
             
                .addHeader("api-key", this.token)
                .build();
        return request;
    }
        
     private Request buildAssistantRequest(String type, String subUrl) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url  + "/" + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("api-key", this.token)
                .build();
        return request;
    }
     
          private Request buildAssistantRequest(String type, String subUrl, String requestBody) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url  + "/" + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                    .addHeader("api-key", this.token)
                .setBody(requestBody)
                .build();
        return request;
    }
     

        private Request buildRequest(String type, String subUrl) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url  + "/openai/deployments/" + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                    .addHeader("api-key", this.token)
                .build();
        return request;
    }
        
    private Request buildRequest(String type, String subUrl, String deploymentName) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url + "/openai/deployments/" + deploymentName + "/" + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                    .addHeader("api-key", this.token)
                .build();
        return request;
    }

    private Request buildRequest(String type, String subUrl, String requestBody, String deploymentName) {
        RequestBuilder builder = new RequestBuilder(type);
        Request request = builder.setUrl(this.url  + "/openai/deployments/" + deploymentName + "/" + subUrl)
                .addHeader("Accept", JSON)
                .addHeader("Content-Type", JSON)
                .addHeader("api-key", this.token)
                .setBody(requestBody)
                .build();
        return request;
    }

}
