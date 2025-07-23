# Bank Management System & ATM Simulator

A comprehensive, secure, and user-friendly desktop application built with Java that simulates the core functionalities of a real-world ATM and bank management system. This project provides a complete banking experience, from a secure, multi-step user registration process to performing various financial transactions.

## ✨ Features

- **Secure User Authentication**: Safe login system for existing users.
- **Multi-Step Registration**: A detailed three-page sign-up process to securely capture user details.
- **Automatic Credential Generation**: New users are automatically assigned a unique 16-digit card number and a 4-digit PIN.
- **Deposit**: Seamlessly add funds to your account.
- **Withdrawal**: Conveniently withdraw cash as needed.
- **Fast Cash**: Quick withdrawal option with predefined amounts.
- **PIN Change**: Enhance account security by easily updating your PIN.
- **Balance Enquiry**: Check your current account balance at any time.
- **Mini Statement**: Generate a detailed receipt of your recent transactions.

## 🛠️ Tech Stack

- **Core Language**: Java
- **UI/UX**: Java Swing & AWT for the graphical user interface.
- **Database**: MySQL for robust and persistent data storage.
- **Database Connectivity**: JDBC (Java Database Connectivity)
- **Date Handling**: `JCalendar` library for an interactive date picker.

## ⚙️ Setup and Installation

Follow these steps to get the project up and running on your local machine.

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL Server
- An IDE like IntelliJ IDEA or Eclipse

### 1. Database Setup

You need to set up the MySQL database and the required tables before running the application.

1.  **Create the Database**: Open your MySQL client and run the following command to create the database:
    ```sql
    CREATE DATABASE bankmanagementsystem;
    ```
2.  **Use the Database**:
    ```sql
    USE bankmanagementsystem;
    ```
3.  **Create the Tables**: Run the following SQL scripts to create the necessary tables.

    * **`signup` Table**: Stores the first page of user registration details.
        ```sql
        CREATE TABLE signup (
            formno VARCHAR(20),
            name VARCHAR(50),
            father_name VARCHAR(50),
            dob VARCHAR(20),
            gender VARCHAR(20),
            email VARCHAR(50),
            marital_status VARCHAR(20),
            address VARCHAR(100),
            city VARCHAR(50),
            state VARCHAR(50),
            pincode VARCHAR(20)
        );
        ```
    * **`signup2` Table**: Stores the second page of user details.
        ```sql
        CREATE TABLE signup2 (
            formno VARCHAR(20),
            religion VARCHAR(20),
            category VARCHAR(20),
            income VARCHAR(30),
            education VARCHAR(30),
            occupation VARCHAR(30),
            pan_number VARCHAR(20),
            aadhar_number VARCHAR(20),
            senior_citizen VARCHAR(10),
            existing_account VARCHAR(10)
        );
        ```
    * **`signup3` Table**: Stores account details and generated credentials.
        ```sql
        CREATE TABLE signup3 (
            formno VARCHAR(20),
            account_type VARCHAR(40),
            card_number VARCHAR(25),
            pin_number VARCHAR(10),
            facility VARCHAR(150)
        );
        ```
    * **`login` Table**: Stores the credentials used for logging in.
        ```sql
        CREATE TABLE login (
            formno VARCHAR(20),
            cardNumber VARCHAR(25),
            pin VARCHAR(10)
        );
        ```
    * **`bank` Table**: Stores all transaction records.
        ```sql
        CREATE TABLE bank (
            formNum VARCHAR(20),
            pinNum VARCHAR(10),
            date VARCHAR(50),
            type VARCHAR(20),
            amount VARCHAR(20)
        );
        ```

### 2. Project Configuration

The project uses an external configuration file to handle database credentials securely.

1.  Navigate to the `src/main/resources` folder.
2.  Create a file named `config.properties`.
3.  Add your database credentials to this file:
    ```properties
    db.url=jdbc:mysql:///bankmanagementsystem
    db.user=your_mysql_username
    db.password=your_mysql_password
    ```
    Replace `your_mysql_username` and `your_mysql_password` with your actual MySQL credentials.

## 🚀 How to Run

Once the database and configuration are set up, you can run the application.

1.  Open the project in your preferred Java IDE (e.g., IntelliJ IDEA).
2.  Locate the `Main.java` file inside the `src/banking` directory.
3.  Run the `main` method in this file to start the application. The login screen will appear.

## 📂 Project Structure

The project is organized into two main directories:

-   **`src`**: Contains all the `.java` source code files, organized within the `banking` package.
-   **`resources`**: Contains all non-code assets, including images/icons and the `config.properties` file.

This clean structure separates the application's logic from its resources, making it easier to manage and scale.
