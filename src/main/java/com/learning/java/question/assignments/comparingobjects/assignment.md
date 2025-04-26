
# Java Comparing Objects - Multiple Choice Questions

1. **What does `==` compare when used on objects in Java?**
    - A) Values of the objects
    - B) Memory addresses of the objects
    - C) Data types of the objects
    - D) Length of the objects

2. **Given `Rectangle one = new Rectangle(3,7); Rectangle two = one;`, what does `one == two` evaluate to?**
    - A) true
    - B) false
    - C) Depends on the values in `one`
    - D) Compilation error

3. **Which method is used to compare the content of two objects?**
    - A) `compare()`
    - B) `equals()`
    - C) `==`
    - D) `getValue()`

4. **What will `new String("apple") == new String("apple")` return?**
    - A) true
    - B) false
    - C) Depends on the JVM
    - D) Compilation error

5. **How does `equals()` determine equality between two objects?**
    - A) It checks if the objects are at the same memory location
    - B) It compares the data within the objects
    - C) It compares the object types only
    - D) It returns true for all identical types

6. **Which of the following statements is true about the `null` keyword?**
    - A) `null` can be used with primitive types
    - B) `null` signifies that an object has not been initialized
    - C) `null` is equivalent to zero
    - D) `null` is a method to compare objects

7. **In `Rectangle r1 = new Rectangle(5, 8); Rectangle r2 = new Rectangle(5, 8);`, what does `r1.equals(r2)` return if `equals` is not overridden?**
    - A) true
    - B) false
    - C) Compilation error
    - D) Depends on JVM

8. **Which of the following correctly demonstrates logical equality?**
    - A) `if (a == b)`
    - B) `if (a.equals(b))`
    - C) `if (a.compare(b))`
    - D) `if (a.isEqualTo(b))`

9. **What will `new Integer(10).equals(new Integer(10))` return?**
    - A) true
    - B) false
    - C) Depends on JVM
    - D) Compilation error

10. **When are two references considered "aliases" of each other?**
    - A) When they refer to the same object
    - B) When they hold the same value
    - C) When they are of the same type
    - D) When they contain identical data

11. **How would you check if a reference `obj` is null?**
    - A) `obj.isNull()`
    - B) `obj == null`
    - C) `obj.equals(null)`
    - D) `obj == NULL`

12. **Given `String s1 = new String("test"); String s2 = s1;`, what does `s1 == s2` evaluate to?**
    - A) true
    - B) false
    - C) Depends on JVM
    - D) Error

13. **If `str1.equals(str2)` is `true`, what can we infer?**
    - A) `str1` and `str2` point to the same memory location
    - B) `str1` and `str2` are aliases
    - C) `str1` and `str2` contain identical data
    - D) `str1` and `str2` are both null

14. **What does `new Integer(10) == new Integer(10)` return?**
    - A) true
    - B) false
    - C) Depends on JVM
    - D) Compilation error

15. **In Java, which is true about the `==` operator and `equals()` method?**
    - A) Both compare data values within objects
    - B) `==` compares references; `equals()` compares data
    - C) Both check if two objects are aliases
    - D) `==` compares data; `equals()` compares references

16. **What is the output of `System.out.println(new String("abc") == new String("abc"));`?**
    - A) true
    - B) false
    - C) Error
    - D) Depends on JVM

17. **In the statement `str1 == str2`, if `str1` and `str2` are identical string literals, what will be the result?**
    - A) true
    - B) false
    - C) Error
    - D) true only if `str1.equals(str2)`

18. **If `Rectangle one = new Rectangle(5,10);` and `Rectangle two = one;`, what does `one.equals(two)` return?**
    - A) true
    - B) false
    - C) Depends on data in `one` and `two`
    - D) Compilation error

19. **What will `str1 == null` check for if `str1` is a String?**
    - A) If `str1` has been initialized
    - B) If `str1` contains data
    - C) If `str1` has the same value as null
    - D) All of the above

20. **Which statement is correct about comparing two objects `a` and `b` for reference equality?**
    - A) `a.equals(b)`
    - B) `a == b`
    - C) `a.equalsIgnoreCase(b)`
    - D) `a.compareTo(b)`  
