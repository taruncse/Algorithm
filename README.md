# Algorithm
It's a Java application to implement major Algorithms.


### Selection Sort : 

Description: The Selection sort algorithm is based on the idea of finding the minimum or maximum element in an unsorted array and then putting it in its correct position in a sorted array.

Assume that the array A = [2,1,5,9] needs to be sorted in ascending order.

The minimum element in the array i.e. 1 is searched for and then swapped with the element that is currently located at the first position, i.e. 2 . Now the minimum element in the remaining unsorted array is searched for and put in the second position, and so on.

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

### Tree:
 Tree represents the nodes connected by edges.
 #### Binary Tree:
 A binary tree is a tree data structure in which each node has at most two children.
 
 #### Binary Search Tree: 
 Binary search trees (BST), sometimes called ordered or sorted binary trees and it has following characteristic.

   * The left sub-tree of a node has a key less than or equal to its parent node's key.
   * The right sub-tree of a node has a key greater than to its parent node's key.
