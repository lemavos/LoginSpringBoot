# Login Simulation API

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A simple **Java + Spring Boot** application that provides a **login and registration system** with an integrated frontend built using **HTML, CSS, and JavaScript**.  
The API uses **H2 Database** for data persistence and supports **CORS** to allow frontend communication.

---

## 🚀 Features

- User registration and login  
- Data persistence using H2 Database  
- REST API built with Spring Boot  
- Cross-Origin Resource Sharing (CORS) configured  
- Frontend client for testing (HTML, CSS, JS)

---

## 🧩 Project Structure
```
loginSimulation/
├── api/ → Backend (Spring Boot)
│ ├── src/main/java/com/lemavos/chatappsb/
│ │ ├── controller/ → API endpoints
│ │ ├── entity/ → User entity
│ │ ├── repository/ → Data layer
│ │ ├── service/ → Business logic
│ │ └── config/
│ └── data/ → H2 database files
│
├── client/ → Frontend (HTML + JS)
│ ├── register.html → Registration page
│ ├── login.html → Login page
│ ├── main.js → API requests
│ └── style.css → Basic styling
│
└── pom.xml → Maven configuration
```

---

## 🧑‍💻 Technologies Used

- `Java 17+`  
- `Spring Boot`  
- `H2 Database`  
- `Maven`  
- `HTML / CSS / JavaScript`

---

## ⚙️ Setup & Run

### 🐧 On Linux and macOS

1. Make sure Maven is installed:
```
mvn -v
```

Clone the repository:
```
git clone https://github.com/lemavos/loginSimulation.git
cd loginSimulation/api
```
Run the Spring Boot server:

```
mvn spring-boot:run
```
Open the frontend:
```
cd ../client
python3 -m http.server 5500
xdg-open register.html   # or open login.html
```
### 🪟 On Windows

Check Maven installation:
```
mvn -v
```
Clone and run:
```
git clone https://github.com/lemavos/loginSimulation.git
cd loginSimulation/api
mvn spring-boot:run
python3 -m http.server 5500

```
Open the client/login.html or register.html file in your browser.

### 📦 API Endpoints
- Method	   Endpoint	           Description
- POST	     /user/register	     Register a new user
- GET	       /user/all	         Retrieve all users
- POST  	   /user/login	       Validate login credentials


📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

