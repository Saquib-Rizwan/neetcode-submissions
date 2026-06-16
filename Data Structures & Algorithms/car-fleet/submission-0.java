class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[][] postime=new double[position.length][2];
        for(int i=0;i<position.length;i++)
        {
            postime[i][0]=position[i];
            postime[i][1]=(double)(target-position[i])/speed[i];
        }
        Arrays.sort(postime,(a,b)->Double.compare(b[0],a[0]));
        double maxTime=0;
        int fleet=0;
        for(int i=0;i<position.length;i++)
        {
            if(postime[i][1]>maxTime)
            {
                fleet++;
                maxTime=postime[i][1];
            }
        }
        return fleet;
    }
}
