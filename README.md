# Student-Management
## Overview
This is a Spring Boot-based RESTful API that allows you to manage student data. The project follows a clean architecture using layered components such as Controller, Service, Repository, DTO, and Entity layers. It integrates with a relational database using Spring Data JPA .


## Technologies Used
This project makes use of the following libraries and technologies:
- **java**e
- **Spring boot** 
- **MySQL**


  ## Features
-Add new students
-Retrieve student details
-Standard RESTful API design


## Project Structure
```
LearningRESTAPIs
            ├── config/
            │   └── MapperConfig.java         
            │
            ├── controller/
            │   └── StudentController.java      // Handles API requests
            │
            ├── dto/
            │   ├── AddStudentRequestDto.java   // DTO for creating student
            │   └── StudentDto.java             // DTO for response/view
            │
            ├── entity/
            │   └── Student.java                // JPA Entity
            │
            ├── repository/
            │   └── StudentRepository.java      // Interface extending JpaRepository
            │
            ├── service/
            │   ├── StudentService.java         // Interface (optional)
            │   └── StudentServiceImpl.java     // Business logic
            │
            └── LearningRestApisApplication.java // Main class (Spring Boot entry point)

resources/
└── application.properties (or .yml)




















