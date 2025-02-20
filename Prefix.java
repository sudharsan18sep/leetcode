public class Prefix {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        //strs[0].substring(0,j);
        //startsWith(string)
        //strs[0].substring(0,1)
        Boolean match = false;
        //System.out.println( strs[0].length());
        int n = strs[0].length();


        for (int i = n; i > 0; i--) {
            int count =0;
            String sub = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {

                if (strs[j].startsWith(sub) && !match) {
                    count++;

                    if (count == strs.length - 1) {
                        match = true;
                        System.out.println(sub);

                    }
                }
            }

            }

        }
    }

    //submitted answer
/*
class Solution {
    public String longestCommonPrefix(String[] strs) {

       int n = strs[0].length();

       for (int i = n; i>0;i--){
        int count =0;
        String sub = strs[0].substring(0,i);
        for(int j=0;j<strs.length; j++ )
        {
            if(strs[j].startsWith(sub))
            {
                count++;
                if(count == strs.length)
                {
                    return sub;
                }
            }
        }
       }
       return "";
    }
}
 */

