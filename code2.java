package codinhninjasdailyproblem;
import java.util.* ;
import java.io.*; 
import java.util.*;

public class code2 {
    public static ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> newInterval)
    {
        // Write your code here.
        int in;
        for(int i=0;i<intervals.size();i++){
            if(intervals.get(i).get(0)>=newInterval.get(0))
            {
                in=i;
                break;
            }
        }
        boolean change=true;
        for(int i=0;i<intervals.size();i++){
            if(intervals.get(i).get(1)>=newInterval.get(1)){
                newInterval.get(1)=intervals.get(i).get(1);
                change=false;
                break;
            }
        }
        intervals.remove(in);
        intervals.add(in, newInterval);
        return intervals;
    }
}
