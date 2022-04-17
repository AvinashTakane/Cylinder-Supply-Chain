package packa;
import java.util.*;


public class Customer extends Admin implements GasDepo{		
	
	Scanner sc = new Scanner(System.in);
	int id[]={01,02,03,04,05};
	String name[]={"Arvind Kumar","Jai Shah","Meera Kumari","Akash Sing","Veer Patel"};
	int reg[]=new int[id.length];
	String order="yes";
	String register;
	int cylinder=0,ch=0;
	Admin ad = new Admin();			
	
	public Customer(){
		System.out.println("\n******* Welcome to Relince Gas Private Limited ******* ");
	}
	
	//================ First Time this Check will executed ===========================//
	
	public void check(){
		
		if(ad.totalcylinder<=id.length){
			System.out.println("\n"+" Not Sufficient Cylinders In GasDepo Import First...");
			System.out.println(" Only "+ad.totalcylinder+" cylinder  avalible ");
			ad.addgas();
		}
		else{
			booking(cylinder);
		}
	} 
	
	//================ If want then Multiple Time this Check will executed =================//
	
	public void check(int cylinder){
		
		this.cylinder=cylinder;
		
		if(this.cylinder<=id.length){
			System.out.println("\n"+" Not Sufficient Cylinders Import First...");
			System.out.println(" Only "+this.cylinder+" cylinder  avalible ");
			ad.addgas();
		}
		else{
			booking(this.cylinder);
		}
	} 

	//======================= Booking Method ===========================//

	public void booking(int cylinder){
		this.cylinder=cylinder;
		System.out.println("\n"+" If you want to register for cylinder then press yes "+"\n");
		
		for(int i=0;i<id.length;i++){
			
			System.out.print(" "+id[i]+"\t"+name[i]+"\t");
			register = sc.next();

			if(order.equals(register)){
				reg[i]=id[i];
				this.cylinder=this.cylinder-1;
			System.out.print(" "+name[i]+"\t"+"-->Sucessfully registered for cylinder\n");
			}
			else
				System.out.printf(" "+name[i]+"\t"+"-->NOT Registered ...\n");
				System.out.println();			
		}
	
	delivery();
	}
	
	//========================= Delivery Method ===========================//

	
	public void delivery(){

	System.out.println("------------- Delivery Of Cylinders ------------"+"\n");
		for(int i=0;i<reg.length;i++){
			if(reg[i]!=0)	//if comment this it shows non-register customer also.
			System.out.println("  Cylinder deliverd to "+reg[i]+" "+name[i]);
		}
		System.out.println("\n"+"   Thank You !!! For Being With us ...   ");
		//
		System.out.print("\n********* If you want to Register again then press 1 ... :  ");
		ch=sc.nextInt();
		
		if(ch==1){
			System.out.println("\n"+" TotalCylinder remain : "+this.cylinder);
			System.out.println("\n******* Welcome to Relince Gas Private Limited ******* ");
			check(this.cylinder);
		}
	}
	
	//=========================== Terminated =============================//

}



