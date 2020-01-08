import java.io.*; 
import java.util.*; 

class WordSearchFinal { 

	static int R, C, totalsearch; 															// Rows and columns in given grid 
	static String value;

	static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 }; 
	static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 }; 										// For searching in all 8 direction 

	static boolean searchInTwoDimensional(char[][] grid, int row, int col, String word) { 

		if (grid[row][col] != word.charAt(0)) {
			return false;
		}
		int len = word.length();
		
		for (int dir = 0; dir < 8; dir++) { 												// Search word in all 8 directions 
			int k, rowdir = row + x[dir], coldir = col + y[dir]; 
			for (k = 1; k < len; k++) { 
				if (rowdir >= R || rowdir < 0 || coldir >= C || coldir < 0) {				// If out of bound break 
					break; 
				}
				if (grid[rowdir][coldir] != word.charAt(k)) 		{						// If not matched, break 
					break; 
				}
				rowdir += x[dir];															// Moving in particular direction 
				coldir += y[dir]; 
			} 
			if (k == len) {
				return true; 
			}
		} 
	    return false; 
    } 
	 
    static void searchWord(char[][] grid, String word) {										// matrix in all 8 directions to search 
		for (int row = 0; row < R; row++) { 
			for (int col = 0; col < C; col++) { 
				if (searchInTwoDimensional(grid, row, col, word)) {										// passing the grid value and which ro and column the value is matching
					System.out.println("pattern found at " + (row+1) + ", " + (col+1));
				}
			}
		}
	} 
	
	public static void main(String args[]) { 
		char grid[][] = new char[10][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row and Column to enter te chracters : ");
        R = sc.nextInt();																	// getting row and column value
		C = sc.nextInt();
		System.out.println("Enter the characters : ");										// getting characters on 2d array
		System.out.println();
        for (int inc1 = 0; inc1 < R; inc1++) {
            for (int inc2 = 0; inc2 < C; inc2++) {
                grid[inc1][inc2] = sc.next().charAt(0);
            }
		}

		System.out.println("Enter the total words to be search : ");						// getting total values to be search on the grid array
		totalsearch = sc.nextInt();
		System.out.println("Enter the words to be search : ");
		for (int inc = 0; inc < totalsearch; inc++) {
			value = sc.next();
			searchWord(grid, value); 															// passing the value to the checking function
		}
		System.out.println(); 
    }
}
