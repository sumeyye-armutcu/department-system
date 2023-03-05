import java.util.Scanner;

public class Canteen extends SocialAreas {
	
	private static double discount;
	String situation;
	private int population=0;
	
	
	public Canteen(String situation)
	{
		super(situation);
	}
	
	
	public static double getDiscount() {
		return discount;
	}

	

	
	
	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}




	Scanner input=new Scanner(System.in);

	public float cost;

	public void calculateDiscount(double discountType) 
	{
		System.out.println("Please enter the amount to be paid: ");
		cost=input.nextFloat();
		double amount= (cost-(cost*discountType));
		System.out.printf("Discounted amount: "+amount);
		
		
	}
	
	
	
	
	
	
}
	


