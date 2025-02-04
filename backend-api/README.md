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
