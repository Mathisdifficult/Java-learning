import java.util.*;  
class Point{
	double x1,y1,x2,y2;
	double changdu(){
	return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
}
	double xielv(){
		return Math.abs((y1-y2)/(x1-x2));
}
}
public class zhixian {
public static void main(String[]args){
Point a=new Point();
a.x1=1;
a.y1=2;
a.x2=26;
a.y2=49;
System.out.println("长度是"+a.changdu());
System.out.println("斜率是"+a.xielv());
Scanner in=new Scanner(System.in); 
	a.x1=in.nextFloat();  
	a.y1=in.nextFloat();
	a.x2=in.nextFloat();
	a.y2=in.nextFloat();
	System.out.println("长度是"+a.changdu());
	System.out.println("斜率是"+a.xielv());
}
}
