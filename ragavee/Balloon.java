import java.util.*;

class Balloon{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int green=obj.nextInt(); //cost of green balloon
        int purple=obj.nextInt(); //cost of purple balloon
        int cgreen=0,cpurple=0,i,j,cost;
        int participant=obj.nextInt(); //no: of participant
        int[][] status=new int[10][2]; //to get status of participant 
        for(i=0;i<participant;i++){
            for(j=0;j<2;j++){
                status[i][j]=obj.nextInt();
            }
        }
        for(i=0;i<participant;i++){
            for(j=0;j<2;){
            if(status[i][j]==1)
            cgreen++; //counts no: of green balloons for solving prob1 
            }
        }
        for(i=0;i<participant;i++){
            for(j=1;j<2;)
            if(status[i][j]==1)
            cpurple++;  //counts no: of purple balloons for solving prob2
        }
        cost=(green*cgreen)+(purple*cpurple);
        System.out.println(cost);
    }
}   