import java.util.Scanner;
public class OneStop {
OneStop() {
	System.out.println("WELCOME TO ONE STOP BUSES");
	
	System.out.println("1.EXPRESS");
	System.out.println("2.PALLEVELGU");
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	if (a==1) {
		Express();
	}
	else if (a==2) {
		Pallevelgu();
	}
	else {
		System.out.println("INVALID BUS NUMBER");
	}
	
	
}

void Express() {
	
	System.out.println("1.SIDDEPET");
	System.out.println("2.JBS");
	Scanner s2=new Scanner(System.in);
	int d=s2.nextInt();
	//****EXPREES SIDDEPET CODE START****
	if (d==1) {
		System.out.println("TOTAL NO.OF TICKETS");
	Scanner s1=new Scanner(System.in);
	int b=s1.nextInt();
	
	//input of adults
	System.out.println("NO OF ADULTS :");
	int a=s1.nextInt();
	//input of childs
	System.out.println("NO OF CHILDS :");
	int c=s1.nextInt();
	if ( b !=c+a) {
		System.out.println("ERROR...... ENTER CORRECT NUMBER");
	}
	else {
	
int afare=a*60;
int cfare=c*30;
int fare=afare+cfare;


System.out.println("    WELCOME TO TSRTC");
System.out.println("       KNR DEPO  ");
java.util.Date date=new java.util.Date();  
System.out.println(date);  
System.out.println("       EXPRESS BUS  ");
System.out.println("      Passenger Ticket ");
System.out.println("   A: "+a+ "   "+"C: "+c);
System.out.println("                FARE :"+fare);
System.out.println("");
System.out.println("    *****THANK YOU*****");
System.out.println("     ***VISIT AGAIN***");
	}
//****EXPRESS SIDDEPET CODE END****
		
	}
	
	else if(d==2) {
		//****EXPRESS JBS CODE STARTS****
	System.out.println("TOTAL NO.OF TICKETS");
	Scanner s1=new Scanner(System.in);
	int b=s1.nextInt();
	
	//input of adults
	System.out.println("NO OF ADULTS :");
	int a=s1.nextInt();
	//input of childs
	System.out.println("NO OF CHILDS :");
	int c=s1.nextInt();
	if ( b !=c+a) {
		System.out.println("ERROR...... ENTER CORRECT NUMBER");
	}
	else {
	
int afare=a*100;
int cfare=c*50;
int fare=afare+cfare;


System.out.println("   WELCOME TO TSRTC");
System.out.println("      KNR DEPO  ");
java.util.Date date=new java.util.Date();  
System.out.println(date);  
System.out.println("    EXPRESS BUS  ");
System.out.println("    Passenger Ticket ");
System.out.println("   A: "+a+ "   "+"C: "+c);
System.out.println("               FARE :"+fare);
System.out.println("");
System.out.println("    *****THANK YOU*****");
System.out.println("     ***VISIT AGAIN***");
	}
	}
	//****EXPRESS JBS CODE END****

else {
	System.out.println("INSERT VALID NUMBER");
}
}
	
void Pallevelgu()
{
	System.out.println("1.SIDDEPET");
	System.out.println("2.JBS");
	Scanner s2=new Scanner(System.in);
	int d=s2.nextInt();
	//****Pallevelgu SIDDEPET CODE START****
	if (d==1) {
		System.out.println("TOTAL NO.OF TICKETS");
	Scanner s1=new Scanner(System.in);
	int b=s1.nextInt();
	
	//input of adults
	System.out.println("NO OF ADULTS :");
	int a=s1.nextInt();
	//input of childs
	System.out.println("NO OF CHILDS :");
	int c=s1.nextInt();
	if ( b !=c+a) {
		System.out.println("ERROR...... ENTER CORRECT NUMBER");
	}
	else {
	
int afare=a*60;
int cfare=c*30;
int fare=afare+cfare;


System.out.println("  WELCOME TO TSRTC");
System.out.println("     KNR DEPO  ");
java.util.Date date=new java.util.Date();  
System.out.println(date);  
System.out.println("   Pallevelgu BUS  ");
System.out.println("   Passenger Ticket ");
System.out.println("   A: "+a+ "   "+"C: "+c);
System.out.println("                FARE :"+fare);
System.out.println("");
System.out.println("    *****THANK YOU*****");
System.out.println("     ***VISIT AGAIN***");
	}
	}
	//****Pallevelgu SIDDEPET CODE ENDS****
	else if(d==2) {
		//****Pallevelgu JBS CODE STARTS****
	System.out.println("TOTAL NO.OF TICKETS");
	Scanner s1=new Scanner(System.in);
	int b=s1.nextInt();
	
	//input of adults
	System.out.println("NO OF ADULTS :");
	int a=s1.nextInt();
	//input of childs
	System.out.println("NO OF CHILDS :");
	int c=s1.nextInt();
	if ( b !=c+a) {
		System.out.println("ERROR...... INSERT VALID NUMBER");
	}
	else {
	
int afare=a*80;
int cfare=c*40;
int fare=afare+cfare;


System.out.println("    WELCOME TO TSRTC");
System.out.println("       KNR DEPO  ");
java.util.Date date=new java.util.Date();  
System.out.println(date);  
System.out.println("     Pallevelgu   ");
System.out.println("   Passenger Ticket ");

System.out.println("   A: "+a+" "+"C: "+c);
System.out.println("              FARE :"+fare);
System.out.println("");
System.out.println("    *****THANK YOU*****");
System.out.println("     ***VISIT AGAIN***");
	}
}
}
//****Pallevelgu JBS CODE ENDS****

}