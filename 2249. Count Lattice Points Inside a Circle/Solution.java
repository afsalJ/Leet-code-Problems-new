class Solution {
    public int countLatticePoints(int[][] circles) 
    {
        HashSet<String> points = new HashSet<>();
        for(int[] circle : circles){
            List<int[]> left = new ArrayList<>();
            List<int[]> right = new ArrayList<>();
            int[] p;

            p = new int[]{circle[0]-circle[2], circle[1]};
            points.add(p[0] + "," + p[1]);
            getBox(circle, left, p);

            p = new int[]{circle[0]+circle[2], circle[1]};
            points.add(p[0] + "," + p[1]);
            getBox(circle, right, p);

            for(int i=0;i<left.size();i++){
                int[] start = left.get(i);
                int[] end = right.get(i);
                int[] iter = new int[]{start[0] + 1, start[1]};
                while(iter[0] < end[0]){
                    int x2Mx1 = iter[0]-circle[0];
                    int y2My1 = iter[1]-circle[1];
                    int distance = ( x2Mx1 * x2Mx1) + ( y2My1 * y2My1);
                    if(distance <= circle[2] * circle[2])
                    {
                        points.add(iter[0] +  "," + iter[1]);
                    }
                    iter[0] = iter[0] + 1;
                }
            }

            p = new int[]{circle[0], circle[1]+circle[2]};
            points.add(p[0] + "," + p[1]);

            p = new int[]{circle[0], circle[1]-circle[2]};
            points.add(p[0] + "," + p[1]);
        }

        return points.size();    
    }

    public void getBox(int[] circle, List<int[]> points, int[] p){
        points.add(p);
        for(int i=1;i<circle[2];i++){
            int[] temp;
            temp = new int[]{p[0], p[1] + i};
            points.add(temp);
            temp = new int[]{p[0], p[1] - i};
            points.add(temp);
        }
    }
}