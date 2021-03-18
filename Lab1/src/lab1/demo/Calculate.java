package lab1.demo;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculate {
	
	private static WeightList weightl = new WeightList();

	public static void main(String[] args) {
        System.out.println(" ===== How much do I weigh on Mars? =====\n");
        weight();
        planetWeightResult();
    }

    static double myweightkg;

    public static void weight() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        System.out.println("\n1) Please type 1 and press enter, to submit your weight in kg." + "\n2) Please type 2 to exit this program.\n" + "3) To display list.");
        int choice = in.nextInt();
        if (choice == 1)
        {
          System.out.println("Please enter your weight in kilograms(KG).");
          myweightkg = in.nextDouble();
        }
        if (choice == 2)
        {
          System.out.println("Ooops.. Something is not quite right, please try again later!");
          exit = true;
        }
        if (choice == 3)
        {
        	calculateWeightList();
        	System.out.printf("\n");
        	weight();
        }
    }

    public static void planetWeightResult() { 
    	System.out.printf("Your weight on Earth is: %.1f kg\n", (myweightkg));
        System.out.printf("Thus, your weight on Mars is: %.1f kg\n", (myweightkg * 0.38));
        weight();
    }
    
    public static void calculateWeightList() {
    	weightl.WeightList();
    }
	
}
