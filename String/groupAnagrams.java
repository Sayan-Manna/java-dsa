package String;

import java.util.*;

public class groupAnagrams {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int map[]=new int[26];
        for(char x : s.toCharArray()){
            map[x-'a']++;
        }
        for(char x : t.toCharArray()){
            map[x-'a']--;
        }
        for(int i:map){
            if (i!=0){
                return false;
            }
        }
        return true;
    }
    public static String generateFreqString(String s) {
        int[] counts = new int[26];
        s = s.toLowerCase();
        for (int i=0; i<s.length(); i++) {
            counts[s.charAt(i)-'a']++;
        }
        // start creating the frequency string
        StringBuilder generatedStr = new StringBuilder();
        char c = 'a';
        for (int i : counts) {
            if (i >= 1) {
                generatedStr.append(c).append(i);
            }
            c++;
        }
        return generatedStr.toString();

    }
    public static List<List<String>> groupThem(String[] strs) {
        // Optimal : Anagrams has same freq elements
        // Map + Freq
        // O(N*K), k -> time taken for largest string | O(N)
        if (strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> freqMap = new HashMap<>();
        for (String s : strs) {
            String freqString = generateFreqString(s);
            if (!freqMap.containsKey(freqString)) {
//                List<String> list = new ArrayList<>();
//                list.add(s);
//                freqMap.put(freqString, list);
                // Wrong: freqMap.put(freqString, new ArrayList<>().add(s))
                    // reason: The add method of ArrayList returns a boolean (true if the element was added successfully, false otherwise), not the modified list.
                            //Therefore, you would end up storing true in the map, not the list of strings.

                freqMap.computeIfAbsent(freqString, k -> new ArrayList<>()).add(s);

            }else {
                freqMap.get(freqString).add(s);
            }
        }

        return new ArrayList<>(freqMap.values());
        
//        // Better : categorize by sorting -> Map + Sorting
//        // TC: O(N*KlogK) (KlogK -> Sorting strings of length K) || O(N)
//        List<List<String>> ans = new ArrayList<>();
//        Map<String, List<String>> map = new HashMap<>();
//        for (String s : strs) {
//            char[] charArray = s.toCharArray();
//            Arrays.sort(charArray);
////            String temp = new String(charArray);
//            String temp = String.valueOf(charArray);
////            if (!map.containsKey(temp)) {
////                map.put(temp, new ArrayList<>());
////            }
////            map.get(temp).add(s);
//            map.computeIfAbsent(temp, k -> new ArrayList<>()).add(s);
//        }
//////        for (List<String> group : map.values()) {
//////            ans.add(group);
//////        }
////        for (Map.Entry<String,List<String>> e : map.entrySet()) {
////            ans.add(e.getValue());
////        }
////        return ans;
//        return new ArrayList<>(map.values()); // return the list of list(list of anagrams)

        // Brute-force -----------------
        // O(N^3) | O(N)
        // Tip: .contains approach will not work as we don't know the string has appeared before or not, so check single element then move
        // Also single element is anagram so i j starts from 0
//        List<List<String>> result = new ArrayList<>();
//        for(int i=0; i<strs.length; i++){
//            List<String> current_anagram = new ArrayList<>();
//            for(int j=0; j<strs.length; j++){
//                if(isAnagram(strs[i], strs[j])){
//                    current_anagram.add(strs[j]);
//                }
//            }
//            if(!result.contains(current_anagram)) result.add(current_anagram);
//        }
//        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupThem(strs);
        System.out.println(ans);
    }
}
