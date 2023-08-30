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


public class Version {

    /*
        0.1.1 - Fix bug in create embeding response
        0.1.0 - Update client to support multiple deployments at run time so we can use gpt and ada at the same time with a single client
        0.0.7 - Revert to java 11 for more compatibility
        0.0.6 - More updates and bug fixes
        0.0.5 - Add support for function calls in AzureAI
        0.0.4 - Set sane defaults on AIChatRequest
        0.0.3 - Fix issues with AzureAIMessage
        0.0.1 - Initial release for testing

     */
    public Version() {

    }

    private final String buildNumber = "0.1.1";
    private final String buildName = "Don't Blame Me";
    private final String author = "Int13 Consulting Inc.";

    /**
     * @return the buildNumber
     */
    public String getBuildNumber() {
        return buildNumber;
    }

    /**
     * @return the buildName
     */
    public String getBuildName() {
        return buildName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

}

