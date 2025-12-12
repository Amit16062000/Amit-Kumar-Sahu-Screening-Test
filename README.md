# Amit Kumar Sahu – Screening Test Solutions

![Language](https://img.shields.io/badge/Language-Java-blue)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![License](https://img.shields.io/badge/License-None-lightgrey)

A complete implementation of the four programming problems assigned in the Screening Test.  
All programs are written in **Java**, follow the required naming conventions, and run independently.

---

# **Table of Contents**
1. [About This Repository](#about-this-repository)  
2. [Technology Used](#technology-used)  
3. [Repository Structure](#repository-structure)  
4. [Problem Descriptions](#problem-descriptions)  
   - [Problem 1 – Calculator Using Class](#problem-1--calculator-using-class)  
   - [Problem 2 – First N Odd Numbers](#problem-2--first-n-odd-numbers)  
   - [Problem 3 – Pattern-Based Odd Number Series](#problem-3--pattern-based-odd-number-series)  
   - [Problem 4 – Count Multiples of 1–9](#problem-4--count-multiples-of-19)  
5. [How to Run the Programs](#how-to-run-the-programs)  
6. [Author](#author)

---

# **About This Repository**

This repository contains the solutions for the **First Screening Test**.  
The instructions required each problem to be implemented in **separate files** using any programming language.  
The chosen language is **Java** due to its portability, readability, and structured syntax.

Each problem file includes:
- A complete and independent Java program  
- A `main` method for execution  
- Clean, modular, and readable logic  

---

# **Technology Used**

| Component    | Details |
|-------------|---------|
| Language    | Java (JDK 8 or higher) |
| Tools       | Git, GitHub |
| IDE/Text Editor | VS Code / IntelliJ / Eclipse (any) |

---

# **Repository Structure**

```
Amit-Kumar-Sahu-Screening-Test/
│
├── Problem-1.java      # Calculator class with basic arithmetic operations
├── Problem-2.java      # Generates first N odd numbers
├── Problem-3.java      # Generates odd-number pattern based on input rules
├── Problem-4.java      # Counts multiples of 1–9 in a list
└── README.md           # Documentation
```

---

# **Problem Descriptions**

## **Problem 1 – Calculator Using Class**
A calculator built using a dedicated Java class that performs:

- Addition  
- Subtraction  
- Multiplication  
- Division  

Inputs:
- `a` (double)
- `b` (double)
- `operation` (string)

Output:
- Result of the specified operation

File: **Problem-1.java**

---

## **Problem 2 – First N Odd Numbers**
Given an integer `a`, generate the **first `a` odd numbers**.

Example:
- Input: `4`
- Output: `1, 3, 5, 7`

File: **Problem-2.java**

---

## **Problem 3 – Pattern-Based Odd Number Series**
Generates odd-number series based on input rules.

Examples:
- a = 1 → `1`  
- a = 2 → `1`  
- a = 3 → `1, 3, 5`  
- a = 4 → `1, 3, 5`  
- a = 5 → `1, 3, 5, 7, 9`  
- a = 6 → `1, 3, 5, 7, 9`

The logic ensures odd numbers are printed up to the correct pattern-defined limit.

File: **Problem-3.java**

---

## **Problem 4 – Count Multiples of 1–9**
Given a list of integers, count how many are divisible by each number from **1 to 9**.

Example Input:
```
[1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30]
```

Example Output:
```
{1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}
```

File: **Problem-4.java**

---

# **How to Run the Programs**

## **1. Compile**
Run the command below for any program:

```
javac Problem-1.java
javac Problem-2.java
javac Problem-3.java
javac Problem-4.java
```

## **2. Execute**
```
java Problem-1
java Problem-2
java Problem-3
java Problem-4
```

All programs run independently and print output to the console.

---

# **Author**

**Amit Kumar Sahu**  
Screening Test Submission  
GitHub: https://github.com/Amit16062000

