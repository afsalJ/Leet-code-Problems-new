class Solution {
    public int distance(char c1, char c2){
        char min, max;
        if(c1<c2){
            min = c1;
            max = c2;
        }
        else{
            min = c2;
            max = c1;
        }
        int dff = max - min; // distance from front
        int dfl = (122+(min - 96))-max; // distance from last

        return dff<dfl?dff:dfl;
    }
    // public int distance(String s1,String s2){
    //     int sum = 0;
    //     for(int i=0;i<s1.length();i++){
    //         sum+= (distance(s1.charAt(i), s2.charAt(i)));
    //     }
    //     return sum;
    // }
    
    public String getSmallestString(String s, int k) {
        String ans = "";
        char iter = 'a';
        int i =0;
        while(i<s.length()){
            int d = distance(iter, s.charAt(i));//distance
            if(d==k){
                ans+=iter;
                i++;
                break;
            }
            else if(d<k){
                ans+=iter;
                k-=d;
                i++;
            }
            else{
                iter++;
            }
        }
        while(i<s.length()){
            ans+=(s.charAt(i++));
        }
        return ans;
    }
}