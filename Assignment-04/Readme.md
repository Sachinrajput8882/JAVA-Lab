# Assignment-04: WRITING FUNCTIONS
**Course Code:** BCS351 | **Subject:** Introduction to Programming Using Java Lab
**Student:** SACHIN (Student ID: BCS2025424, Section: E)
**University:** Invertis University, Bareilly

---

## Aim
Write methods with parameters and return values, and call them from main.

## Software / Tools Required
Java Development Kit (JDK), Java IDE or text editor (such as VS Code / IntelliJ IDEA / Notepad), and Command Prompt / Terminal.

## Theory
A method is a named block of code that performs a task. Parameters pass information to a method, and a return statement sends a result back to the caller. The static keyword allows these methods to be called directly from the static main method.

## Algorithm / Procedure
- **Task 1** – Calculate combination nCr.
- **Task 2** – Calculate permutation nPr.
- **Task 3** – Find the larger of two numbers.

---

## Program / Queries / Commands & Output

### Task 1 – Calculate combination nCr

**Source File:** [`task1_combination_nCr.java`](task1_combination_nCr.java)

```java
public class task1_combination_nCr {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static void main(String[] args) {
        System.out.println("5C2 = " + nCr(5, 2));
    }
}
```

#### Output Preview:

![Task 1 Output](output/task1.png)

```text
5C2 = 10
```

### Task 2 – Calculate permutation nPr

**Source File:** [`task2_permutation_nPr.java`](task2_permutation_nPr.java)

```java
public class task2_permutation_nPr {
    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }
    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }
    public static void main(String[] args) {
        System.out.println("5P2 = " + nPr(5, 2));
    }
}
```

#### Output Preview:

![Task 2 Output](output/task2.png)

```text
5P2 = 20
```

### Task 3 – Find the larger of two numbers

**Source File:** [`task3_larger_of_two.java`](task3_larger_of_two.java)

```java
public class task3_larger_of_two {
    static int maxOf(int a, int b) {
        return (a > b) ? a : b;
    }
    public static void main(String[] args) {
        System.out.println("Larger: " + maxOf(14, 9));
    }
}
```

#### Output Preview:

![Task 3 Output](output/task3.png)

```text
Larger: 14
```

---

## Input / Test Data
Values and strings are initialized in the program as specified in the assignment.

## Result
Thus, the experiment 'WRITING FUNCTIONS' was performed using Java. The programs were written, compiled, executed, and the expected outputs were obtained.

---

## Viva-Voce Questions with Answers

**Q. What is a method?**  
*Ans.* A named block of code that performs a particular task.

**Q. What is a parameter?**  
*Ans.* A variable in a method definition that receives an argument.

**Q. What does return do?**  
*Ans.* It sends a value back from a method.

