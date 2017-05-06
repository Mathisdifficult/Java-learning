package test;

public class TestOverride extends ParentClass {
	public static void main(String[]args){
		new TestOverride().print();
		
	}
public void fun(double i){
	System.out.println("fun(double i) in TestOverride" );
	
}
public void fun(int i){
	System.out.println("fun(int i) in TestOverride");
	
}

public void print(){
	fun(1);
	fun(1.1);;
	super.fun(1);
	fun(1,2);
	super.fun(1,2);;
	
}
}

class ParentClass{
	public void fun(int i ){
		System.out.println("fun(int i) in ParentClass");
		
}
	public void fun(int i ,int j){
		System.out.println("fun(int i,int j) in ParentClass");
		
	}
}