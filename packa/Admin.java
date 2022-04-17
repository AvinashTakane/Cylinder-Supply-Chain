package packa;
import java.util.*;

public class Admin implements GasDepo{
	
	double Addgas=0;
	static double totalgas=100;
	int totalcylinder = (int)totalgas/50 ;			//Typecasting
	Scanner sc = new Scanner(System.in);
	
	
    public void addgas(){
		System.out.println("\n"+"###### Calling to the Admin to import Gas ######\n");
		System.out.println("Enter how much gas want to import : ");
		Addgas=sc.nextDouble();
		totalgas=totalgas+Addgas;
	
		totalcylinder=(int)totalgas/50;
		totalgas=totalgas%50;
		
		System.out.println("Total Gas remain After fill cylinder "+totalgas+" kg"+"\nTotalCylinder : "+totalcylinder);
		System.out.println("\n"+"------ Cylinders Booking Start ... ------");
		
		//Downcasting
		Admin ad = new Customer();
		Customer c1 = (Customer)ad;
		c1.check(totalcylinder);
	}
}