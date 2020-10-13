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
|17 |Letter Combinations of a Phone Number| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/PhoneNumberCombinations.java)| Medium| 
|19 |Remove Nth Node From End of List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/RemovedList.java)| Medium| 
|20 |Valid Parentheses| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/stacks/ValidParentheses.java)| Easy| 
|21 |Merge Two Sorted Lists| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/MergeTwoLinkedList.java)| Easy| 
|22 |Generate Parentheses| [Java](https://github.com/strogiyotec/leetcode-oo/blob/50897dfd15580988ba66c474049377bd7e8e9cbb/src/main/java/leetcode/oo/dp/backtracking/GenerateParentheses.java)| Medium| 
|23 |Merge k Sorted Lists| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/sort/MergeSortedLists.java)| Hard| 
|26 |Remove Duplicates from Sorted Array| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/duplicates/RemoveDuplicatesFromArray.java)| Easy| 
|27 |Remove element| [Java](https://github.com/strogiyotec/leetcode-oo/blob/cb713a818445362cb0451500c38adf4496eb304d/src/main/java/leetcode/oo/arrays/RemoveElement.java)| Easy| 
|30|Substring with Concatenation of All Words| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/AllWordsSubstring.java)| Hard|
|32|Longest Valid Parentheses| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/stacks/LongestParentheses.java)| Hard|
|34|Find First and Last Position of Element in Sorted Array| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/FirstAndLast.java)| Medium|
|40|Combination Sum 2| [Java](https://github.com/strogiyotec/leetcode-oo/blob/a1082efd44b06deeea6f60c66c7b0d4dc6c5c4d4/src/main/java/leetcode/oo/dp/backtracking/CombinationSum2.java)| Medium|
|41|First Missing positive| [Java](https://github.com/strogiyotec/leetcode-oo/blob/39fb6d02acb6420c0f8c25a6f976d138f61e3905/src/main/java/leetcode/oo/arrays/MissingPositive.java)| Hard|
|46|Permutations| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/Permutations.java)| Medium|
|51 |M-Queens| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/NQueens.java)| Hard|
|52 |Maximum Subarray| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/sliding/MaxSubArray.java)| Easy|
|55 |Jump Game| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/JumpGame.java)| Medium|
|56 |Merge Intervals| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/MergeIntervals.java)| Medium|
|62 |Unique Paths| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/UniquePaths.java)| Medium|
|63 |Unique Paths 2| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/UniquePathsWithObstacle.java)| Medium|
|64 |Minimum Path Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/MinPathSum.java)| Medium|
|66 |Plus one| [Java](https://github.com/strogiyotec/leetcode-oo/blob/2d3bb11a6194aa522a70bbb8c638b18dfae7e78d/src/main/java/leetcode/oo/arrays/PlusOne.java)| Easy|
|75 |Sort colors| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/SortColors.java)| Medium|
|70 |Climbing Stairs| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/ClimbStairs.java)| Easy|
|76 |Minimum Window Substring| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/MinWindowSubstring.java)| Hard|
|76 |Combinations| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/Combinations.java)| Medium|
|78 |Subsets| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/Subsets.java)| Medium|
|79 |Word Search| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/WordSearch.java)| Medium|
|80 |Remove Duplicates from Sorted Array II| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/duplicates/SortedArrayDup2.java)| Medium|
|83|Remove Duplicates from Sorted List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/RemoveDuplicatesFromList.java)| Easy|
|91|Decode Ways| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/DecodingWays.java)|Medium|
|94|Binary Tree Inorder Traversal| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/traversal/InOrderTraversal.java)|Medium|
|96|Unique Binary Search Trees| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/UniqueTrees.java)|Medium|
|98|Validate Binary Search Tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/ValidBst.java)|Medium|
|101|Symmetric Trees| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/SymmetricTrees.java)|Easy|
|104|Maximum Depth of Binary Tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/NodeDepth.java)|Easy|
|108|Sorted Array to Tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/ArrayToTree.java)|Easy|
|110|Balanced binary tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/BalancedBinaryTree.java)|Easy|
|111|Min depth of binary tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/MinDepthOfTree.java)|Easy|
|112|Path Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/path/PathSum1.java)|Easy|
|113|Path Sum 2| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/path/PathSum2.java)|Medium|
|121|Best Time to Buy and Sell Stock| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/BuyAndSell.java)|Easy|
|124|Binary Tree Maximum Path Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/MaxPathSum.java)|Hard|
|127|Word Ladder| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/WordLadder.java)|Medium|
|128|Longest Consecutive sequence| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/LongestConsSeq.java)|Hard|
|129|Sum Root to Leaf Numbers| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/RootToLeafSum.java)|Medium|
|130|Surrounded Regions| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/SurroundRegions.java)|Medium|
|133|Clone Graph| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/CloneGraph.java)|Medium|
|139|Word Break| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/WordBreak.java)|Medium|
|143|Reorder list| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/ReorderList.java)|Medium|
|146|LRU Cache| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/design/LRUCache.java)|Medium|
|148|Sort list| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/SortList.java)|Medium|
|160|Intersection of Two Linked Lists| [Java](https://github.com/strogiyotec/leetcode-oo/blob/02795e7bb2aa4e958d35ffc48944149dd0aaf161/src/main/java/leetcode/oo/ll/Intersection.java)|Easy|
|167|Two Sum II - Input array is sorted| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/TwoSumSorted.java)|Easy|
|169|Majority element| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/Majority.java)|Easy|
|173|BST iterator| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/design/BSTIterator.java)|Medium|
|187|DNA Sequence| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/DnaSeq.java)|Medium|
|198|House Robber| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/HouseRobber.java)|Easy|
|200|Number of Islands| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/NumberOfIslands.java)|Medium|
|206|Reverse Linked List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/reverse/ReversedList.java)|Easy|
|208|Trie| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/design/Trie.java)|Medium|
|209|Minimum Size Subarray Sum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/MinSizeSubArray.java)|Medium|
|212|Word Search 2| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/WordSearch2.java)|Hard|
|215|Kth Largest element in the array| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/KthLargest.java)|Medium|
|230|Kth Smallest Element in a BST| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/KthSmallest.java)|Medium|
|234|Palindrome Linked List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/7476429b4542c620e83b4586a194baec2075f57d/src/main/java/leetcode/oo/ll/PalindromeLL.java)|Easy|
|239|Sliding Window Maximum| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/window/MaxSlidingWindow.java)|Hard|
|268|Missing number| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/bits/MissingNumber.java)|Easy|
|283|Move zeroes| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/MoveZeroes.java)|Easy|
|298|BINARY TREE LONGEST CONSECUTIVE SEQUENCE| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/LongestConsSeqTree.java)|Medium|
|300|Longest Increasing Subsequence| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/IncreasingSequence.java)|Medium|
|316|Remove duplicate Letters| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/stacks/RemoveDuplicateLetters.java)|Medium|
|322|Coin Change| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/CoinChange.java)|Medium|
|344|Reverse String| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/ReverseString.java)|Easy|
|347|Top k elements| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/TopKElements.java)|Medium|
|349|Intersection of Two Arrays| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/ArraysIntersection.java)|Easy|
|383|Ransom Note| [Java](https://github.com/strogiyotec/leetcode-oo/blob/30acc74a949222ac9a988d79b3a5daacb4b74668/src/main/java/leetcode/oo/strings/RansomNote.java)|Easy|
|394|Decode String| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/stacks/DecodeString.java)|Medium|
|435|Non-overlapping Intervals| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/NonOverlapInterval.java)|Medium|
|443|String Compression| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/CompressString.java)|Easy|
|448|Find All Numbers Disappeared in an Array| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/DisappearedNumbers.java)|Easy|
|520|Detect Capital| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/strings/DetectCapital.java)|Easy|
|538|Convert BST to Greater Tree| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/GreaterTree.java)|Easy|
|583|Delete Operation for Two Strings| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/StrDeleteSteps.java)|Medium|
|647|Palindrome substrings| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/PalindromeSubs.java)|Medium|
|704|Binary Search| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/BinarySearch.java)|Easy|
|718|Maximum Length of Repeated Subarray| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/MaxLengthRepeatedSubArray.java)|Medium|
|746|Min cost climbing| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/MinCostClimbing.java)|Easy|
|767|Reorganize string| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/ReorganizeString.java)|Medium|
|784|Letter case permutations| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/LetterCasePermutations.java)|Medium|
|876|Middle of the Linked List| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/ll/MiddleOfLinked.java)|Easy|
|884|Uncommon Words| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/UncommonWords.java)|Easy|
|886|Possible Bipartition| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/PossibleBiPart.java)|Medium|
|938|Range sum of Bst| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/tree/RangeSumOfBst.java)|Easy|
|977|Squares of a Sorted Array| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/pointers/SquaresSortedArray.java)|Easy|
|994|Rotting Oranges| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/graphs/RottingOranges.java)|Medium|
|1079|Letter Tile Possibilities| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/TilePossibilities.java)|Medium|
|1288|Remove covered intervals| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/RemoveCovered.java)|Medium|
|1143|Longest Common Subsequence| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/backtracking/LCS.java)|Medium|
|1512|Good Pairs| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/GoodPairs.java)|Easy|
|1576|Replace All ?'s to Avoid Consecutive Repeating Characters| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/strings/ReplaceAll.java)|Easy|
|1582|Special position matrix| [Java](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/arrays/SpecialPositionMatrix.java)|Easy|


## Introduction to Algorithms problems

Here is the list of solution for problems from Introduction for Algorithms book by Thomas H. Cormen

1. [Activity selection problem](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/ActivitySelection.java)
2. [Huffman code](https://github.com/strogiyotec/leetcode-oo/blob/master/src/main/java/leetcode/oo/dp/greedy/HuffmanCode.java) , 
