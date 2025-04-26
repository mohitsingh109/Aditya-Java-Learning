
# **MCQs on Java `for` Loop**

## 1. What will be the output of the following program?
```java
public class ForLoopTest {
    public static void main(String[] args) {
        String str = "hello world";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o' && i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
```

**Options:**
- A) 4
- B) 4 7
- C) 7
- D) No Output

---

## 2. What will be the output of the following program?
```java
public class ForLoopTest {
    public static void main(String[] args) {
        String str = "JAVA";
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
```

**Options:**
- A) JAVA
- B) AVAJ
- C) J A V A
- D) A V A J

---

## 3. What will be the output of the following program?
```java
public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

**Options:**
- A) *****
- B) * ** *** **** *****
- C) *
  **
    ***  
    ****  
    *****  
- D) No Output

---

## 4. What will be the output of the following program?
```java
public class ForLoopTest {
    public static void main(String[] args) {
        String str = "index";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf('x')) {
                System.out.print("Found ");
            } else {
                System.out.print("Not Found ");
            }
        }
    }
}
```

**Options:**
- A) Not Found Not Found Not Found Not Found Found
- B) Not Found Found Found Found Found
- C) Found Not Found Not Found Not Found Not Found
- D) Found Found Found Found Found

---

## 5. What will be the output of the following program?
```java
public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i += 3) {
            System.out.print(i + " ");
        }
    }
}
```

**Options:**
- A) 0 3 6 9
- B) 0 3 6
- C) 0 1 2 3 4 5 6
- D) No Output

---

## 6. What will be the output of the following program?
```java
public class ForLoopTest {
    public static void main(String[] args) {
        String str = "abcdef";
        for (int i = 1; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
```

**Options:**
- A) a c e
- B) b d f
- C) b d
- D) b e

---

## 7. What will be the output of the following program?
```java
public class ForLoopTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

**Options:**
- A) Pyramid Shape
- B) Square Shape
- C) Right Triangle Shape
- D) No Output

---
