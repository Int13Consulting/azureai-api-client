# Azure AI Java Client Library

An easy-to-use Java client library for accessing and interacting with the Azure AI API. Licensed under the MIT License.

## Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [License](#license)

## Features
- Connect to any Azure AI instance.
- Support for multiple Azure AI models.
- Flexible API key authentication.

## Installation

Ensure you have Java installed and set up on your system.

Clone this repository or download the source code:

git clone https://github.com/your-github-username/azure-ai-java-client.git

Compile and package with your preferred Java build tool, or use the provided build script.

## Usage

To begin, make sure you have your Azure instance URL, Azure API key, Azure AI model, and optionally, the model version.

Here's a simple example to get started:

```java
import your.package.name.AzureAIClient;

public class Main {
    public static void main(String[] args) {
        String azureAPIUrl = "YOUR_AZURE_INSTANCE_URL";
        String azureAPIKey = "YOUR_AZURE_API_KEY";
        String azureAIModel = "YOUR_AZURE_AI_MODEL";
        String azureAIModelVersion = "YOUR_AZURE_AI_MODEL_VERSION"; // Optional

        AzureAIClient azureAIClient = new AzureAIClient(azureAPIUrl, azureAPIKey, azureAIModel, azureAIModelVersion);

        // Now you can use the client to interact with Azure AI...
    }
}
```

## License

This project is released under the MIT License. See LICENSE file for details.

Contributions, issues, and feature requests are welcome!
