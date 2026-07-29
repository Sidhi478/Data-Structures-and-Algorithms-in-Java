package greedyalgorithms;
import java.util.*;

public class chocolaproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4,m=6;
		Integer costVer[]= {2,1,3,1,4}; //m-1
		Integer costHor[]= {4,1,2}; //n-1
		
		Arrays.sort(costVer,Collections.reverseOrder());
		Arrays.sort(costHor,Collections.reverseOrder());
		
		int h=0 ,v=0; //horizontal vertical counters 
		int hp=1,vp=1; //horizontal and vertical pieces count 
		int cost=0;
		
		while (h<costHor.length && v<costVer.length) {
			// vertical cost<hor cost
			if(costVer[v]<=costHor[h]) {
				cost+=(costHor[h]*vp);
				hp++;
				h++;
				
			}else {//vertical cut
				cost+=(costVer[v]*hp);
				vp++;
				v++;
			}
		}
		while(h<costHor.length) {
			cost+=(costHor[h]*vp);
			hp++;
			h++;
		}
		while(v<costVer.length) {
			cost+=(costVer[v]*hp);
			vp++;
			v++;
		}
		System.out.println("min cost if cuts="+cost);

	}

}
