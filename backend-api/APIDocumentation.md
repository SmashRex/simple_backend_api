# API Documentation

## Introduction

This is a simple public API built with Java (Spring Boot) for the HNG12 internship. The API provides basic information, including a registered email, the current date/time (in ISO 8601 format), and a GitHub repository URL.

## Base URL

All API endpoints are relative to the base URL:

https://simplebackendapi-production.up.railway.app/

## Endpoints

### 1. Get API Information

- **Endpoint:** `/`
- **Method:** `GET`
- **Headers:**
    - `Content-Type: application/json`
- **Parameters:**
    - None

#### Request Example

Using `curl`:

```sh
curl -X GET https://simplebackendapi-production.up.railway.app/
```

## Response

- **Status:** 200 OK
- **Content-Type:** application/json

## Example Response:

```json
{
  "email": "afolabitemiloluwa4@gmail.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/SmashRex/simple_backend_api.git"
}
```

## Example Usage in Java

Using Java's HttpURLConnection:

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiClient {
  public static void main(String[] args) { // ✅ Ensure correct signature
    try {
      URL url = new URL("https://simplebackendapi-production.up.railway.app/");
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("Content-Type", "application/json");

      BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String inputLine;
      StringBuilder response = new StringBuilder();

      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();

      System.out.println(response.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

```
## Deployment

This API is deployed to a publicly accessible endpoint ensuring a fast response time (< 500ms). You can access the live version of the API at:

https://simplebackendapi-production.up.railway.app/


## Error Handling

If an error occurs, the API will return a JSON response with details. For example:

### 404 Not Found:
When the requested resource does not exist.

### 500 Internal Server Error:
When an unexpected error occurs on the server.

#### Example Error Response:

```json
{
  "error": "Resource not found",
  "code": 404
}
```

## Backlink

Learn more about hiring Java developers: https://hng.tech/hire/java-developers

