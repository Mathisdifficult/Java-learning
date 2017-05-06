class Rectangle{
double x1, y1, x2, y2;
Rectangle(){
this(0,0,0,0);
}
Rectangle(double x1, double y1, double x2, double y2){
this.x1 = x1;
this.y1 = y1;
this.x2 = x2;
this.y2 = y2;
}
double getArea(){
return Math.abs((x1-x2)*(y1-y2));
}
double getPemi(){
return Math.abs((x1-x2)+(y1-y2))*2;
}
}
public class mianji{
public static void main(String[] args) {
Rectangle a = new Rectangle();
a.x1=2.1;
a.y1=3.2;
a.x2=5.2;
a.y2=6.3;
System.out.println("面积是"+a.getArea()+" 周长是"+a.getPemi());
Rectangle b = new Rectangle(1, 2, 6.8, 10.5);
System.out.println("面积是"+b.getArea()+" 周长是"+b.getPemi());
}
}