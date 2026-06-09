class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    groupAnagrams(strs) {
        const anagramMap = {}

        //Step 1: Convert the string to an array
        //Step 2: Sort the array alphabetically
        //Step 3: Turn array back into a string
        //Step 4: Check to see if string exists as key of anagramMap
            //If yes: add the original string to the end of the list of the entry
            //If no: create an entry with the original string in a list
        //Step 5: Do steps 1-4 for every string
        //Step 6: Combine all entry's arrays into a 2D array.
        //Step 7: Return the 2D array containing the sublists.

        for(let i = 0; i < strs.length; i++){
            let strArr = Array.from(strs[i]);
            strArr.sort();
            let sortedStr = strArr.join("");

            if(anagramMap[sortedStr] !== undefined)
                anagramMap[sortedStr].push(strs[i]);
            else
                anagramMap[sortedStr] = [strs[i]];
        }

        const result = [];
        Object.keys(anagramMap).forEach((e) => {
            result.push(anagramMap[e]);
        })

        return result;
    }
    
}
