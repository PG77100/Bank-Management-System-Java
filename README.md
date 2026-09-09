 🏦 SBI Bank - Digital Banking System (Java Swing)

A sleek, desktop-based Banking Management System built entirely using **Java Swing** and **AWT**. This application features an intuitive interactive GUI dashboard, real-time transaction processing, card views, and financial calculators—all operating seamlessly **in-memory without requiring any external database configuration**.

---

## 🌟 Features

* **📊 Interactive Dashboard**: Displays account balance, account number, account holder details, and quick guidelines.
* **💵 Real-Time Deposit & Withdrawal**: Perform instant transactions with built-in input validation (handles negative amounts, non-numeric values, and insufficient balance errors).
* **📜 Live Transaction History**: Displays real-time updated transaction logs with timestamps, operation types, amounts, and post-transaction balances.
* **⚡ Zero Database Setup**: Runs completely in-memory using dynamic data structures (`ArrayList`, `DefaultTableModel`), making it lightweight and instantly runnable.
* **🎨 Clean UI/UX Design**: Uses modern `CardLayout` navigation, custom color schemes, formatted currency strings (₹), and system Look and Feel.

---

## 🛠️ Tech Stack & Requirements

* **Language**: Java (JDK 8 or higher)
* **GUI Framework**: Java Swing (`javax.swing.*`) & AWT (`java.awt.*`)
* **Database**: None (In-Memory Processing)

---

## 📁 Project Structure

```text
.
├── Bankpage.java      # Main Application GUI & In-Memory Logic
└── README.md          # Project Documentation
🚀 How to Run the ApplicationPrerequisitesMake sure you have Java Development Kit (JDK) installed on your system. You can verify it by running:
java -version
javac -version
Steps to ExecuteClone or Download the Repository
git clone [https://github.com/your-username/banking-system-javaswing.git](https://github.com/your-username/banking-system-javaswing.git)
cd banking-system-javaswing
Compile the Java Code Open your terminal/command prompt in the project folder and run:
javac Bankpage.java
Run the ApplicationBashjava Bankpage

💻 Navigation & System DemoTabFunctionalityDashboardView available balance, account information, and safety guidelines.DepositAdd funds to your account instantly with dynamic balance updating.WithdrawWithdraw funds with automated balance checking to prevent overdrafts.HistoryView full logs of all past and newly performed transactions in real-time.
