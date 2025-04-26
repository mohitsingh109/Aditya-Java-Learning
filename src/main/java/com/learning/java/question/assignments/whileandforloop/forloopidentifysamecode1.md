
# **MCQs on Java Code Equivalence**

## 1. Consider the following code segment:
```java
int counter = 0;
for (int i = 0; i < 5; i++) {
    counter += i;
}
System.out.println(counter);
```
Which of the following `for` loops would result in the same value of `counter` being printed?

**Options:**

- **A)**
```java
int sum = 0;
for (int i = 1; i <= 4; i++) {
    sum += i;
}
System.out.println(sum);
```

- **B)**
```java
int sum = 0;
for (int i = 0; i < 5; i++) {
    sum += i;
}
System.out.println(sum);
```

- **C)**
```java
int sum = 0;
for (int i = 0; i < 5; i += 2) {
    sum += i;
}
System.out.println(sum);
```

- **D)**
```java
int sum = 0;
for (int i = 5; i > 0; i--) {
    sum += i;
}
System.out.println(sum);
```

---

## 2. Consider the following code segment:
```java
int product = 1;
for (int i = 1; i <= 3; i++) {
    product *= i;
}
System.out.println(product);
```
Which of the following code snippets will print the same result?

**Options:**

- **A)**
```java
int result = 1;
for (int i = 1; i <= 3; i++) {
    result = result * i;
}
System.out.println(result);
```

- **B)**
```java
int result = 1;
for (int i = 1; i < 4; i++) {
    result *= i;
}
System.out.println(result);
```

- **C)**
```java
int result = 1;
for (int i = 2; i <= 4; i++) {
    result *= i;
}
System.out.println(result);
```

- **D)**
```java
int result = 1;
for (int i = 1; i <= 2; i++) {
    result *= i;
}
System.out.println(result);
```

---

## 3. Consider the following code segment:
```java
int sum = 0;
for (int i = 0; i < 4; i++) {
    sum += i * 2;
}
System.out.println(sum);
```
Which of the following loops would print the same result?

**Options:**

- **A)**
```java
int total = 0;
for (int i = 0; i < 8; i += 2) {
    total += i;
}
System.out.println(total);
```

- **B)**
```java
int total = 0;
for (int i = 1; i <= 4; i++) {
    total += i * 2;
}
System.out.println(total);
```

- **C)**
```java
int total = 0;
for (int i = 0; i < 4; i++) {
    total += i * 2;
}
System.out.println(total);
```

- **D)**
```java
int total = 0;
for (int i = 0; i < 4; i++) {
    total += i * 3;
}
System.out.println(total);
```

---
