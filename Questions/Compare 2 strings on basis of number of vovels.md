# Approach
Split the string into 2 parts using <b> .substring() </b> method.
Traverse both the substrings and count the number of vovels.
Then compare the <b> count</b> value for both the strings.

# Complexity
- Time complexity: O(n)

- Space complexity: O(n)

# Code
```
class Solution {
    public boolean halvesAreAlike(String s) {
      int len=  s.length();
      int n = len/2;

      String a = s.substring(0,n).toLowerCase();
      String b = s.substring(n,len).toLowerCase();

      return alike(a,b);
    }

    public boolean alike(String a, String b){
        if (vovelCount(a) == vovelCount(b)){
            return true;
        }
        else return false;
    }

    public int vovelCount(String str){
        int count = 0;

        for(int i=0; i<str.length() ;i++){
            char c = str.charAt(i);
            if (c == 'a' ||c == 'e' || c == 'i' || c == 'o' ||c == 'u') count++;
        }
        return count;
    }
}
```
