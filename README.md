
# APT1030 Comparative programming exercise
## Student Registration Status Checker
## Purpose
  This project demonstrates how the same logic can be expressed across multiple programming languages highlighting differences in syntax. type systems, input handling, and program structure. It serves as a practical introduction  to multi language programmming and language comparison.

## What the Program Does

1. Prompts the user for a **student name**
2. Prompts the user for the **number of registered units**
3. Determines registration status:
   - **> 7 units** → `Overload - Approval Required`
   - **≤ 7 units** → `Registration Accepted`
4. Prints a summary showing the student's **NAME**, **UNITS**, and **STATUS**

## How to Run Each Version

### Python

**Requirements:** Python 3.6+

```bash
cd python
python std.py
```

---

### Java

**Requirements:** JDK 8+

```bash
cd java
javac std.java
java std
```

---

### JavaScript (Node.js)

**Requirements:** Node.js 12+

```bash
cd javascript
node std.js
```

---

### C

**Requirements:** GCC compiler

```bash
cd c
gcc std.c -o std
./std
```

On Windows:
```bash
gcc std.c -o std.exe
std.exe
```

---
## Sample Output

```
Enter your name: Jane
Enter number of registered units: 9
NAME: Jane
UNITS: 9
STATUS: Overload - Approval Required
```

---

## What This Project Demonstrates

- **Syntax differences** across statically and dynamically typed languages
- **Input/output handling** using each language's standard library
- **Conditional logic** expressed in different styles
- **Compiled vs. interpreted** execution — C and Java require compilation; Python and JavaScript run directly
- **String formatting** approaches unique to each language
