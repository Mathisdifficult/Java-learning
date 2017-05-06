
public class time {
public static void main(String[]args){
	java.util.Date date = new java.util.Date();
	long time = date.getTime();
	java.util.Date specificDate = new java.util.Date(time);
	System.out.print(specificDate);
}
}

