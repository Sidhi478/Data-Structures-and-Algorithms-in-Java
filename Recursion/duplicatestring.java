package Recursion;

public class duplicatestring {
	public static void removedupstring(String str,int idx,StringBuilder newStr,boolean map[]) {
		if(idx==str.length()) {
			System.out.println(newStr);
			return;
		}
		//kaam
		char currchar=str.charAt(idx);
		if(map[currchar-'a']==true) {
			//duplicate
			removedupstring(str,idx+1,newStr,map);
		}else {
			map[currchar-'a']=true; 
			removedupstring(str,idx+1,newStr.append(currchar),map);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="appnnacollege";
		removedupstring(str,0, new StringBuilder(""), new boolean[26]);
		

	}

}
