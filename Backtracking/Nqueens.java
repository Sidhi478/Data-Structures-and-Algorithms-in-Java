package Backtracking;

public class Nqueens {
	public static boolean isSafe(char board[][],int row,int col) {
		//vertical up
		for(int i=row-1;i>=0;i--) {
			if(board[i][col]=='Q') {
				return false;
			}
		}		
		//diagonal left up
		for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		
		
		//diagonal right up
		for(int i=row-1,j=col+1;i>=0 && j<board.length; i--,j++) {
			if(board[i][j]=='Q') {
				return false;
			}
		}
		return true;
		
	}
	public static boolean nqueens(char board[][],int row) {
		//base
		if(row==board.length) {
			//printboard(board);
			count++;
			return true;
		}
		
		//column loop
		for(int j=0;j<board.length;j++) {
			if(isSafe(board,row,j)) {
				board [row][j]='Q'; 
				if(nqueens(board ,row+1)) {
					return true;
				}
				board [row][j]='x';//backtracking step ki aage wali row pe baithsya toh pehle se hatanai padhegi 
			}
			
		}
		return false;
	}
	public static void printboard(char board[][]) {
		System.out.println("--------------chess Board-------------");
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	static int count=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		char board[][]=new char[n][n];
		
		//initialise
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				board[i][j]='x';
			}
		}
		if(nqueens(board ,0)){
			System.out.println("solution is possible");
			printboard(board);
		}else {
			System.out.println("solution is not possible");
		}
//system.out.println("total ways to solve n queens ="+count);
	}

}
