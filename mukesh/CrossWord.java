import java.io.*; 
import java.util.*; 
class CrossWord
{ 
	static int R, C; 
	static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 }; 
	static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 }; 
	static boolean search2D(char[][] arr, int row, 
							int col, String word) 
	{ 
			if (arr[row][col] != word.charAt(0))
				return false; 

			int len = word.length();
			for (int dir = 0; dir < 8; dir++) 
			{ 
				int k, rd = row + x[dir], cd = col + y[dir];
				for (k = 1; k < len; k++) 
				{ 
					if (rd >= R || rd < 0 || cd >= C || cd < 0) 
						break; 
					if (arr[rd][cd] != word.charAt(k)) 
						break; 
					rd += x[dir]; 
					cd += y[dir]; 
				} 
				if (k == len) 
					return true; 
			} 
		return false; 
	} 
	static void patternSearch(char[][] arr, String word) 
	{ 
			for (int row = 0; row < R; row++) 
			{ 
				for (int col = 0; col < C; col++) 
				{ 
					if (search2D(arr, row, col, word)) 
					{
						System.out.println(word+" is Present in 2D array"); 
					}
					
				} 
			} 
	} 
	public static void main(String args[]) 
	{ 
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the Row And Col");
		R = sc.nextInt(); 
		C = sc.nextInt(); 
		System.out.println("Enter the 2D Array");
		char[][] arr = new char[R][C];
		for(int index=0;index<R;index++)
		{
		    for(int index1=0;index1<C;index1++)
		    {
		        arr[index][index1]=sc.next().charAt(0);
		    }
		}
		System.out.println("Enter the length of Array");
		int len=sc.nextInt();
		String []str=new String[len];
		for(int index2=0;index2<len;index2++)
		{
		    str[index2]=sc.next();
		}
		for(int index2=0;index2<len;index2++)
		{
		    patternSearch(arr, str[index2]);
		}
	} 
} 