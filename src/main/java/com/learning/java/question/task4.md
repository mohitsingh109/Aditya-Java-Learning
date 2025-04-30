# AP Computer Science A – Practice Free Response Questions

---

## Question 1: Study Room Scheduler

You are given a class `StudyRoomSchedule` that manages reservations for study rooms. Each room operates for 10 hours per day (from hour 0 to 9), and each hour contains 60 minutes (minute 0 to 59). Minutes can be booked or free.

### (a) Method: `findAvailableSlot(int hour, int duration)`
- Returns the starting minute of the first block of `duration` consecutive free minutes in the given `hour`.
- If no such block is available, return -1.

**Example:**
```java
findAvailableSlot(3, 15); // returns 20 if minutes 20–34 are free in hour 3
findAvailableSlot(3, 70); // returns -1
```

### (b) Method: `bookSlot(int startHour, int endHour, int duration)`
- Searches from `startHour` to `endHour` (inclusive) for a block of available minutes.
- If found, reserves the block and returns `true`.
- If not found, returns `false`.

**Example:**
```java
bookSlot(2, 4, 20); // returns true and books earliest 20-min block
bookSlot(2, 4, 90); // returns false
```

---

## Question 2: Display Banner

Create a class `Banner` that formats a message for display on a scrolling signboard. The message is displayed in fixed-width rows, broken into substrings of the specified length, ignoring spaces.

### (a) Constructor: `Banner(String message, int width)`

### (b) Method: `int numberOfRows()`
- Returns how many rows are required to display the message.

### (c) Method: `String getRows()`
- Returns the message broken into rows of length `width`, separated by semicolons (`;`).
- If message is empty, return `null`.

**Example:**
```java
Banner b = new Banner("Everything on sale!", 10);
b.numberOfRows(); // returns 2
b.getRows();      // returns "Everything ;on sale!"
```

---

## Question 3: Student Grades

Create a `StudentGrades` class that holds a list of numeric grades. You will clean out invalid entries and find improvement trends.

### (a) Method: `void removeOutliers(double low, double high)`
- Removes any grade < `low` or > `high`.

**Example:**
```java
grades = [50.0, 89.5, 100.2, 105.0, 76.0]
removeOutliers(60.0, 100.0);
// grades becomes [89.5, 100.2, 76.0]
```

### (b) Method: `double highestImprovement()`
- Returns the greatest increase between two consecutive increasing scores.

**Example:**
```java
grades = [70.0, 72.0, 85.0, 60.0, 65.0]
highestImprovement(); // returns 13.0 (72.0 to 85.0)
```

---

## Question 4: Candy Machine

Create a `CandyMachine` class representing a grid of candy. Each cell contains a `Candy` object or is `null`. Each `Candy` has a `getType()` method returning a `String`.

### (a) Method: `boolean moveToTop(int col)`
- If row 0 in `col` is empty and some lower row has candy, move one up to row 0.
- Return `true` if a move happened or row 0 was already full; otherwise, `false`.

### (b) Method: `Candy collectFirstType(String type)`
- Search the grid bottom-to-top, left-to-right, and remove the first `Candy` with matching type.
- Return the candy if found; otherwise, return `null`.

**Example:**
```java
collectFirstType("cherry"); // returns Candy object and clears its slot
collectFirstType("banana"); // returns null if not found
```

---

## Question 5: Temperature Monitor

Create a `TemperatureMonitor` class that stores hourly temperature readings in a list.

### (a) Method: `void filter(double min, double max)`
- Removes all readings outside the range `[min, max]`.

### (b) Method: `int countAboveStreak(double threshold)`
- Returns the length of the longest consecutive sequence of temperatures above `threshold`.

**Example:**
```java
temps = [97.0, 99.0, 101.0, 102.0, 89.0, 103.0]
countAboveStreak(100.0); // returns 2 (101.0 -> 102.0)
```

---
