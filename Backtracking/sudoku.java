package Backtracking;

public class sudoku {
	public static boolean isSafe(int sudokus[][],int row,int col,int digit) {
		//column
		for(int i=0;i<9;i++) {
			if(sudokus[i][col]==digit) {
				return false;
			}
		}
		//row 
		for(int j=0;j<9;j++) {
			if(sudokus[row][j]==digit) {
				return false;
			}
		}
		//grid
		int sr=(row/3)*3;
		int sc=(col/3)*3;
		//3*3
		for(int i=sr;i<sr+3;i++) {
			for(int j=sc;j<sc+3;j++) {
				if(sudokus[i][j]==digit) {
					return false;
				}
			}
		}
		return true;
	}
	public static boolean sudokusolver(int sudokus[][],int row,int col) {
		//base case
		if(row==9 && col==0) {
			return true;
		}
		//recursion
		int nextRow=row,nextcol=col+1;
		if(col+1==9) {
			nextRow=nextRow+1;
			nextcol=0;
			}
		if(sudokus[row][col]!=0) {
			return sudokusolver(sudokus,nextRow,nextcol);
		}
		for(int digit=1;digit<=9;digit++) {
			if(isSafe(sudokus,row,col,digit)) {
				sudokus[row][col]=digit;
				if(sudokusolver(sudokus,nextRow,nextcol)) {
					return true;
				}
				sudokus[row][col]=0;
			}
		}
		return false;
	}
	public static void printsudoku(int sudokus[][]) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(sudokus[i][j]+" ");
			}
			System.out.println();
		}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sudokus[][]= {{0,0,8,0,0,0,0,0,0},
				{4,9,0,1,5,7,0,0,2},
				{0,0,3,0,0,4,1,9,0},
				{1,8,5,0,6,0,0,2,0},
				{0,0,0,0,2,0,0,6,0},
				{9,6,0,4,0,5,3,0,0},
				{0,3,0,0,7,2,0,0,4},
				{0,4,9,0,3,0,0,5,7},
				{8,2,7,0,0,9,0,1,3}};
		if(sudokusolver(sudokus,0,0)) {
			System.out.println("solution exist");
			printsudoku(sudokus);
		}else {
			System.out.println("solution doesnt exist");
		}
		}
				

	}


