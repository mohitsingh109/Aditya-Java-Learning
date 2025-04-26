
# **MCQs on Java `while` Loop**

## 1. What will be the output of the following program?
```java
public class WhileLoopTest {
    public static void main(String[] args) {
        String str = "hello";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'l') {
                System.out.print(i + " ");
            }
            i += 2;
        }
    }
}
```

**Options:**
- A) 2 4
- B) 2
- C) 2 3 4
- D) No Output

---

## 2. What will be the output of the following program?
```java
public class WhileLoopTest {
    public static void main(String[] args) {
        String str = "Java Programming";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'a' && i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
```

**Options:**
- A) 1 3 5
- B) 0 2
- C) 1 3 8
- D) 0 2 8

---

## 3. What will be the output of the following program?
```java
public class WhileLoopTest {
    public static void main(String[] args) {
        String str = "index";
        int i = 0;
        while (i < str.length()) {
            if (i == str.indexOf('x')) {
                System.out.print("Found ");
            } else {
                System.out.print("Not Found ");
            }
            i++;
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

## 4. What will be the output of the following program?
```java
public class WhileLoopTest {
    public static void main(String[] args) {
        String str = "0123456789";
        int i = 5;
        while (i >= 0) {
            if (str.charAt(i) % 2 == 0) {
                System.out.print(str.charAt(i) + " ");
            }
            i -= 2;
        }
    }
}
```

**Options:**
- A) 4 2 0
- B) 5 3 1
- C) 4 2
- D) 0 2 4 6

---

## 5. What will be the output of the following program?
```java
public class WhileLoopTest {
    public static void main(String[] args) {
        String str = "Loop";
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 'o') {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
```

**Options:**
- A) 1
- B) 2
- C) 3
- D) 0

---

## 6. What will be the output of the following program?
```java
public class WhileLoopTest {
    public static void main(String[] args) {
        String str = "abcdef";
        int i = 1;
        while (i < str.length()) {
            System.out.print(str.charAt(i) + " ");
            i += 3;
        }
    }
}
```

**Options:**
- A) b e
- B) b d f
- C) a d
- D) c f

---

## 7. What will be the output of the following program?
```java
public class WhileLoopTest {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
}
```

**Options:**
- A) 9 6 3
- B) 10 9 6
- C) 12 9 6 3
- D) 9 6 3 0

---
