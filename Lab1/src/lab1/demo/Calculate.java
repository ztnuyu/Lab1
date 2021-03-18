package lab1.demo;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
        System.out.println(" ===== How much do I weigh on Mars? =====\n");
        weight();
        planetWeightResult();
    }

    static double myweight;

    public static void weight() {
        boolean exit = false;
        Scanner in = new Scanner(System.in);
        System.out.println("\n1). Please type 1 and press enter, to know the weight in kg." + "\n2). Please type 2 to exit this program.\n");
        int choice = in.nextInt();
        if (choice == 1)
        {
          System.out.println("Please enter your weight in kilograms(KG).");
          myweight = in.nextDouble();
        }
        if (choice == 2)
        {
          System.out.println("Ooops.. Something is not quite right, please try again later!");
          exit = true;
        }
    }

    public static void planetWeightResult()     { 
    	System.out.printf("Your weight on Earth is: %.1f kg\n", (myweight));
        System.out.printf("Thus, your weight on Mars is: %.1f kg\n", (myweight * 0.38));
        weight();
    }
	
}
