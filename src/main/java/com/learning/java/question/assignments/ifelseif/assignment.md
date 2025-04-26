## 1) What will be the output if x = 15 and y = 25?
```
if (x > 10 && (y < 30 || x == 20)) {
    if (x + y >= 40) {
        System.out.println("Pass");
    } else if (x + y == 50) {
        System.out.println("Halfway");
    } else {
        System.out.println("Low");
    }
} else {
    System.out.println("Fail");
}
```
- A) Pass
- B) Halfway
- C) Low
- D) Fail

---

## 2) Given String str = "JavaProgramming";, what will be printed?
```
if (str.indexOf("Java") == 0 && str.indexOf("P") > 0) {
    if (str.contains("Programming")) {
        System.out.println("Correct Format");
    } else {
        System.out.println("Incorrect Format");
    }
} else if (str.endsWith("ming")) {
    System.out.println("Partial Match");
} else {
    System.out.println("No Match");
}

```
- A) Correct Format
- B) Incorrect Format
- C) Partial Match
- D) No Match

---

## 3) For the following code, if score = 85 and bonus = 5, what will be the output?
```
if (score > 80) {
    if (score + bonus > 90) {
        System.out.println("Outstanding");
    } else if (score + bonus >= 85 && score + bonus < 90) {
        System.out.println("Excellent");
    } else {
        System.out.println("Good");
    }
} else {
    System.out.println("Average");
}
```
- A) Outstanding
- B) Excellent
- C) Good
- D) Average

---

## 4) Given the code below, what will be the output if x = 3, y = 5, and z = 7?
```
if (x + y > z) {
    if (x * y < z) {
        System.out.println("Condition 1");
    } else if (z % x == 1) {
        System.out.println("Condition 2");
    } else {
        System.out.println("Condition 3");
    }
} else {
    System.out.println("Condition 4");
}
```
- A) Condition 1
- B) Condition 2
- C) Condition 3
- D) Condition 4

---

## 5) What will be the output if a = 6, b = 2, and c = -4?
```
if (a > b && b > c) {
    if (a + c > 0) {
        System.out.println("Positive");
    } else if (b + c < 0) {
        System.out.println("Mixed");
    } else {
        System.out.println("All Positive");
    }
} else {
    System.out.println("Non-positive");
}
```
- A) Positive
- B) Mixed
- C) All Positive
- D) Non-positive

---
## 6) If input = "Java Programming";, what will be printed by this code?
```
if (input.startsWith("Java")) {
    if (input.contains("Program") && input.endsWith("g")) {
        System.out.println("Correct");
    } else {
        System.out.println("Incomplete");
    }
} else {
    System.out.println("Incorrect");
}
```
- A) Correct
- B) Incomplete
- C) Incorrect
- D) Error
---

## 7) Given str = "Hello World!";, what will be the output?
```
if (str.length() > 10) {
    if (str.indexOf("World") > 5) {
        System.out.println("Contains World");
    } else {
        System.out.println("Short String");
    }
} else {
    System.out.println("Small String");
}
```
- A) Contains World
- B) Short String
- C) Small String
- D) Error

---

## 8) For the code below, what will the output be if val = -10 and num = 15?
```
if (val < 0) {
    if (num > 10) {
        if ((val + num) % 5 == 0) {
            System.out.println("Divisible");
        } else {
            System.out.println("Not Divisible");
        }
    } else {
        System.out.println("Low Number");
    }
} else {
    System.out.println("Positive Value");
}
```
- A) Divisible
- B) Not Divisible
- C) Low Number
- D) Positive Value

---

## 9) What will be printed if num = 18 and flag = true?
```
if (num % 3 == 0) {
    if (flag && num % 6 == 0) {
        System.out.println("Multiple of 6");
    } else if (!flag) {
        System.out.println("Multiple of 3");
    } else {
        System.out.println("Only 3");
    }
} else {
    System.out.println("Not a Multiple");
}
```
- A) Multiple of 6
- B) Multiple of 3
- C) Only 3
- D) Not a Multiple

---

## 10) Given str1 = "Data" and str2 = "DATA", what will the following code output?
```
if (str1.equalsIgnoreCase(str2)) {
    if (str1.length() == str2.length() && str1.indexOf("D") == 0) {
        System.out.println("Match");
    } else {
        System.out.println("Partial Match");
    }
} else {
    System.out.println("No Match");
}
```
- A) Match
- B) Partial Match
- C) No Match
- D) Error
---

## 11) What will be printed if x = 4, y = 8, and z = 16?
```
if (x * 2 == y) {
    if (y * 2 == z) {
        System.out.println("Double Chain");
    } else if (z / x == 4) {
        System.out.println("Half Chain");
    } else {
        System.out.println("Chain Broken");
    }
} else {
    System.out.println("No Chain");
}
```
- A) Double Chain
- B) Half Chain
- C) Chain Broken
- D) No Chain

