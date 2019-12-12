import java.io.*;

class static{
	int id;
	String name;
	static String CLG="BEC";
	keywrd1(int i,String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println("Name : "+name+"\t||\tID : "+id+"\t||\tCollege Name : "+CLG);
	}
	public static void main(String[] args){
		keywrd1 oj1=new keywrd1(001,"Kaiser");
		keywrd1 oj2=new keywrd1(002,"Karan");
		keywrd1 oj3=new keywrd1(003,"Sundar");
		oj1.display();
		oj2.display();
		oj3.display();
	}
}