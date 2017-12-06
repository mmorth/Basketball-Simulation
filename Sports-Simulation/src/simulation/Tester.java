package simulation;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {

		Random rng = new Random();
		
		for (int i = 0; i < 10; i++) {
			int rand = rng.nextInt(3)+1;
			if (rand == 2) {
				System.out.println("WHAT THE HECK!!!!!?!?!?!?!?");
			}
			System.out.println(rand);
		}
		
	}

}
