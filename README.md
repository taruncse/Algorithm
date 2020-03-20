# Algorithm
It's a Java application to implement major Algorithms.


### Selection Sort : 

Description: The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted array and then putting it in its correct position in a sorted array.

Assume that the array A = [2,1,5,9] needs to be sorted in ascending order.

The minimum element in the array i.e. 1 is searched for and then swapped with the element that is currently located at the first position, i.e. 2 . Now the minimum element in the remaining unsorted array is searched for and put in the second position, and so on.

[Read more](https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/tutorial/)

```java

public class Main {

    public static void main(String[] args) {
        int[] unShortedArray = {1,2,6,7,97,2,3,5,7,9};

        sortArray(unShortedArray);
        printArray(unShortedArray);

    }

    private static void sortArray(int[] unSortedArray){

        int arrayLength = unSortedArray.length;

        for (int i=0; i<arrayLength-1; i++){
            int minIndex = i;

            for (int j=i+1; j<arrayLength; j++){
                if (unSortedArray[j] < unSortedArray[minIndex]){
                    minIndex = j;
                }
            }

            int temp = unSortedArray[i];
            unSortedArray[i] = unSortedArray[minIndex];
            unSortedArray[minIndex] = temp;
        }
    }

    private static void printArray(int[]values){
        for (int value:values) {
            System.out.println(value);
        }
    }
}

```
### Minimum swap count to sort an Array

Given an array of n distinct elements, find the minimum number of swaps required to sort the array.


```

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] unSortedArray = {1,3,5,2,4};
        System.out.println(getMinSwapCount(unSortedArray));
    }

    private static int getMinSwapCount(int[] arr){

        int swapCount = 0;
        HashMap<Integer,Integer> cacheValue = new HashMap<>();
        int arrayLength = arr.length;
        boolean [] isVisited = new boolean[arrayLength+1];

        for (int i=1; i<=arrayLength; i++){
            cacheValue.put(i,arr[i-1]);
        }
        for (int j=1; j<=arrayLength; j++){
            int nextNode ;
            if (isVisited[j] == false){

                isVisited[j] = true;
                if (cacheValue.get(j) == j){
                    continue;
                }else {
                    int temp = cacheValue.get(j);
                    while (isVisited[temp] == false){
                        isVisited[temp] = true;
                        nextNode = cacheValue.get(temp);
                        temp = nextNode;
                        swapCount++;
                    }
                }
            }
        }

        return swapCount;
    }
}

```
### Tree:
 Tree represents the nodes connected by edges.
 #### Binary Tree:
 A binary tree is a tree data structure in which each node has at most two children.
 
 #### Binary Search Tree: 
 Binary search trees (BST), sometimes called ordered or sorted binary trees and it has following characteristic.

   * The left sub-tree of a node has a key less than or equal to its parent node's key.
   * The right sub-tree of a node has a key greater than to its parent node's key.
