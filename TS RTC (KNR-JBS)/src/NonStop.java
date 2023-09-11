import java.util.Scanner;
public class NonStop {
 NonStop(){
	
	System.out.println("Welcome to Non Stop Buses");
	
	System.out.println("1.Garuda");
	System.out.println("2.Rajdhani");
	System.out.println("3.Super Luxery");
	System.out.println("4.Orange");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	
	if (a==1) {
		Garuda();
		}
	else if (a==2) {
	Rajdhani();
	}
	else if (a==3) {
		SuperLuxary();
	}
	else if (a==4) {
		Orange();
	}
	else {
		System.out.println("INVALID BUS NUMBER");
	}
	}
	
	
	
	
 
	
	
void Garuda() {
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
	int afare=150;
	int cfare=50;
	int fare=afare+cfare;
	
	
	System.out.println("    WELCOME TO TSRTC");
	System.out.println("       KNR DEPO  ");
	java.util.Date date=new java.util.Date();  
	System.out.println(date);  
	System.out.println("    GARUADA BUS  ");
	System.out.println("    Passenger Ticket ");
	System.out.println("   A: "+a+"  "+"C: "+c);
	System.out.println("              FARE :"+fare);
	System.out.println("");
	System.out.println("    *****THANK YOU*****");
	System.out.println("     ***VISIT AGAIN***");
}
}

void Rajdhani() {
	//input of ticket
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
	int afare=a*175;
	int cfare=c*87;
	int fare=afare+cfare;
	
	
	System.out.println(" ****WELCOME TO TSRTC**** ");
	System.out.println("        KNR DEPO  ");
	java.util.Date date=new java.util.Date();  
	System.out.println(date);  
	System.out.println("         RAJDHANI BUS  ");
	System.out.println("    Passenger Ticket ");
	System.out.println("   A: "+a+"   "+"C: "+c);
	System.out.println("           TOTAL FARE :"+fare);
	System.out.println("");
	System.out.println("     *****THANK YOU*****");
	System.out.println("      ***VISIT AGAIN***");
}
}
void SuperLuxary() {
	
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
	int afare=100;
	int cfare=40;
	int fare=afare+cfare;
	
	
	System.out.println("   WELCOME TO TSRTC");
	System.out.println("      KNR DEPO  ");
	java.util.Date date=new java.util.Date();  
	System.out.println(date);  
	System.out.println("    SUPERLUXARY BUS  ");
	System.out.println("   Passenger Ticket ");
	System.out.println("    A: "+a+"  "+"C: "+c);
	System.out.println("             FARE :"+fare);
	System.out.println("                            ");
	System.out.println("    *****THANK YOU*****");
	System.out.println("     ***VISIT AGAIN***");
}
}

void Orange(){
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
int afare=200;
int cfare=100;
int fare=afare+cfare;


System.out.println("   WELCOME TO TSRTC");
System.out.println("      KNR DEPO  ");
java.util.Date date=new java.util.Date();  
System.out.println(date);  
System.out.println("       ORANGE BUS   ");
System.out.println("     Passenger Ticket ");
System.out.println("    A: "+a+"  "+"C: "+c);
System.out.println("               FARE :"+fare);
System.out.println("");
System.out.println("       *****THANK YOU*****");
System.out.println("        ***VISIT AGAIN***");
}
}
}