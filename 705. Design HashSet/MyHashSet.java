class MyHashSet {
    ArrayList<Integer> list;
    public MyHashSet() {
        list=new ArrayList<>();
    }
    
    public void add(int key) {
        if(has(key)==-1){
            list.add(key);
        }
    }
    
    public void remove(int key) {
        int index=has(key);
        if(index!=-1){
            list.remove(index);
        }
    }
    
    public boolean contains(int key) {
        if(has(key)==-1){
            return false;
        }
        return true;
    }

    public int has(int key){
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                return i;
            }
        }
        return -1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */