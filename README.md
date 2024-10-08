# Spring Boot User Registration and Login Tutorial

This tutorial demonstrates how to create a simple user registration and login system using Spring Boot, Spring Security, Hibernate, and Thymeleaf.

## Overview

This project is a comprehensive guide to building a full-stack web application where users can register, log in, and manage their profiles. It covers the complete stack from the backend logic to frontend form handling and security integration.

## Features

- **User Registration**: Users can create an account by providing their email, password, first name, and last name.
- **User Login**: Registered users can log in with their credentials.
- **Password Encryption**: User passwords are encrypted using BCrypt for security.
- **Form Validation**: Backend validation ensures that data is provided in the correct format.
- **Spring Security Integration**: User authentication and access control are handled with Spring Security.
- **Thymeleaf Templating**: A simple user interface built using Thymeleaf.
- **Hibernate & JPA**: For persistence and ORM to manage user entities.

## Technologies Used

- **Spring Boot**: Framework for building Java applications.
- **Spring Security**: Provides authentication and authorization features.
- **Spring Data JPA**: For interacting with the database in an object-oriented way.
- **Thymeleaf**: Template engine for rendering HTML pages.
- **Hibernate**: ORM framework for interacting with the database.
- **BCrypt**: A hashing algorithm used to encrypt user passwords.
- **MySQL**: Database for storing user information.

## Project Setup

### 1. Prerequisites

Ensure you have the following installed on your system:

- **Java**: JDK 11 or above
- **Maven**: For dependency management and building the project
- **MySQL**: As the database

### 2. Clone the Repository

```bash
git clone https://github.com/vaishnavimhaske99/spring-boot-user-registration-login.git
cd spring-boot-user-registration-login
