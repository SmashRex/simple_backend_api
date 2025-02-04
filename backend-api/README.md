# Public API - HNG12 Stage 0 Backend Task

This project is a simple public API built with Java (Spring Boot) for the HNG12 internship. It returns basic information including your registered email, the current datetime (in ISO 8601 format), and the GitHub URL of the project's codebase.

## Features

- **Simple and Fast:** Returns a JSON response in less than 500ms.
- **RESTful API:** Uses Spring Boot to handle GET requests.
- **CORS Enabled:** Supports Cross-Origin Resource Sharing for public access.

## Setup Instructions

### Prerequisites

- **Java 17 or higher** installed (if compiling locally).
- **Maven** for building the project.
- (Optional) **Docker** if you want to run the containerized version.

### Running Locally

1. **Clone the Repository:**

   ```sh
   git clone https://github.com/SmashRex/simple_backend_api.
   
2. **Navigate to Project Directory**

   cd simple_backend_api

3. **Build with Maven to Jar**

   mvn clean package

4. **Run the application**

   mnv spring-boot :run

5. **Access the API**
   
   Open any browser and enter
   
   https://localhost:8080/



## API Documentation

### Endpoint URL

**Base URL:**  
`https://simplebackendapi-production.up.railway.app/`

### Request

- **Method:** `GET`
- **Headers:**  
  `Content-Type: application/json`
- **Parameters:**  
  None

### Response

- **Status:** `200 OK`
- **Content-Type:** `application/json`

## Deployment
This API is deployed to a publicly accessible endpoint ensuring a fast response time (< 500ms). You can access the live version of the API at:

https://simplebackendapi-production.up.railway.app/


#### Example Response

```json
{
  "email": "your-email@example.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/yourusername/your-repo"
}

   

