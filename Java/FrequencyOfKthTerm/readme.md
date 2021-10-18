# Frequency of Kth term in string

A java aprogram, given an array of strings words and an integer k, return the k most frequent strings.
Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

 <hr>
 
![Screenshot (736)](https://user-images.githubusercontent.com/54171759/137788780-11657eaa-ceb7-41f9-9417-a8c3dea0b0bc.png)


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
