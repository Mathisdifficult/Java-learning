public class Computer {
private String type;
public Computer(String type){
	this.type=type;
}

class Desktop extends Computer{
	public Desktop() {
		super("Desktop");
 }	
}
class Notebook extends Computer{
	public Notebook(){
		super("Notebook");
 }
}

public void test(){
	System.out.println(new Desktop());
	System.out.println(new Notebook());

}

public static void main(String[]args){
}
}