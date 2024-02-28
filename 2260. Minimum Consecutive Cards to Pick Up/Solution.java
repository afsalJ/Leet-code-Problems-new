class Solution {
    public int minimumCardPickup(int[] cards) {
        if(cards.length == 0){
            return -1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int min = cards.length + 1;
        map.put(cards[0], 0);
        for(int i=1;i<cards.length;i++){
            if(map.containsKey(cards[i])){
                int length = (i-map.get(cards[i])) + 1;
                if(min> length){
                    min=length;
                }
                map.remove(cards[i]);
            }
            map.put(cards[i], i);
        }

        return min==cards.length+1?-1:min;
    }
}