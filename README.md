# data-structure-and-algorithms-java

### Sorting Algorithms
- Stable Sorting
  - A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in sorted output as they appear in the input array to be sorted.

|Algorithm|Description|Time Complexity|Is Stable Algorithm|
|---|---|---|---|
|`BubbleSort`|Bubble sort works by swapping adjacent elements if they're not in the desired order.<br> This process repeats from the beginning of the array until all elements are in order.|O(n^2)|Stable|
|`InsertionSort`|The idea behind Insertion Sort is dividing the array into the sorted and unsorted subarrays.|O(n^2)|Stable|
|`SelectionSort`|divides the array into a sorted and unsorted subarray|O(n^2)||
|`MergeSort`|uses recursion to solve the problem of sorting|O(nlog n)|Stable|
|`HeapSort`||O(log n)||
|`QuickSort`|Divide and Conquer algorithm|O(n^2)|Unstable|

#### Java Sorting
|Java API|Description|Complexity|
|---|---|---|
|`Arrays.sort()`|uses dual-pivot Quicksort on primitives|O(n log(n))|
