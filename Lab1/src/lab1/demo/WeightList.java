package lab1.demo;

import java.util.ArrayList;

public class WeightList {
	
	public static void WeightList() {
		ArrayList<Double> weight = new ArrayList<Double>();
		weight.add((double) 100);
		weight.add((double) 60);
		weight.add((double) 55);
		
		for (int i = 0; i < weight.size(); i++) {
			System.out.printf("\n\n");
			System.out.printf("Your weight on Earth is: %.1f kg", (weight.get(i)));
			System.out.printf("\n");
			System.out.printf("Your weight on Mars is: %.1f kg", (weight.get(i) * 0.38));
		}
	}
	
}
