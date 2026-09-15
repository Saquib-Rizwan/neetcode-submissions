/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int[] start=new int[intervals.size()];
        int[] end=new int[intervals.size()];
        for(int i=0;i<intervals.size();i++)
        {
            start[i]=intervals.get(i).start;
            end[i]=intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int s=0;
        int e=0;
        int rooms=0;
        int maxRooms=0;
        int n=intervals.size();
        while(s<n)
        {
            if(start[s]<end[e])
            {
                maxRooms=Math.max(++rooms,maxRooms);
                s++;
            }
            else
            {
                rooms--;
                e++;
            }
        }
        return maxRooms;
    }
}
