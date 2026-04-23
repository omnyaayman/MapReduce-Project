<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com/?lines=🚀+MapReduce+Project;Task+7+%7C+Task+15;Big+Data+Processing+using+Hadoop&center=true&width=600&height=60">
</p>

---

## 🧠 Project Overview

This project demonstrates how **Hadoop MapReduce** can efficiently process large-scale datasets.

It focuses on two main operations:

* 🔵 **Task 7: Employee Payroll Join**
* 🟢 **Task 15: Age Group Partitioning**

The solution is designed to be **scalable**, **robust**, and capable of handling **large datasets (1GB+)** with proper **data validation and error handling**.

---

## 🔵 Task 7: Employee Payroll Join

### 💡 Concept

Performs a **join operation** between:

* Employee dataset
* Payroll dataset

### ⚙️ Processing Logic

* Match records using `employeeId`
* Compute:

  * 💰 Total Pay = baseSalary + bonus
  * 📈 Max Pay per employee across months

### 📥 Sample Input

```id="3j2m8l"
EMP01, Nour, Hassan, Engineering
PR001, EMP01, Jan, 8000, 500
```

### 📤 Sample Output

```id="q4k1xs"
EMP01 Nour Hassan,Engineering,Jan,8500,8700
```

---

## 🟢 Task 15: Age Group Partitioning

### 💡 Concept

Divides records into **age groups** for analysis.

### ⚙️ Processing Logic

* Uses **Custom Partitioner**:

  * 18–24
  * 25–34
  * 35–44
  * 45–54
  * 55+

* Computes:

  * 📊 Average Income per group

### 📥 Sample Input

```id="a9m2pq"
P001,25,3000,Employed,Bachelor
```

### 📤 Sample Output

```id="7r0k9d"
25-34 Avg Income: 3166
```

---

## ⚙️ Technologies Used

* ☕ Java
* 🐘 Apache Hadoop
* 💻 VS Code / IntelliJ

---

## 📂 Project Structure

```id="l2v8xq"
task7/
task15/
```

---

## ▶️ Execution Steps

1. Compile Java files
2. Create JAR file
3. Run using Hadoop

---

## ⚠️ Data Validation

* Skip invalid or malformed records
* Handle missing employees as:

```id="m5z1pl"
UNKNOWN EMPLOYEE
```

* Validate numeric values and age

---

## 🚀 Features

* ✔️ Scalable MapReduce Design
* ✔️ Custom Partitioner
* ✔️ Efficient Data Processing
* ✔️ Error Handling

---

<p align="center">
  💙 Built for Big Data Excellence 💙
</p>
