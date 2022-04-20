package net.lacisoft.houseplanslaci;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {


		HomePlan[] homePlans = {
				new HomePlan(1, 150f, 2, 2, true),
				new HomePlan(2, 100f, 1, 1, true),
				new HomePlan(3, 90f, 2, 2, false),
				new HomePlan(4, 250f, 1, 2, false),
				new HomePlan(5, 75f, 1, 1, false),
				new HomePlan(6, 800f, 3, 2, true),
				new HomePlan(7, 120f, 3, 3, true),
				new HomePlan(8, 160f, 2, 2, true),
				new HomePlan(9, 50f, 1, 1, false),
				new HomePlan(10, 110f, 2, 0, true)
		};
		
		float searchAreaIsLesss = 100f;
		float searchCostIsLess = 3000f;
		
		System.out.println(HPToString.convert(homePlans));
		System.out.println(HPToString.convert(Search.findPlansSmallerThan(homePlans, 100)));
		System.out.println(HPToString.convert(Search.findPlansCheaperThan(homePlans, 1500)));

	}

	
}
