import java.util.*;

class ThisKeyword{
	int id;
	String name;
	thiskwrd(int id,String name){
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
			thiskwrd oj=new thiskwrd(n1,n2);
			oj.display();
		}
	}
	// asdkasdma
	//askjdsakdjaskjdajdask
	// askjdhahsjkdhaskjdhkaj
}
