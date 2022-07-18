import java.util.ArrayList;
import java.util.Collections;

/*
 * Merge Overlapping Intervals

Given a collection of intervals, merge all overlapping intervals.

Example Input
Input 1:

[1,3],[2,6],[8,10],[15,18]


Example Output
Output 1:

[1,6],[8,10],[15,18]


Example Explanation
Explanation 1:

Merge intervals [1,3] and [2,6] -> [1,6].
so, the required answer after merging is [1,6],[8,10],[15,18].
No more overlapping intervals present.*/


class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class MergeInterval {

		    public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		      if (intervals == null) return null;
		        
		        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));
		        ArrayList<Interval> merged = new ArrayList<>();
		        
		        for (Interval current : intervals) {
		            if (merged.isEmpty() || merged.get(merged.size() -1).end < current.start) {
		                merged.add(current);
		            } else {
		                merged.get(merged.size() -1).end = Math.max(current.end, 
		                                                   merged.get(merged.size() -1).end);
		            }
		        }
		        return merged;
		    }
		    
		    public static void main (String args[]) {
		    	Interval i1 = new Interval(1,3);
		    	Interval i2 = new Interval(2,6);
		    	Interval i3 = new Interval(8,10);
		    	Interval i4 = new Interval(15,18);
		    	
		    	ArrayList<Interval> list = new ArrayList<>();
		    	list.add(i1);
		    	list.add(i2);
		    	list.add(i3);
		    	list.add(i4);
		    	ArrayList<Interval> l = merge(list);
		    	
		    	
		    	for(Interval i: l) {
		    		System.out.println(i.start+"-"+i.end);
		    	}
		    }
		}
