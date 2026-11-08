# Java DSA

My Java practice programs for data structures and algorithms.

I started with arrays and linked lists and am adding more problems as I practice. The programs in `programs/` are small examples with a `main()` method so I can run them one by one.

## Programs

| Topic | Files |
| --- | --- |
| Arrays | ReverseArray, SecondLargest, RotateArray |
| Searching | LinearSearch, BinarySearch |
| Sorting | BubbleSort, SelectionSort, InsertionSort |
| Linked list | ReverseLinkedList |
| Stack | StackUsingArray |
| Queue | QueueUsingArray |
| Recursion | FactorialRecursion |

All the above files are in the `programs` folder and have a `.java` extension.

## Run a program

With a JDK installed, from the repository folder:

```bash
javac programs/BubbleSort.java
java -cp programs BubbleSort
```

Change `BubbleSort` to whichever program you want to run.

The older `2.java` and `5.java` files are my earlier array and linked-list notes. Their public class names differ from their filenames, so rename them to `StaticArray.java` and `SinglyLinkedList.java` if you want to compile them separately.
