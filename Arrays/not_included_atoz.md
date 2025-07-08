# Arrays

## #Sorted and Rotated Check

- think about mod
- logic: `arr[i] > arr[i+1 % n]` count++
- return <= 1 -> for [1,1,1] count is 0

---

## #Equilibrium Index

> left sum | ans | right sum (same as left)

#### Total Sum approach

- Find total sum
- total sum - curr elem is equals to leftsum or not
  - if not add that elem in leftSum

---

## #Move zeros to end

- Remember the solution
- if 0 skip
- if not swap non zeros, track prev non zero using j and current non zero by i

```java
j =0
for i -> n-1
  if elem_i not 0
    swap elem_i and elem_j
    j++
```

---

## #Right rotation

#### reverse method

- reverse(low=0, high=n-d-1)
- reverse(n-d, n-1)
- reverse(0, n-1)

---

## #Plus One

- Think about 999 -> all 9 places are 0 and 1 in front extra
- Traverse from right

---

## #Find the repeating: LC-287, 142

### Negation

- arr contains n+1 integers, range [1,n] so definitely oone duplicate is there
- index : abs_arr_i
  mark a_index -ve
  if a_index < 0 -> return index
- as [1,n] so safe to use index as arr[i] instead of arr[i]-1

### LL cycle

slow -> 1 step, fast 2 step

- if meet -> position slow to start elem and then move by 1 step -> again meet -> cycle starting point -> repeated no

---

## #Contains Duplicate - I lc:219

- arr and k given, return true if a_i == a_j and abs(i-j) <= k

### Hashing 1

- map.put(a_i, idx)
- prevIdx = map.get(a_i) when map already contains a_i
- condition check - return true

### Hashing 2 : map.put return type

- map.put(key, val) does 2 things
  - insert/update
  - if key is previously present -> returns the previous value of key
  - if not present -> returns null

### SW

---

## #Intersection of two sorted arrays

## #Product of array except self

### Division method

- Think about zero(s) optimization

### Prefix Sum

- Revise

---

## #Check if majority exists in a sorted array

### Generic

- array is sorted -> check a_i == a_i-1 do count++ and check if count > n/2 -> both if block
  -> if not equals reset count to 1, so this is else block

### BS

---

## #2 Sum closest to target

- Basically sum of two nums that is closest to target
- follow up: [5,2,7,1,4], x=10 => [2,7] as abs diff is > than [4,7]

## Brute

- 2 loops -> take out sum
- Now diff needs to be calculated then update with minDiff also store two elements
- Now diff should be abs diff
  - when determining how close -> the direction (whether greater or lesser to target) doesn't matter.
  - `else if (diff == minDiff) follow up logic`

## 2 pointer O(nlogn + n) | o(1)

- Sort (otherwise how do I know I want sum to be lesser or greater) so that we don't need two loops then perform brute and 2 pointer together
- while left < right because 2 different elements we need to return left <= right be wrong

```java
sort(arr)
left=start and right = end
while (left < right) {
  sum = a_left + a_right
  diff = abs(sum - x)
  if (diff < minDiff) ...
  else if (diff == minDiff) follow up logic
  if (sum < x) -> increase left
  else high--
}
```

## BS

- Sort

---

## #2 sum less than K

- Lesser than K but max sum possible

## 2 pointer

- Again sort -> previous question logic
- same technique only condition here is if sum < x -> derive maxSum and left++(becasue we want maximum possible value)
- else high-- => less than K chahiye so default ke liye high--

## BS

---

## #K diff pairs

- Basically array is given, k is given -> Pair diff should be k
- We don't want every pair (repeatative) like (1,3), (3,1) so why now (smaller, greater)
- ***

## #Min abs diff pairs

---

## #Rearrange array elements by sign

### In-place

---
