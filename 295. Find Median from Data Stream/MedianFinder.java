class MedianFinder {
    ArrayList<Integer> list;
    public MedianFinder() {
        list=new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i=0;
        for(i=0;i<list.size();i++){
            if(list.get(i)>=num){
                break;
            }
        }
        list.add(i, num);
    }
    
    public double findMedian() {
        int size=list.size();
        if(size%2!=0){
            return list.get(size/2);
        }
        else{
            double m1=list.get(size/2);
            double m2=list.get((size-1)/2);
            return (m1+m2)/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */