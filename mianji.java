
	import java.util.*;  
	public class mianji{
		public static void main(String[] args) {
		Rectangle a = new Rectangle();
		 Scanner in=new Scanner(System.in); 
		a.x1=in.nextFloat();  
		a.y1=in.nextFloat();
		a.x2=in.nextFloat();
		a.y2=in.nextFloat();
		System.out.println("面积是"+a.getArea()+" 周长是"+a.getPemi());
		}
		}


	class Rectangle{
		double x1, y1, x2, y2;
		Rectangle(){}
		Rectangle(double x1, double y1, double x2, double y2){}
		double getArea(){
		return Math.abs((x1-x2)*(y1-y2));
		}
		double getPemi(){
		return Math.abs((x1-x2)+(y1-y2))*2;
		}
		}
	