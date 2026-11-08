# Java DSA

My Java practice programs for data structures and algorithms.

I started with arrays and linked lists and am adding more problems as I practice. Most files have their own `main()` method so I can run them separately.

## Basic programs

These are inside `programs/`.

| Topic | Files |
| --- | --- |
| Arrays | ReverseArray, SecondLargest, RotateArray |
| Searching | LinearSearch, BinarySearch |
| Sorting | BubbleSort, SelectionSort, InsertionSort |
| Linked list | ReverseLinkedList |
| Stack | StackUsingArray |
| Queue | QueueUsingArray |
| Recursion | FactorialRecursion |

## Medium problems

These are inside `programs/medium/`.

| Topic | Files |
| --- | --- |
| Arrays / two pointers | ThreeSum, MaximumSubarray, ProductExceptSelf |
| Binary search | SearchRotatedArray |
| HashMap / prefix sum | SubarraySumK, TopKFrequent |
| Sliding window | LongestSubstring |
| Intervals | MergeIntervals |
| Stack | DailyTemperatures |
| Linked list | LinkedListCycleStart, AddTwoNumbers |
| DFS | NumberOfIslands |
| Dynamic programming | CoinChange |
| Backtracking | GenerateParentheses |

## Running the code

With Java installed, from the repo folder:

```bash
javac programs/BubbleSort.java
java -cp programs BubbleSort

javac programs/medium/ThreeSum.java
java -cp programs/medium ThreeSum
```

Each file uses sample values in `main()`. Change the values to try other cases.

The older `2.java` and `5.java` files are my first array and linked-list notes. Their public class names do not match the filenames, so to compile those separately rename them to `StaticArray.java` and `SinglyLinkedList.java`.
