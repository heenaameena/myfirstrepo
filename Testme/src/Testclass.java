
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Testclass{
public static void main(String[] args) {

	

	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Please enter date");

	String date = scanner.next();
	System.out.println("Date entered:" + date);
	
	while(true) {

	//String dateString = "1/22/1990";
	String[]numbers = date.split("/");

	String[] dateArray = date.split("/");
	
	//months
	if(dateArray[0]=="1" || dateArray[0]=="2"|| dateArray[0]=="3" || dateArray[0]=="4" || dateArray[0]=="5" || dateArray[0]=="6" || dateArray[0]=="7" ||dateArray[0]=="8"
			|| dateArray[0]=="9" || dateArray[0]=="10" || dateArray[0]=="11" || dateArray[0]=="12")
               
	
	
	
	System.out.println("First word:"+ dateArray[0]);
	System.out.println("Second word:" + dateArray[1]);
	System.out.println("Third word:" + dateArray[2]);

	Integer monthName = 1;
	 switch(dateArray[0]) {
	 
	 case "1":
		 System.out.println("january");
		 break;
	 case "01":
		 System.out.println("january");
		 break;
		 
	 case "2":
		 System.out.println("february");
		 break;
	 case "02":
		 System.out.println("february");
		 break;
		 
	 case "3":
		 System.out.println("march");
		 break;
	 case "03":
		 System.out.println("march");
		 break;
		 
	 case "4":
		 System.out.println("april");
		 break;
	 case "04":
		 System.out.println("april");
		 break;
		 
	 case "5":
		 System.out.println("may");
		 break;
	 case "05":
		 System.out.println("may");
		 break;
		 
	 case "6":
		 System.out.println("june");
		 break;
	 case "06":
		 System.out.println("june");
		 break;
		 
	 case "7":
		 System.out.println("july");
		 break;
	 case "07":
		 System.out.println("july");
		 break;
		 
	 case "8":
		 System.out.println("august");
		 break;
	 case "08":
		 System.out.println("august");
		 break;
		 
	 case "9":
		 System.out.println("september");
		 break;
	 case "09":
		 System.out.println("september");
		 break;
		 
	 case "10":
		 System.out.println("october");
		 break;
	 case "010":
		 System.out.println("october");
		 break;
		 
	 case "11":
		 System.out.println("november");
		 break;
	 case "011":
		 System.out.println("november");
		 break;
		 
	 case "12":
		 System.out.println("december");
		 break;
	 case "012":
		 System.out.println("december");
		 break;
		 
	 }	
	 }			
	
	
	
	
	
	
	
	
	
	
	//int loop = 0;
	//while (true) {
		//System.out.println("looping: + loop");
		
	//if(loop == 5) {
		//break;
		
	
//loop++;
//System.out.println("running");
	
	
}
	
	
	
	
	
	
	
//for(int i=0;i<5;i++){
	//System.out.println("The value of i is : % d/n",i );

	
	
	
//for(int i=0;i<5;i++){
	//System.out.println("Hello");

	
//boolean Cond = 4 == 3;
//System.out.println(Cond);


	
	
	

	public static void scores() 
	{

		Scanner input = new Scanner(System.in);
		System.out.println("test results");
		Integer result = input.nextInt(10);
		  
		  //if(result > 90)
		 
		   System.out.println("topper");
		   System.out.println("first class");
		   System.out.println("second class");
		   System.out.println("failed");
		  
		  }
	
	

		  
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void elseiftutorial() {
		

		// take list of student names from user until user types "done"
				// and then print all the names
			
			List<String> input = new ArrayList<String>();
			
				
				Scanner scanner = new Scanner(System.in);
				
				String Studentname = "";
				 
				 while(!Studentname.equals("done"))
				 {
					 System.out.println("Input:");
					 Studentname = scanner.next();
					 input.add(Studentname);
					 System.out.println();
				 }
		
				 System.out.println("Studentname:" + input.toString());		
				 
				 
				 
				 
				 
				 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void elsetutorial() {
		Scanner input = new Scanner(System.in);
	
		//int[] highSalaries = new int[5];
		//int[] lowSalaries = new int[5];
		List<Integer> highSals = new ArrayList<Integer>();
		List<Integer> lowSals = new ArrayList<Integer>();
		
		
		for(int i=0; i< 5; i++)
		{
			System.out.println("Salary?");			
			Integer salary = input.nextInt();
			
			if(salary<1000)
			{
				//lowSalaries[i] = salary;
				lowSals.add(salary);
			}
			else
			{
			highSals.add(salary);
			}
			

		}	
		System.out.println("low Salaries:" + lowSals.toString());			
		
		
		
			System.out.println("high Salaries:" + highSals.toString());			
		
			
	}
			
			
			
			

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

	
	
	
	
	
	
	
	
	
	public static void fortutorial() {
		// get salaries of  people
				// print all the salaries
				
				Scanner input = new Scanner (System.in);
				int[] salaries = new int[5]; 
				
				for(int i=0; i<5;i++) {
					System.out.println("what are the salaries?");
					
					Integer salary = input.nextInt();
					salaries[i] = salary;
				}
				for(int i=0; i<5;i++) {
					System.out.println("the salaries"+ salaries[i]);
				}
		
		
		
		
	}
	
	
		
		public static void ifconditionTutorial() {
			

			System.out.println("hello world!");
			
			Scanner input = new Scanner(System.in);
			System.out.println("whats the temperaturs?");
			Integer temperature = input.nextInt();
			  
			  if(temperature > 100)
			  {
			   System.out.println("Its too hot!");
			   
			  }
			  else if (temperature < 32)
			  {
			   System.out.println("Its freezing!");
			  }
			  else 
				  
			  {
				  System.out.println("The weather is perfect!");
		}
		
		
		
		
		
	}
	public static void previouscode()
	
	{
		System.out.println("hello world");
        Integer number1 = 786;
		Integer number2 = 200;
		
		Substractclass subtractclass = new Substractclass();
		Integer sub = subtractclass.SubtractNumbers(number1, number2);
		System.out.println(sub);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Name:");
		String name = input.next();
		System.out.println("you are:" + name);
		
		System.out.println("Country:");
		String country = input.next();
		System.out.println("your country is:" + country);
		
		System.out.println("Company:");
		String company = input.next();
		System.out.println("company name:" + company);
		
		System.out.println(name +" is from" + country +"and works at " + company);	
	}
}
