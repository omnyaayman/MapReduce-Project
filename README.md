<h1 align="center">🚀 MapReduce Project</h1>

<p align="center">
  <b>Big Data Processing using Hadoop MapReduce</b><br>
  <i>Task 7 & Task 15 Implementation</i>
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com/?lines=MapReduce+Project;Big+Data+Processing;Task+7+%7C+Task+15&center=true&width=500&height=50">
</p>

---

## 🧠 Project Overview

This project demonstrates how **Hadoop MapReduce** can efficiently process large-scale datasets.

It focuses on two main operations:

* 🔹 Data Joining (Task 7)
* 🔹 Data Partitioning & Analysis (Task 15)

The solution is designed to be **scalable**, **robust**, and capable of handling **large datasets (1GB+)** with proper **data validation and error handling**.

---

## 🔵 Task 7: Employee Payroll Join

### 💡 Concept

This task performs a **join operation** between:

* Employee dataset
* Payroll dataset

### ⚙️ Processing Logic

* Match employee records with payroll data using `employeeId`
* Compute:

  * 💰 **Total Pay = baseSalary + bonus**
  * 📈 **Maximum Pay across all months per employee**

### 📥 Sample Input

```id="7j6kq2"
EMP01, Nour, Hassan, Engineering
PR001, EMP01, Jan, 8000, 500
```

### 📤 Sample Output

```id="q0a1zd"
EMP01 Nour Hassan,Engineering,Jan,8500,8700
```

---

## 🟢 Task 15: Age Group Partitioning

### 💡 Concept

This task analyzes demographic data by dividing records into **age groups**.

### ⚙️ Processing Logic

* Use a **Custom Partitioner** to distribute data into:

  * 18–24
  * 25–34
  * 35–44
  * 45–54
  * 55+

* Compute:

  * 📊 **Average Income per Age Group**

### 📥 Sample Input

```id="cvt6ux"
P001,25,3000,Employed,Bachelor
```

### 📤 Sample Output

```id="vryy0v"
25-34 Avg Income: 3166
```

---

## ⚙️ Technologies Used

* ☕ Java
* 🐘 Apache Hadoop
* 💻 VS Code / IntelliJ

---

## 📂 Project Structure

```id="q8m2rs"
task7/
task15/
```

---

## ▶️ Execution Steps

1. Compile Java files
2. Package into a JAR file
3. Run using Hadoop commands

---

## ⚠️ Data Validation & Handling

* Skip malformed or incomplete records
* Handle missing employees as:

```
UNKNOWN EMPLOYEE
```

* Ensure valid numeric values (salary, bonus, income)
* Validate age ranges

---

## 🧪 Testing

* Verified using sample datasets
* Designed for large-scale data processing

---

## 🚀 Key Features

* ✔️ Scalable MapReduce Implementation
* ✔️ Efficient Data Processing
* ✔️ Custom Partitioner (Task 15)
* ✔️ Robust Error Handling

---

## ⭐ Future Enhancements

* Real-time processing integration
* Migration to Apache Spark
* Data visualization dashboard

---

<p align="center">
  💙 Built for scalable Big Data solutions 💙
</p>