---
## 12) Given the code below, what will be the output if temp = -5 and state = "solid"?
```
if (temp < 0) {
    if (state.equals("solid")) {
        System.out.println("Frozen Solid");
    } else if (state.equals("liquid")) {
        System.out.println("Cold Liquid");
    } else {
        System.out.println("Unknown State");
    }
} else {
    System.out.println("Above Freezing");
}
```
- A) Frozen Solid
- B) Cold Liquid
- C) Unknown State
- D) Above Freezing

---
## 13) For the code below, what will the output be if str = "abcdef"?
```
if (str.length() > 5) {
    if (str.indexOf("a") == 0 && str.indexOf("f") == 5) {
        System.out.println("Exact Match");
    } else if (str.indexOf("c") > 1) {
        System.out.println("Partial Match");
    } else {
        System.out.println("No Match");
    }
} else {
    System.out.println("Too Short");
}
```
- A) Exact Match
- B) Partial Match
- C) No Match
- D) Too Short
---
## 14) What will be printed if a = 5, b = 10, and c = 15?
```
if (a + b > c) {
    if (b + c > a) {
        if (a + c > b) {
            System.out.println("Triangle Possible");
        } else {
            System.out.println("Triangle Not Possible");
        }
    } else {
        System.out.println("Invalid Sides");
    }
} else {
    System.out.println("Invalid Sides");
}
```
- A) Triangle Possible
- B) Triangle Not Possible
- C) Invalid Sides
- D) No output
---
## 15) For the code below, what will be the output if day = "Monday" and hour = 9?
```
if (day.equals("Monday") || day.equals("Wednesday")) {
    if (hour < 12) {
        System.out.println("Morning Session");
    } else {
        System.out.println("Afternoon Session");
    }
} else if (day.equals("Friday")) {
    System.out.println("Special Session");
} else {
    System.out.println("No Session");
}
```
- A) Morning Session
- B) Afternoon Session
- C) Special Session
- D) No Session
---

## 16) What will be printed if str = "abcabc"?
```
if (str.startsWith("abc")) {
    if (str.indexOf("abc", 1) > 0) {
        System.out.println("Repeating Pattern");
    } else {
        System.out.println("Pattern Found");
    }
} else {
    System.out.println("No Pattern");
}
```
- A) Repeating Pattern
- B) Pattern Found
- C) No Pattern
- D) Error
---
## 17) Which of the following code snippets will produce the same output as the following program?
```
if (x > 10) {
    System.out.println("High");
} else if (x > 5) {
    System.out.println("Medium");
} else {
    System.out.println("Low");
}

```
- A) if (x > 10) { System.out.println("High"); } else if (x >= 5) { System.out.println("Medium"); } else { System.out.println("Low"); }
- B) if (x > 10) { System.out.println("High"); } else if (x <= 5) { System.out.println("Low"); } else { System.out.println("Medium"); }
- C) if (x > 5) { System.out.println("Medium"); } else if (x > 10) { System.out.println("High"); } else { System.out.println("Low"); }
- D) if (x <= 5) { System.out.println("Low"); } else if (x > 5 && x <= 10) { System.out.println("Medium"); } else { System.out.println("High"); }

---
## 18) Which alternative code block produces the same output as the following code?
```
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("D");
}
```
- A) if (score >= 90) { System.out.println("A"); } else if (score >= 70) { System.out.println("C"); } else if (score >= 80) { System.out.println("B"); } else { System.out.println("D"); }
- B) if (score < 70) { System.out.println("D"); } else if (score < 80) { System.out.println("C"); } else if (score < 90) { System.out.println("B"); } else { System.out.println("A"); }
- C) if (score >= 90) { System.out.println("A"); } else if (score >= 80) { System.out.println("B"); } else { System.out.println("C"); }
- D) if (score < 90) { System.out.println("D"); } else if (score < 80) { System.out.println("B"); } else if (score < 70) { System.out.println("C"); }

---

## 19) Which of the following has the same output as this nested if-else block?
```
if (a > 0) {
    if (a % 2 == 0) {
        System.out.println("Positive Even");
    } else {
        System.out.println("Positive Odd");
    }
} else {
    System.out.println("Non-Positive");
}
```

- A) if (a > 0 && a % 2 == 0) { System.out.println("Positive Even"); } else if (a > 0 && a % 2 != 0) { System.out.println("Positive Odd"); } else { System.out.println("Non-Positive"); }
- B) if (a % 2 == 0) { System.out.println("Positive Even"); } else if (a > 0) { System.out.println("Positive Odd"); } else { System.out.println("Non-Positive"); }
- C) if (a > 0 || a % 2 == 0) { System.out.println("Positive Even"); } else if (a % 2 != 0) { System.out.println("Positive Odd"); } else { System.out.println("Non-Positive"); }
- D) if (a % 2 == 0 && a > 0) { System.out.println("Positive Even"); } else { System.out.println("Non-Positive"); }

