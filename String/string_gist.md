# String

## 1. Anagram
- same size, different order of characters
- listen and silent
- Brute: `str2.contains(string(str1 char)) --> not char)`
- Basically check if the char converted to string present in whole of string 2

### Optimal
```java
// count the number of occurrences of each character in both strings
/*
        * replace all non-alphabetic characters with non-spaces + lowercase
        * count[256]
        * Traverse any string
            - count[s1_char_i]++
            - count[s2_char_i]--
        * See basically increase and decrease, if same char there then it'll be 0
*/
```
### Hashing
- Put one string data to map
- Traverse the other string -> check if key exists in map
- Now we are handling if length not same so one number must not be there to make it non-anagram (IMP)
---
## 2. Pangram
- A sentence that contains every letter of the alphabet at least once
- related to alphabets arr[26]
- char - 'a' -> that char as number, in this case index -> Chars represents as Unicode value that align with ASCII values for english letters
- Similarly char - '0' -> that char as a number
- Ex: 'h'-'a' --> 104 - 97 = 7 --> index of h in array
```text
- lowercase
- traverse string
  - check if comes under a-z
    - if yes
        arr[char_i - 'a'] = true -> mark as present -> basically it gives you the position of the alphabet in the array
       
```
- If duplicate chars are there the result space will be > 26, so we can use a 256 size array (enough for all ascii codes)
- Then instead of minus trick -> use isAnagram logic
---
## 3. Find Non-repeating chars

### Using frequency array
```md
- freq[256]
- See if non repeating there then it's frequency will be 1 -> freq[char_i]++
- Now to print and not disturb the order of the string -> **traverse the string not the array**
    - Traverse the string
        - check if freq[char_i] == 1 (as extended ASCII, that position will be 1 due to ++)and char_i != space
            - print (char) char_i

```
---
## 4. Count of all Palindromic Substrings
- acbbd -> a, b, c, b, d, bb, aba,..
- 

---
## 5. Reverse string preserving spaces
- abc de -> edc ba

### Brute-force
- Track space position -> take rev of string w/o space -> fill the new arr, if space then add space + move array position

### Optimal : 2 pointer
- swap when no space , if space in low, low++ or high-- (skip) -> while (low < high) (if low and high points same element, no need to check it stays same)
---
## 6. Remove outermost parenthesis

### Stack
(()())
- '(' is there + st is empty -> so might be outermost -> not my output ans -> push only
- '(' -> st not empty -> so it's not outermost -> add to ans + push
- ')' -> pop corresponding pair('(') from stack -> st is still not empty
- '(' -> st is not empty -> so it's not outermost -> add to ans + push
- ')' -> pop corresponding pair('(') from stack -> st is empty -> so it's outermost -> not my output ans

```md
StringBuilder sb
for while string
    if ch == '(' 
        if st.size() > 0 sb.append(ch)
        st.push(ch)
    else
        pop()
        if st is not empty
            sb.append(ch)


```
### w/o stack
- Not required as valid parenthesis
- instead of tracking opening and closing of every individual parenthesis, we only need to track when a primitive block starts and ends

- Use a counter to track the number of open parentheses ( -> +1, ) -> -1
Same solution think that st empty means count 0
```md
// simplified version
for (int i=0; i<s.length(); i++) {
    if (s.charAt(i) == ')') count--; // remember to do this first
    if (count != 0) sb.append(s.charAt(i));
    if (s.charAt(i) == '(') count++;
} 
/*
- If ()
- if I did ( checking 1st then count = 1 -> I would have added the first ( to sb -> WRONG
*/
```
---

## 7. Atoi
- "-042" -> -42, "0-1" -> 0, "words and 987" -> 0, "3.14159" -> 
- Whitespace: Ignore any leading whitespace (" ").
- Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
- Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
- Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range.
  Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
  Return the integer as the final result.

```java
/*
 * trim first for leading and trailing spaces
 * now flag for -ve and non -ve -> we need flag as when ans is just starting and has 0 value ans = -ans will be 0 only -> same for +ve also
 * ans is first taken as long as we need to check if it is within the range of int
 * -ve or +ve must be 1st so  when i==0 check and update flag -> continue (don't check further simply i++)
 * Now if char is not digit break
 * if range of [0-9] then find the int digit by ch-'0' and update ans = ans*10 + dig
 * if -ve flag is true then check if -ans < Integer.MIN_VALUE return Integer.MIN_VALUE -> also update the ans as -ans
 * if -ve flag is false then check if ans > Integer.MAX_VALUE return Integer.MAX_VALUE
 * Now if not out of range but -ve flag is true then ans = -ans at last and return and in int
        
 */
```



---

## 8. Reverse words in a string
- "the sky is blue" -> "blue is sky the"

### w/o split
- last to 1st traverse but with endIdx. So if endIdx is 15, from 15 -> 0
- Now Skip spaces and find the proper endIdx non-space char
- Check while skipping we must not go less than 0 index
- make startIdx as endIdx. Why?? As we will do substring operation and keep reducing startIdx to find the whole word
    - Now once space encounters(one word finished) or startIdx < 0 (error)
- add the substring to ans -> start+1(as startIdx is not at space), end+1
- if there is already an ans -> add a space then add the substring
- make end as startIdx

