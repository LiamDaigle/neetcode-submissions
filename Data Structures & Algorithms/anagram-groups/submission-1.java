class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Create a map that will store a string key and a list of integers
        //Sort each string alphabetically
        //If the string does not exist as a key, add it and add the index of the string to it
        //If it does exist, add the string index to that entry
        //After, go through each and group them together.

        Map<String, List<String>> hashMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String originalString = strs[i];
            char[] charArray = originalString.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            if(hashMap.containsKey(sortedString)){
                List<String> newList = hashMap.get(sortedString);
                newList.add(originalString);
                hashMap.put(sortedString, newList);
            }
            else{
                hashMap.put(sortedString, new ArrayList(List.of(originalString)));
            }
        }

        List<List<String>> groupedAnagrams = new ArrayList<>();

        for(String key: hashMap.keySet()){
            groupedAnagrams.add(hashMap.get(key));
        }

        return groupedAnagrams;
    }
}
