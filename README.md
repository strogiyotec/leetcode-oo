# leetcode-oo
Storage of solutions for leetcode solutions written in Java 

## Introduction

This repository contains a list of [leetcode](https://leetcode.com) solutions.

## Motivation 

There are plenty of github repositories with solutions by a lot greet developers. Why another one ?
Well most of solutions were written with no readability in mind. I was not able to find a single repository where author wrote
readable code with comments and test. Moreover, all solutions don't follow to any code conventions [checkstyle](https://www.oracle.com/technetwork/java/codeconvtoc-136057.html)

## Principles 

Each implementation in this repository follows code conventions configured in [checkstyle.xml](https://github.com/strogiyotec/leetcode-oo/blob/master/checkstyle.xml)
and each implementation has tests written using [JUnit](https://junit.org/junit5/)


| # | Title | Solution | Difficulty |
|---| ----- | -------- | ---------- |
|1 |Two Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/TwoSum.java)| Easy| 
|3 |Longest Substring Without Repeating Characters| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/LongestUniqueChars.java)| Medium| 
|5 |Longest Palindromic Substring| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/LPS.java)| Medium| 
|11 |Container With Most Water| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/ContainerArea.java)| Medium| 
|14 |Longest Common Prefix| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/LongestPrefix.java)| Easy| 
|15 |3Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/ThreeSum.java)| Medium| 
|19 |Remove Nth Node From End of List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/RemovedList.java)| Medium| 
|20 |Valid Parentheses| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/stacks/ValidParentheses.java)| Easy| 
|21 |Merge Two Sorted Lists| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/MergeTwoLinkedList.java)| Easy| 
|23 |Merge k Sorted Lists| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/sort/MergeSortedLists.java)| Hard| 
|26 |Remove Duplicates from Sorted Array| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/duplicates/RemoveDuplicatesFromArray.java)| Easy| 
|30|Substring with Concatenation of All Words| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/AllWordsSubstring.java)| Hard|
|32|Longest Valid Parentheses| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/stacks/LongestParentheses.java)| Hard|
|39|Combination Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/CombinationSum.java)| Medium|
|40|Combination Sum 2| [Java](https://github.com/strogiyotec/leetcode-oo/blob/a1082efd44b06deeea6f60c66c7b0d4dc6c5c4d4/src/main/java/leetcode/oo/dp/backtracking/CombinationSum2.java)| Medium|
|52 |Maximum Subarray| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/sliding/MaxSubArray.java)| Easy|
|62 |Unique Paths| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/UniquePaths.java)| Medium|
|63 |Unique Paths 2| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/UniquePathsWithObstacle.java)| Medium|
|64 |Minimum Path Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/MinPathSum.java)| Medium|
|75 |Sort colors| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/SortColors.java)| Medium|
|70 |Climbing Stairs| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/ClimbStairs.java)| Easy|
|76 |Minimum Window Substring| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/MinWindowSubstring.java)| Hard|
|79 |Word Search| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/WordSearch.java)| Medium|
|80 |Remove Duplicates from Sorted Array II| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/duplicates/SortedArrayDup2.java)| Medium|
|83|Remove Duplicates from Sorted List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/RemoveDuplicatesFromList.java)| Easy|
|91|Decode Ways| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/DecodingWays.java)|Medium|
|94|Binary Tree Inorder Traversal| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/traversal/InOrderTraversal.java)|Medium|
|98|Validate Binary Search Tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/ValidBst.java)|Medium|
|121|Best Time to Buy and Sell Stock| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/BuyAndSell.java)|Easy|
|128|Longest Consecutive sequence| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/LongestConsSeq.java)|Hard|
|139|Word Break| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/WordBreak.java)|Medium|
|146|LRU Cache| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/design/LRUCache.java)|Medium|
|167|Two Sum II - Input array is sorted| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/TwoSumSorted.java)|Easy|
|198|House Robber| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/HouseRobber.java)|Easy|
|200|Number of Islands| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/NumberOfIslands.java)|Medium|
|206|Reverse Linked List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/reverse/ReversedList.java)|Easy|
|208|Trie| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/design/Trie.java)|Medium|
|209|Minimum Size Subarray Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/MinSizeSubArray.java)|Medium|
|239|Sliding Window Maximum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/MaxSlidingWindow.java)|Hard|
|283|Move zeroes| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/MoveZeroes.java)|Easy|
|300|Longest Increasing Subsequence| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/IncreasingSequence.java)|Medium|
|322|Coin Change| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/CoinChange.java)|Medium|
|344|Reverse String| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/ReverseString.java)|Easy|
|347|Top k elements| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/TopKElements.java)|Medium|
|349|Intersection of Two Arrays| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/ArraysIntersection.java)|Easy|
|435|Non-overlapping Intervals| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/NonOverlapInterval.java)|Medium|
|520|Detect Capital| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/strings/DetectCapital.java)|Easy|
|538|Convert BST to Greater Tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/GreaterTree.java)|Easy|
|583|Delete Operation for Two Strings| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/StrDeleteSteps.java)|Medium|
|767|Reorganize string| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/ReorganizeString.java)|Medium|
|876|Middle of the Linked List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/MiddleOfLinked.java)|Easy|
|977|Squares of a Sorted Array| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/SquaresSortedArray.java)|Easy|
|994|Rotting Oranges| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/RottingOranges.java)|Medium|
|1143|Longest Common Subsequence| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/LCS.java)|Medium|


## Introduction to Algorithms problems

Here is the list of solution for problems from Introduction for Algorithms book by Thomas H. Cormen

1. [Activity selection problem](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/ActivitySelection.java)
2. [Huffman code](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/HuffmanCode.java) , 
