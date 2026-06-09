class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {

        if(s.length !== t.length)
            return false;

        //s and t are same length
        for(let i = 0; i < s.length; i++){
            if(t.indexOf(s[i]) !== -1){
                t = t.replace(s[i], " ")
                s = s.replace(s[i], " ")
            }
            else{
                return false;
            }
        }
        return true;
    }
}
