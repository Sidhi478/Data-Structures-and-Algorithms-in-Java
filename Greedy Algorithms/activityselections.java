package greedyalgorithms;

import java.util.ArrayList;

public class activityselections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start[]= {1,3,0,5,8,5};
		int end[]={2,4,6,7,9,9};
		
		//end timesorted
		int maxAct=0;
	    ArrayList<Integer> ans=new ArrayList<>();
	    
	    //Ist actitvity
	    maxAct=1;
	    ans.add(0);
	    int lastEnd=end[0];
	    for(int i=0;i<end.length;i++) {
	    	if(start[i]>=lastEnd) {
	    		//activity select 
	    		maxAct++;
	    		ans.add(i);
	    		lastEnd=end[i];
	    	}
	    }
	    System.out.println("Max activities are="+maxAct);
	    for(int i=0;i<ans.size();i++) {
	    	System.out.print("A"+ans.get(i)+" ");
	    
	    }
	    System.out.println();
	}

}
