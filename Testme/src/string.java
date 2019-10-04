import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String inputFromClient = "";
		System.out.println("enter lottery number?");
		
		while(true)
		{
			System.out.println("Input");
			inputFromClient = scanner.next();
			
			if(inputFromClient.equals("14")) {
				System.out.println(inputFromClient + "hooray! You Won");
			break;
			}
				
			else 
			{
				System.out.println("oops! you lost, please try again");
			}
			
		}
		
		}

	}








}


int value = 1;

while(value < 21 )
{

System.out.println("Hello " + "World" + value);
value = value + 1; 
}
}


for( int i=0; i<10; i++) {
	
	System.out.println("Hello" + "World" );

	}
	
}


int loop = 0;

while(true) {
	System.out.println("Hello World");
	
	if(loop == 10) {
		break;
		
	}
		loop ++;
		
	}
}


int myInt = 5;
if(myInt < 10) {
	System.out.println("Yes, it's true!");
}
	else if (myInt > 20);{
		System.out.println("No, it's false!");
	
}
	
	
}



Scanner scanner = new Scanner(System.in);

System.out.println("Please enter date");

String date = scanner.next();
System.out.println("Date entered:" + date);




}



Scanner scanner = new Scanner(System.in);

System.out.println("Please enter date");

String date = scanner.next();
System.out.println("Date entered:" + date);

//String dateString = "1/22/1990";
String[]numbers = date.split("/");

String[] dateArray = date.split("/");

System.out.println("First word:"+ dateArray[0]);
System.out.println("Second word:" + dateArray[1]);
System.out.println("Third word:" + dateArray[2]);

Integer monthName = 1;
 switch(dateArray[0]) {
 
 case "1":
	 System.out.println("january");
	 break;
 case "2":
	 System.out.println("february");
	 break;
	 default:
		 System.out.println("not matching");
 }


 int myInt = 45;
	if(myInt < 10) {
		System.out.println("yes, its true!");
	}
	else if (myInt > 20){
		System.out.println("no, its false!");
	}
	
}

int myInt = 15;
if(myInt < 10) {
	System.out.println("yes, its true!");
}
else if (myInt > 20){
	System.out.println("no, its false!");
}
else {
System.out.println("none of the above");
	
	
}
