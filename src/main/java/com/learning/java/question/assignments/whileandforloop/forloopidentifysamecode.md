
# **MCQs on Java `for` Loop - Code Comparison**

## 1. Which of the following code snippets will produce the same output as the given code?

**Given Code:**
```java
public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
    }
}
```

**Options:**
- A)
    ```java
    for (int i = 0; i <= 8; i += 2) {
        System.out.print(i + " ");
    }
    ```
- B)
    ```java
    for (int i = 1; i < 10; i += 2) {
        System.out.print((i - 1) + " ");
    }
    ```
- C)
    ```java
    for (int i = 0; i < 12; i += 2) {
        if (i < 10) {
            System.out.print(i + " ");
        }
    }
    ```
- D)
    ```java
    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
            System.out.print(i + " ");
        }
    }
    ```

---

## 2. Which of the following code snippets will produce the same output as the given code?

**Given Code:**
```java
public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            System.out.print((i * 2) + " ");
        }
    }
}
```

**Options:**
- A)
    ```java
    for (int i = 10; i >= 2; i -= 2) {
        System.out.print(i + " ");
    }
    ```
- B)
    ```java
    for (int i = 5; i >= 1; i--) {
        System.out.print((2 * i) + " ");
    }
    ```
- C)
    ```java
    for (int i = 1; i <= 5; i++) {
        System.out.print((12 - 2 * i) + " ");
    }
    ```
- D)
    ```java
    for (int i = 0; i < 5; i++) {
        System.out.print((10 - 2 * i) + " ");
    }
    ```

---

## 3. Which of the following code snippets will produce the same output as the given code?

**Given Code:**
```java
public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

**Options:**
- A)
    ```java
    for (int i = 1; i <= 4; i++) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```
- B)
    ```java
    for (int i = 4; i >= 1; i--) {
        for (int j = 4; j >= i; j--) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```
- C)
    ```java
    for (int i = 1; i <= 4; i++) {
        System.out.println("*".repeat(i));
    }
    ```
- D)
    ```java
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    ```

---
