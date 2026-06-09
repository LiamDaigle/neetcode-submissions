class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //1. Create a map where the keys will be sorted strings
        //2. Pass through the strs array and place each values index into the proper map entry after finding out what the string is when sorted
        //3. Iterate through the map and using the indices associated with each sorted string, create the sublists

        HashMap<String, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String temp = new String(strs[i]);
            char[] charArray = temp.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);

            if(map.containsKey(sorted)){
                List<Integer> updatedList = map.get(sorted);
                updatedList.add(i);
                map.put(sorted, updatedList);
            }
            else
                map.put(sorted, new ArrayList(List.of(i)));
        }

        List<List<String>> resultList = new ArrayList<>();

        map.forEach((str, list) -> {
            List<String> subList = new ArrayList<>();
            for(int i = 0; i < list.size(); i++){
                subList.add(strs[list.get(i)]);
            }
            resultList.add(subList);
        });

        return resultList;
    }
}