```md
sb
end = n - 1;
while (end >= 0) {
    while (end >= 0 && s.charAt(end) == ' ') end--; // Skip spaces
    if (end < 0) break;
    start = end;
    while (start >= 0 && s.charAt(start) != ' ') start--;
    if (ans.length() > 0) ans.append(" ");
    ans.append(s.substring(start + 1, end + 1));
    end = start;
}
return ans.toString();

```

---

## 9. Largest Odd number in string
- '52' -> 5
- '35427' -> 35427
### Brute-force
- Generate all substrings and check if odd and compare with max. Use flag if odd. If flag is not set then return -1

### Optimal
- we know chars stores in ASCII values
- so if char c = '7' then c - '0' = 7 (int) - ascii of '7' is 55 and ascii of '0' is 48 so 55- 48 = 7
- Now we got its corresponding int value so check if odd or not 
- Traverse from last as we need largest odd number
- now substring from 0 to i+1 -> if my last char is odd whole substring is odd
- No need flag as we are traversing from last to first and substring starts from 0
```md
for i -> n-1 to 0
    if (s.charAt(i) - '0') % 2 != 0
        flag = true
        print s.substring(0, i + 1)
        break
print -1
```
---

## 10. Check if string is rotation of another
- "abcde", "cdeab" => o/p: true
- `return s.length() == goal.length() && (s+s).contains(goal)`
---
## 11. All rotations of a string
- geeks -> geeks, eeksg, eksge, kgees, ggees
- `print s.substring(i) + s.substring(0, i)` or s+s, a loop i=0 till n and `print s.substring(i, i+n)`
---
## 12. Maximum Nested Parentheses Depth
- "(1+(2*3)+((8)/4))+1" -> 3

### Stack
- once '(' -> start finding depth so push it -> once ')' -> that means one pair is done, there can't be more depth so find the max and pop it
- Now one pair is done, there might still be '(' in the stack so start finding depth again
- We can push and find max at the same time also but every time ( is pushed we need to check if max is less than current size of stack

```md
max=0
for i -> 0 to n
    if s[i] == '('
        st.push(s[i])
    else if s[i] == ')'
        if st.size > max -> max = st.size
        st.pop()

```
### w/o stack
- valid parenthesis

```md
count=0
for i -> 0 to n
    if s[i] == '('
        count++
    else if s[i] == ')'
        if count > max -> max = count
        count--
    
```
---

## 13. Roman to Integer 

- L = 50, C = 100, D = 500, M = 1000

- Traverse from end to start as we need to check the previous element for subtraction if needed
- switch to check char `case 'M' -> num = 1000` (assign the value to num), ...
- Now imagine XIV -> so 5 first and prev is 5 now for next iteration i
- next when char is I then check if I is less than V then subtract I from V and update the prev-> If one symbol is less than the symbol at its right, then it is used to subtract ... and so on
- Basically remember: if XIV, when num is I -> minus from ans else + and make prev as num
- could be done using map also
```md
for ...
    switch ...
    if num < prev
        ans -= num
    else
        ans += num
    prev = num

```

---
## 14. Integer to Roman


---

## 15. Sum of beauty of all substrings
- Basically question states that we need to find the beauty of all substrings and sum them up
- Beauty of a string is defined as the difference between the maximum and minimum frequency of a character in it.
- efficient sub-string generation
- 26 size freq array to store the frequency of each character
- traverse the array and calculate the max and min frequency for each substring and add the difference to the count
```md
int count=0;
for (int i=0; i<s.length(); i++) {
    int[] freq = new int[26];
    for (int j=i; j<s.length(); j++) {
        // get the character
        char ch = s.charAt(j);
        // in the freq array, we are storing the frequency of each character
        freq[ch-'a']++;
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        for (int k=0; k<26; k++) {
            if (freq[k] > 0) {
                maxFreq = Math.max(maxFreq, freq[k]);
                minFreq = Math.min(minFreq, freq[k]);
            }
        }
        count += maxFreq - minFreq;
    }
}
return count;

```
---

## 16. Valid Palindrome
- amanaplanacanalpanama is a palindrome

- with regex : `s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase()` then palindrome check
- w/o regex:
```md
start = 0, end = n-1 
so while start <= end -> 
    if char not isLetterOrDigit(char_start) start++
    else if char not isLetterOrDigit(char_end) end--
    else
        if lower(char_start) != lower(char_end) return false
        start++; end--
return true

```
- start < end also true as when start==end obviously palindrome so no need to check but if string is a@a, in this case @ should not be considered
- so start < end gives true as ans. So do start <= end


---
## 17. Valid Palindrome 2


---
## 18. Sort Array according to string length
- s[] = [I, do, Leetcode]
- use `Arrays.sort(arr, (a, b) -> a.length() - b.length())`

---
## 19. Reverse individual words
- Use a stack
- push all words to stack once a space is encountered
  - that means one word is done -> pop and print
- Now while processing last word, string might not end with space so check if stack is not empty at the end
- pop and print if not empty

---
## 20. Capitalize first and last letter of every word
### w/o split
- 1st char and last char of whole string should be capitalized
- Now if we encounter space then we need to capitalize the next char and prev char

---
## 21. Longest Palindromic substring w/o DP
- ["flower","flow","flight"] -> "fl"


---
## 22. Substring with K distinct characters

---
## 23. Longest substring with K distinct characters

---

## 24. Longest Common Prefix

---

