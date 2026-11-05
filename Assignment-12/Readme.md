# Assignment-12: INSERTION SORT
**Course Code:** BCS351 | **Subject:** Introduction to Programming Using Java Lab
**Student:** SACHIN (Student ID: BCS2025424, Section: E)
**University:** Invertis University, Bareilly

---

## Aim
Sort arrays using insertion sort and count the number of shifts.

## Software / Tools Required
Java Development Kit (JDK), Java IDE or text editor (such as VS Code / IntelliJ IDEA / Notepad), and Command Prompt / Terminal.

## Theory
Insertion sort builds a sorted portion of the array one element at a time. Each new value is compared with earlier values and inserted at its correct position. A shift occurs when an existing value moves one position to the right to make space.

## Algorithm / Procedure
- **Task 1** – Sort an array using insertion sort.
- **Task 2** – Sort a second array using insertion sort.
- **Task 3** – Count shifts during insertion sort.

---

## Program / Queries / Commands & Output

### Task 1 – Sort an array using insertion sort

**Source File:** [`task1_insertion_sort.java`](task1_insertion_sort.java)

```java
import java.util.Arrays;

public class task1_insertion_sort {
    public static void main(String[] args) {
        int[] a = {7, 3, 5, 1};
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) { a[j + 1] = a[j]; j--; }
            a[j + 1] = key;
        }
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}
```

#### Output Preview:

![Task 1 Output](output/task1.png)

```text
Sorted: [1, 3, 5, 7]
```

### Task 2 – Sort a second array using insertion sort

**Source File:** [`task2_insertion_sort_second.java`](task2_insertion_sort_second.java)

```java
import java.util.Arrays;

public class task2_insertion_sort_second {
    public static void main(String[] args) {
        int[] a = {14, 3, 9, 21, 6};
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) { a[j + 1] = a[j]; j--; }
            a[j + 1] = key;
        }
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}
```

#### Output Preview:

![Task 2 Output](output/task2.png)

```text
Sorted: [3, 6, 9, 14, 21]
```

### Task 3 – Count shifts during insertion sort

**Source File:** [`task3_insertion_sort_shifts.java`](task3_insertion_sort_shifts.java)

```java
public class task3_insertion_sort_shifts {
    public static void main(String[] args) {
        int[] a = {6, 5, 4, 3, 2, 1};
        int shifts = 0;
        for (int i = 1; i < a.length; i++) {
            int key = a[i], j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j]; j--; shifts++;
            }
            a[j + 1] = key;
        }
        System.out.println("Shifts: " + shifts);
    }
}
```

#### Output Preview:

![Task 3 Output](output/task3.png)

```text
Shifts: 15
```

---

## Input / Test Data
Values and strings are initialized in the program as specified in the assignment.

## Result
Thus, the experiment 'INSERTION SORT' was performed using Java. The programs were written, compiled, executed, and the expected outputs were obtained.

---

## Viva-Voce Questions with Answers

**Q. What is insertion sort?**  
*Ans.* A sorting algorithm that inserts each element into its correct position in a sorted portion.

**Q. What is a shift?**  
*Ans.* Moving an existing element one position to the right.

**Q. Is insertion sort in-place?**  
*Ans.* Yes, it sorts by rearranging elements in the same array.

