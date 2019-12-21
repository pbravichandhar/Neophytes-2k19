class ArrayMul { 
    static void twod(){
        
		 int[][] arr = { { 1, 2 }, { 3, 4 } }; 

         for (int i = 0; i < 2; i++) { 
             for (int j = 0; j < 2; j++) { 
                 System.out.print(arr[i][j] + " "); 
             } 
             System.out.println();
       }
   }
   static void prcedence()
   {
       int a=8,b=10,c=1;
       int  result = a-++c-++b;
       System.out.println(result);
       result= ++a*b++;
       System.out.println(result);
    int x = 1, y = 2, z = 3;
    int smallestNum;
    smallestNum = (x<y && x<z) ? x : (y<x && y<z) ? y : (z<y && z<x) ? z:0;
    System.out.println(smallestNum + " is the smallest of the three numbers.");
    int r=(5>6) ? (7>8) ? 8 : 9: 10;
    System.out.println(r);
   }
    	public static void main(String[] args) 
	{ 
        twod();
        prcedence();

	} 
} 
