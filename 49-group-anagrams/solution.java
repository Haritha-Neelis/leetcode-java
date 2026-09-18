// Group Anagrams
// Difficulty: Medium
// Runtime: 17 ms
// Memory: 49.1 MB
// https://leetcode.com/problems/group-anagrams/

                .map(ArrayList::new) 
                .stream()
                .collect(Collectors.toList()); 
    }

    private static String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
