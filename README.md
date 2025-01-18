# Banking System Project

## Overview
The **Banking System** is a Java-based application designed to simulate banking operations for both customers and administrators. The application includes features such as deposits, withdrawals, transfers, loan management, query handling, and administrative controls for account management.

---

## Features

### Customer Features:
1. **Account Operations**:
   - Deposit money.
   - Withdraw money.
   - Check account balance.
   - Transfer money to another account.
2. **Loan Management**:
   - Apply for loans (Education, Crop, Home, Gold).
   - View loan application status.
3. **Query Management**:
   - Submit queries.
   - View query statuses and resolutions.
4. **Transaction History**:
   - View transaction history.
5. **Account Security**:
   - Change password.

### Admin Features:
1. **Customer Management**:
   - View all customers.
   - View account details of specific customers.
   - Lock/unlock or delete accounts.
2. **Loan Management**:
   - View all loan applications.
   - Approve or reject loan requests.
3. **Audit Logs**:
   - View all transactions for audit purposes.
4. **Query Resolution**:
   - View and update the status of customer queries.

---

## Technology Stack
- **Programming Language**: Java
- **Database**: MySQL
- **Tools**: Eclipse IDE, Git
- **Version Control**: GitHub

---

## Installation & Setup

### Prerequisites:
1. Install Java (JDK 17 or higher).
2. Install MySQL Server.
3. Install Eclipse IDE.
4. Install Git for version control.

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/banking_system.git
   ```
2. Open the project in Eclipse:
   - Select **File > Open Projects from File System...**.
   - Navigate to the cloned repository and open the project.
3. Configure the database:
   - Create a MySQL database named `banking_system`.
   - Import the provided SQL file to initialize the database structure and tables.
4. Update database connection settings in the `DatabaseService` class:
   ```java
   private static final String DB_URL = "jdbc:mysql://localhost:3306/banking_system";
   private static final String DB_USER = "root";
   private static final String DB_PASSWORD = "your_password";
   ```
5. Run the application:
   - Right-click on the `Main` class and select **Run As > Java Application**.

---

## How to Use

### Customer Login:
1. Choose **Customer Login** from the main menu.
2. Enter your email and password.
3. Access the customer banking menu to perform various operations.

### Admin Login:
1. Choose **Admin Login** from the main menu.
2. Enter the admin email and password.
3. Access the admin menu to manage accounts, loans, and queries.

---

## Project Structure
```
|-- src
    |-- main
        |-- Main.java
    |-- admin
        |-- AdminService.java
    |-- auth
        |-- UserAuthentication.java
    |-- banking
        |-- BankingService.java
    |-- utils
        |-- DatabaseService.java
        |-- UserNotFoundException.java
    |-- query
        |-- QueryService.java
|-- resources
    |-- banking_system.sql
```

---

## Contributing
1. Fork the repository.
2. Create a feature branch:
   ```bash
   git checkout -b feature/your-feature
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push the changes:
   ```bash
   git push origin feature/your-feature
   ```
5. Open a Pull Request.

---

## License
This project is licensed under the MIT License. Feel free to use and modify the code.

---

## Acknowledgments
Special thanks to all contributors and mentors who made this project a success!

