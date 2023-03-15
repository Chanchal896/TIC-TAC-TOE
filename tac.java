import java.util.Iterator;
import java.lang.Math;
import java.util.Scanner;

public class tac {

	public static void main(String[] args) {
		char[][] grid= {{' ',' ',' '},
						{' ',' ',' '},
						{' ',' ',' '}}; // here is the grid
		System.out.println("_1_|_2_|_3_");
		System.out.println("_4_|_5_|_6_");
		System.out.println("_7_|_8_|_9_");
		Scanner sc= new Scanner(System.in);
		
		boolean c = false;
		do {
			System.out.println("Enter the postion number you want to put X");
			int a=sc.nextInt();
			if (a==1) {
				if(grid[0][0]==' ') {
					grid[0][0]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==2) {
				if(grid[0][1]==' ') {
					grid[0][1]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==3) {
				if(grid[0][2]==' ') {
					grid[0][2]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==4) {
				if(grid[1][0]==' ') {
					grid[1][0]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==5) {
				if(grid[1][1]==' ') {
					grid[1][1]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==6) {
				if(grid[1][2]==' ') {
					grid[1][2]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==7) {
				if(grid[2][0]==' ') {
					grid[2][0]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==8) {
				if(grid[2][1]==' ') {
					grid[2][1]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			else if (a==9) {
				if(grid[2][2]==' ') {
					grid[2][2]='X';
				}
				else {
					System.out.println("Spot already Filled. Select another spot");
					continue;
				}
			}
			print(grid);
			System.out.println();
			ai(grid);
			c=check(grid);
			print(grid);
		} while (c==false);
		
		
		
	}

	private static void print(char[][] grid) {
		System.out.println("_"+grid[0][0]+"_|_"+grid[0][1]+"_|_"+grid[0][2]+"_");
		System.out.println("_"+grid[1][0]+"_|_"+grid[1][1]+"_|_"+grid[1][2]+"_");
		System.out.println("_"+grid[2][0]+"_|_"+grid[2][1]+"_|_"+grid[2][2]+"_");
	}

	private static void ai(char[][] grid) {
		try {
			int i=(int) (Math.random()*(3-0+0)+0);
			int j=(int) (Math.random()*(3-0+0)+0);
			if(grid[i][j]==' ') {
				grid[i][j]='O';
				return;
			}
			else {
				ai(grid);
			}		
		} catch (StackOverflowError e) {
			if(check(grid)==true) {
				
			}
			else {
				System.out.println("TIE");
				System.exit(1);
				
			}
		}
	}

	private static boolean check(char[][] grid) {
		boolean x=false;
		boolean o=false;
		for(int i=0;i<grid.length;++i) {
			for(int j=0;j<grid.length;++j){
				try {
					if(grid[i][j]=='X') {
					if(grid[i][j+1]=='X' && grid[i][j-1]=='X') {
						System.out.println("X won");
						return x=true;
					}
					if(grid[i+1][j]=='X' && grid[i-1][j]=='X') {
						System.out.println("X won");
						return x=true;
					}
					if(grid[i+1][j+1]=='X' && grid[i-1][j-1]=='X') {
						System.out.println("X won");
						return x=true;
					}
					}
					if(grid[i][j]=='O') {
						if(grid[i][j+1]=='O' && grid[i][j-1]=='O') {
							System.out.println("O won");
							return o=true;
						}
						if(grid[i+1][j]=='O' && grid[i-1][j]=='O') {
							System.out.println("O won");
							return o=true;
						}
						if(grid[i+1][j+1]=='O' && grid[i-1][j-1]=='O') {
							System.out.println("O won");
							return o=true;
						}
					}
					
				} catch (ArrayIndexOutOfBoundsException e) {
					continue;
				}	
				}
			}
		return false;	
	}
	}