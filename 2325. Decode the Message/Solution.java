class Solution {
    public String decodeMessage(String key, String message) {
        char[] map=new char[123];
        map[32]=' ';
        char iter = 'a';
        for(int i=0;i<key.length();i++){
            if(map[key.charAt(i)]==0){
                map[key.charAt(i)]=iter++;
            }
        }
        String pt="";
        for(int i=0;i<message.length();i++){
            pt += map[message.charAt(i)];
        }
        return pt;
    }
}