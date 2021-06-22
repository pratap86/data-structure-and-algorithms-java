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
|`BogoSort`||O(N!)||

#### Java Sorting
|Java API|Description|Complexity|
|---|---|---|
|`Arrays.sort()`|uses dual-pivot Quicksort on primitives|O(n log(n))|

#### Quick Sort Algorithms
- Divide and conquer algorithm
- Recursive algorithm
- In Place algorithm
- O(nlogn) - base 2. we're repeatedly partitioning the array into two halves
- Unstable algorithm
- Uses a pivot element to partition the array into two parts(logical division)
- Elements < pivot to its left, elements > pivot to its right
- Pivot will then be in its correct sorted position, now pivot in the middle position and its left side elements are less than pivot nnd right side elements are greater than pivot. But it may be possible that elements in Righ and left sub array are unsorted.
- Process is now repeated for the left sub array and right sub array
- Eventually, every element has been the pivot, so every element will be in its correct sorted position
 
