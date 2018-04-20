package simulation;

import java.util.Random;

public class Tester {

	public static void main(String[] args) {

		int shooting = 70;
		double weight = .125;
		
		System.out.println((int) Math.round((shooting*weight+shooting*weight)/2));
		
	}

}