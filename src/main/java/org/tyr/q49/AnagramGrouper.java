package org.tyr.q49;

import java.util.*;

public class AnagramGrouper {

    public static List<List<String>> groupAnagramsOriginal(String[] strs) {
        Map<Integer, List<String>> hm = new HashMap<>();

        for (String str : strs) {
            int sum = str.chars().sum();

            if (!hm.containsKey(sum)) {
                List<String> ls = new ArrayList<>();
                ls.add(str);
                hm.put(sum, ls);
            } else {
                hm.get(sum).add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();

        hm.forEach((key, value) -> result.add(value));

        return result;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            map.putIfAbsent(sortedWord, new ArrayList<>());

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(groupAnagramsOriginal(new String[]{"cab","tin","pew","duh","may","ill","buy","bar","max","doc"}));
//        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
//        System.out.println(groupAnagrams(new String[]{""}));
//        System.out.println(groupAnagrams(new String[]{"a"}));
    }
}
