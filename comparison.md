#Language comparison:Student Registration status checker
---
## 1.Input Handling
How each version reads the student name and units:

**Python** - simplest approach, one built-in function per input:
```python
name = str(input("Enter your name:"))
units = int(input("Enter number of registered units:"))
```

**Java** - requires a `Scanner` object; uses `nextLine()` for strings and `nextInt()` for integers:
```java
Scanner input = new Scanner(System.in);
String name = input.nextLine();
int units = input.nextInt();
```

**JavaScript** - uses nested callbacks via `readline.question()` since Node.js I/O is asynchronous:
```javascript
readline.question("Enter student name:", (name) => {
    readline.question("Enter number of registered units:", (unitsStr) => {
        const units = parseInt(unitsStr);
        ...
    });
});
```

**C** — uses `scanf` for both inputs; name is stored in a fixed-size char array:
```c
char name[50];
int units;
scanf("%49s", name);
scanf("%d", &units);
```

---

## 2. Conditional Logic

All four versions apply the same threshold (`units > 7`), but the style differs slightly:

**Python, Java, C** use `if/else` blocks:
```python
# Python
if units > 7:
    status = "Overload - Approval Required"
else:
    status = "Registration Accepted"
```

**JavaScript** uses a ternary operator, making it the most compact:
```javascript
let status = units > 7 ? "Overload - Approval Required" : "Registration Accepted";
```

Java also supports the ternary operator, while Python offers an inline `if` expression — both were not used here, keeping all versions readable and beginner-friendly.

---

## 3. Output / String Formatting

**Python** uses f-strings — clean and readable:
```python
print(f"NAME:{name}")
print(f"UNITS:{units}")
print(f"STATUS:{status}")
```

**Java** uses string concatenation with `println`:
```java
System.out.println("NAME:" + name);
System.out.println("UNITS:" + units);
System.out.println("STATUS:" + status);
```

**JavaScript** also uses string concatenation via `console.log`:
```javascript
console.log("NAME:" + name);
console.log("Units registered:" + units);
console.log("Staus:" + status);
```

**C** uses `printf` format specifiers — the most explicit approach:
```c
printf("NAME: %s\n", name);
printf("UNITS: %d\n", units);
printf("STATUS: %s\n", status);
```

---

## 4. Memory & Type Management

- **Python**: Variables are dynamically typed; no memory management needed. `str()` wrapping `input()` is redundant since `input()` already returns a string, but causes no harm.
- **Java**: All variables are statically typed. The `Scanner` object manages the input stream and should be closed when done.
- **JavaScript**: Dynamically typed. `parseInt()` is needed to convert the string input to a number since all `readline` input arrives as a string.
- **C**: Statically typed and manual. The `name` array is allocated on the stack with a fixed size of 50 characters. `scanf("%49s", name)` limits input to 49 characters to prevent buffer overflow.

---

## 5. Code Complexity

Python is the most concise at roughly 10 lines. Java and JavaScript are more wordy due to class structure and callback/object boilerplate respectively. C is the most lenghy due to explicit type declarations, format strings, and pointer-based string handling.

---

## 6. Key Takeaways

1. **Same logic, different ceremony** : the core `if/else` and print statements exist in all four versions; the overhead around them is what differs.
2. **Python is beginner-friendly** : minimal syntax, no compilation step, readable output formatting.
3. **Java enforces structure** : the class wrapper and typed variables add verbosity but make larger programs easier to maintain.
4. **JavaScript's async model** introduces nested callbacks even for simple console I/O — a design choice rooted in its browser origins.
5. **C gives the most control** : fixed buffer sizes, format specifiers, and pointer-based strings require more care but result in the fastest compiled binary.
6. No single language is best : the right choice depends on the use case, team, and environment.
