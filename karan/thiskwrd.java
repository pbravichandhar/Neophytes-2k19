import java.util.*;

class thiskwrd{
	int id;
	String name;
	keywrd2(int id,String name){
		this.id=id;
		this.name=name;
	}
	void display(){
		System.out.println("User ID : "+id+"\t||\tUser Name : "+name);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n;i++){
			int n1=sc.nextInt();
			String n2=sc.next();
			keywrd2 oj=new keywrd2(n1,n2);
			oj.display();
		}
	}
}