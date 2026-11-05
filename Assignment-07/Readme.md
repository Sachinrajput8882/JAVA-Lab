# Assignment-07: COUNTING STEPS AND COMPLEXITY
**Course Code:** BCS351 | **Subject:** Introduction to Programming Using Java Lab
**Student:** SACHIN (Student ID: BCS2025424, Section: E)
**University:** Invertis University, Bareilly

---

## Aim
Count loop iterations and state the time complexity of each approach.

## Software / Tools Required
Java Development Kit (JDK), Java IDE or text editor (such as VS Code / IntelliJ IDEA / Notepad), and Command Prompt / Terminal.

## Theory
Time complexity describes how the number of operations grows with input size. A single loop that visits n elements has O(n) time complexity. Two nested loops that each run n times have O(n²) complexity. Repeatedly halving a value has O(log n) complexity.

## Algorithm / Procedure
- **Task 1** – Count iterations of one loop.
- **Task 2** – Count iterations of nested loops.
- **Task 3** – Count repeated halving steps.

---

## Program / Queries / Commands & Output

### Task 1 – Count iterations of one loop

**Source File:** [`task1_single_loop_steps.java`](task1_single_loop_steps.java)

```java
public class task1_single_loop_steps {
    public static void main(String[] args) {
        // Time Complexity: O(n)
        int steps = 0;
        for (int i = 1; i <= 10; i++) steps++;
        System.out.println("Steps: " + steps);
    }
}
```

#### Output Preview:

![Task 1 Output](output/task1.png)

```text
Steps: 10
```

### Task 2 – Count iterations of nested loops

**Source File:** [`task2_nested_loop_steps.java`](task2_nested_loop_steps.java)

```java
public class task2_nested_loop_steps {
    public static void main(String[] args) {
        // Time Complexity: O(n^2)
        int steps = 0;
        for (int i = 1; i <= 10; i++)
            for (int j = 1; j <= 10; j++) steps++;
        System.out.println("Steps: " + steps);
    }
}
```

#### Output Preview:

![Task 2 Output](output/task2.png)

```text
Steps: 100
```

### Task 3 – Count repeated halving steps

**Source File:** [`task3_logarithmic_steps.java`](task3_logarithmic_steps.java)

```java
public class task3_logarithmic_steps {
    public static void main(String[] args) {
        // Time Complexity: O(log n)
        int n = 1024, steps = 0;
        while (n > 1) { n /= 2; steps++; }
        System.out.println("Halving steps: " + steps);
    }
}
```

#### Output Preview:

![Task 3 Output](output/task3.png)

```text
Halving steps: 10
```

---

## Input / Test Data
Values and strings are initialized in the program as specified in the assignment.

## Result
Thus, the experiment 'COUNTING STEPS AND COMPLEXITY' was performed using Java. The programs were written, compiled, executed, and the expected outputs were obtained.

---

## Viva-Voce Questions with Answers

**Q. What is time complexity?**  
*Ans.* It describes how an algorithm's running time grows with input size.

**Q. What is the complexity of one loop over n items?**  
*Ans.* O(n).

**Q. What is the complexity of two nested n-sized loops?**  
*Ans.* O(n²).

