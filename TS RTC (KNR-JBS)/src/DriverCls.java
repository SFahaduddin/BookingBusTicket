import java.util.Scanner; 
public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("Select the Bus type for KNR-JBS :");
	System.out.println("1.NonStop");
	System.out.println("2.OneStop");
Scanner scan;
scan=new Scanner(System.in);
int a=scan.nextInt();

NonStop NS;
OneStop OS;
if (a==1) {
	NS=new NonStop();	
}
else if (a==2) {

OS=new OneStop();
}
else {
	System.out.println("INSERT VALID NUMBER");
}
	}
}
