package net.lacisoft.houseplanslaci;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

//		HomePlan homePlan = new HomePlan(1, 150f, 2, 2, true);
//		System.out.println(homePlan.toString());
//		CalcWorkmanshipCost calchhh = new CalcWorkmanshipCost(homePlan);
//		System.out.println(calchhh.Calc());

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

		

		
		/* ha nem statikus lenne a Search, akkor igy kene hasznalni
		Search s = new Search();
		s.setPlans(homePlans);
		System.out.println(HPToString.convert(s.findPlansSmallerThan(100))); */

		/*
		HPToString hp;
		hp = new HPToString(homePlansCalc);
		System.out.println(Arrays.toString(homePlansCalc));
		
		PrintHomePlans.printHeader();*/
/*		for (int i=0; i<homePlansCalc.length; i++) 
		{ 
//		    PrintHomePlan hp = new PrintHomePlan(homePlansCalc[i]);
//		    System.out.println(homePlansCalc[i].toString());
//		    hp.printItem();
		    
		}*/
		
//		System.out.println(Arrays.toString(homePlansCalc));
//	    PrintHomePlans.printFooter();	    
//	    PrintHomePlans.print();
//		PrintHomePlans php = new PrintHomePlans(homePlansCalc[]);

	}

	
}