---

## 20) Which code produces the same result as the following nested if-else?
```
if (flag) {
    if (value > 0) {
        System.out.println("Positive");
    } else {
        System.out.println("Non-Positive");
    }
} else {
    System.out.println("Flag not set");
}
```
- A) if (flag && value > 0) { System.out.println("Positive"); } else if (flag && value <= 0) { System.out.println("Non-Positive"); } else { System.out.println("Flag not set"); }
- B) if (flag) { System.out.println("Positive"); } else if (!flag) { System.out.println("Non-Positive"); } else { System.out.println("Flag not set"); }
- C) if (!flag) { System.out.println("Flag not set"); } else if (value > 0) { System.out.println("Positive"); } else { System.out.println("Non-Positive"); }
- D) if (value > 0) { System.out.println("Positive"); } else { System.out.println("Non-Positive"); }

---

## 21) Which of the following code snippets will produce the same output as the following program?
```
boolean isSunny = true;
boolean isWarm = false;
if (isSunny && isWarm) {
    System.out.println("It's a beautiful day!");
} else if (isSunny && !isWarm) {
    System.out.println("It's sunny but chilly.");
} else {
    System.out.println("Not a great day.");
}
```
- A) if (isSunny || isWarm) { System.out.println("It's a beautiful day!"); } else { System.out.println("Not a great day."); }
- B) if (isSunny && isWarm) { System.out.println("It's a beautiful day!"); } else { System.out.println("Not a great day."); }
- C) if (isSunny) { if (isWarm) { System.out.println("It's a beautiful day!"); } else { System.out.println("It's sunny but chilly."); } } else { System.out.println("Not a great day."); }
- D) if (isSunny && !isWarm) { System.out.println("It's sunny but chilly."); } else { System.out.println("Not a great day."); }

---

## 22) Which of the following code blocks produces the same output as the following code?
```
boolean hasPermission = true;
boolean isAdmin = false;
if (hasPermission || isAdmin) {
    System.out.println("Access granted.");
} else {
    System.out.println("Access denied.");
}
```
- A) if (hasPermission && isAdmin) { System.out.println("Access granted."); } else { System.out.println("Access denied."); }
- B) if (hasPermission) { System.out.println("Access granted."); } else if (isAdmin) { System.out.println("Access granted."); } else { System.out.println("Access denied."); }
- C) if (!hasPermission && !isAdmin) { System.out.println("Access denied."); } else { System.out.println("Access granted."); }
- D) if (hasPermission && isAdmin) { System.out.println("Access denied."); } else { System.out.println("Access granted."); }

---

## 23) Which code snippet will produce the same output as the one below?
```
boolean isOn = true;
boolean isPluggedIn = false;
if (isOn && isPluggedIn) {
    System.out.println("The device is operating.");
} else if (isOn && !isPluggedIn) {
    System.out.println("The device is on, but not plugged in.");
} else {
    System.out.println("The device is off.");
}
```
- A) if (isOn && isPluggedIn) { System.out.println("The device is operating."); } else { System.out.println("The device is off."); }
- B) if (isOn) { if (isPluggedIn) { System.out.println("The device is operating."); } else { System.out.println("The device is on, but not plugged in."); } } else { System.out.println("The device is off."); }
- C) if (!isOn || isPluggedIn) { System.out.println("The device is off."); } else { System.out.println("The device is operating."); }
- D) if (isOn && !isPluggedIn) { System.out.println("The device is off."); } else { System.out.println("The device is operating."); }

---

## 24) Consider the following two programs. Which of the following statements is correct?
```
Program 1:
int x = 15;
if (x > 10) {
    System.out.println("High");
} else if (x == 10) {
    System.out.println("Equal");
} else {
    System.out.println("Low");
}

Program 2:
int x = 15;
if (x >= 10) {
    if (x == 10) {
        System.out.println("Equal");
    } else {
        System.out.println("High");
    }
} else {
    System.out.println("Low");
}
```
- A) Both programs will output "High" for x = 15.
- B) Program 1 will output "Equal" for x = 15, while Program 2 will output "High".
- C) Program 1 outputs "Low" for x < 10, but Program 2 does not.
- D) Program 2 will output "Low" for x = 15, but Program 1 will output "High".

---

## 25) Consider the following two programs. Which of the following statements is correct?
```
Program 1:
int score = 75;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("D");
}

Program 2:
int score = 75;
if (score >= 70) {
    System.out.println("C");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 90) {
    System.out.println("A");
} else {
    System.out.println("D");
}
```
- A) Program 1 will output "C" while Program 2 will output "B" for score = 75.
- B) Both programs will output "C" for score = 75.
- C) Program 2 will output "D" for score = 75, while Program 1 will output "C".
- D) Program 1 will output "D" for score < 70, while Program 2 will output "C".
