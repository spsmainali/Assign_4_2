import java.util.Scanner;// used to take input at run time
public class assign_4_2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); // Declared Sc object variable for class Scanner  for taking input at run time;
		int a = 0;
		System.out.println("Do you Wish to add new value\t (1/0)");// taking option from user weather he want to input own value
		a = sc.nextInt();
		
		if(a==1){
			
			System.out.println("Enter Collor Size"); int Colsize = sc.nextInt();//taking two different values from user
			System.out.println("Enter Sleeve Size"); int SlLength = sc.nextInt();
			Shirt sh = new Shirt(Colsize,SlLength); // creating object along with parameterised constructor call to add value in class variable
			sh.showData(); // Displaying the date back to user 
		}
		else{
			Shirt sh = new Shirt();// calling default constructor if user do not enter any value
			sh.showData();
		}
		sc.close(); // closing the scanner object
		
		
	}		
}

class Shirt{ 						// Shirt class is declared 
	private int CollerSize;			// Declared private variable or fields.
	private int shirtSlivelenth;
	private String shirtMaterial;
	
	public void  showData(){		//Created a function to display data to user
		System.out.println("The measurement of Shirt is=" + this.CollerSize+" , "+this.shirtSlivelenth + " ,  and Material type is: "+ this.shirtMaterial);
	}
	Shirt(int Csize, int Slength){ // Declare and instantize the parameterised constructor
		this.CollerSize = Csize;
		this.shirtSlivelenth = Slength;
		this.shirtMaterial = "Cotton";
	}
	Shirt(){						// Declare and instantize the default constructor
		this.CollerSize = 25;
		this.shirtSlivelenth = 35;
		this.shirtMaterial = "Cotton";
	}
	
}
