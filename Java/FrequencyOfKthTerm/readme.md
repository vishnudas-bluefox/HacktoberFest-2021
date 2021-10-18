# Frequency Sort 

A java aprogram, given an array of strings words and an integer k, return the k most frequent strings.
Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 <hr>

## Data structures
```
 Heap, HashTables
 ```

<hr>

## Time Complexity

``` 
O(n log k)
```

## Space Complexity

```
O(n)
```
<hr>

### Sample input / output

Test1   : ``` words = ["i","love","leetcode","i","love","coding"], k = 2 ```

Output1 : ``` ["i","love"] ```

Test2   : ```  words = ["the","day","is","sunny","the","the","the","sunny","is","is"], k = 4 ```

Output2 : ``` ["the","is","sunny","day"] ```
