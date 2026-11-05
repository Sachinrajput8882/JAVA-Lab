# Assignment-02: DECISIONS AND LOOPS WITH NUMBERS
**Course Code:** BCS351 | **Subject:** Introduction to Programming Using Java Lab
**Student:** SACHIN (Student ID: BCS2025424, Section: E)
**University:** Invertis University, Bareilly

---

## Aim
Use if, else-if and loops to make decisions and repeat steps with whole numbers.

## Software / Tools Required
Java Development Kit (JDK), Java IDE or text editor (such as VS Code / IntelliJ IDEA / Notepad), and Command Prompt / Terminal.

## Theory
The if-else statement selects a block based on a condition. An else-if ladder checks multiple conditions in sequence. The modulo operator (%) finds a remainder and is useful for checking divisibility. Loops repeat statements; a for loop is suitable when the number of repetitions is known.

## Algorithm / Procedure
- **Task 1** – Check whether a number is even or odd.
- **Task 2** – Display grade using an else-if ladder.
- **Task 3** – Check whether a year is a leap year.
- **Task 4** – Find factorial using a for loop.

---

## Program / Queries / Commands & Output

### Task 1 – Check whether a number is even or odd

**Source File:** [`task1_even_or_odd.java`](task1_even_or_odd.java)

```java
public class task1_even_or_odd {
    public static void main(String[] args) {
        int n = 27;
        if (n % 2 == 0)
            System.out.println(n + " is even");
        else
            System.out.println(n + " is odd");
    }
}
```

#### Output Preview:

![Task 1 Output](output/task1.png)

```text
27 is odd
```

### Task 2 – Display grade using an else-if ladder

**Source File:** [`task2_grade_calculator.java`](task2_grade_calculator.java)

```java
public class task2_grade_calculator {
    public static void main(String[] args) {
        int marks = 83;
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}
```

#### Output Preview:

![Task 2 Output](output/task2.png)

```text
Grade: B
```

### Task 3 – Check whether a year is a leap year

**Source File:** [`task3_leap_year.java`](task3_leap_year.java)

```java
public class task3_leap_year {
    public static void main(String[] args) {
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
```

#### Output Preview:

![Task 3 Output](output/task3.png)

```text
Leap year
```

### Task 4 – Find factorial using a for loop

**Source File:** [`task4_factorial.java`](task4_factorial.java)

```java
public class task4_factorial {
    public static void main(String[] args) {
        int fact = 1;
        for (int i = 1; i <= 5; i++) fact *= i;
        System.out.println("Factorial of 5 is " + fact);
    }
}
```

#### Output Preview:

![Task 4 Output](output/task4.png)

```text
Factorial of 5 is 120
```

---

## Input / Test Data
Values and strings are initialized in the program as specified in the assignment.

## Result
Thus, the experiment 'DECISIONS AND LOOPS WITH NUMBERS' was performed using Java. The programs were written, compiled, executed, and the expected outputs were obtained.

---

## Viva-Voce Questions with Answers

**Q. What is an if-else statement?**  
*Ans.* It selects one of two code blocks based on a condition.

**Q. What does the % operator return?**  
*Ans.* It returns the remainder after division.

**Q. What is a loop?**  
*Ans.* A loop repeats a block of statements.

