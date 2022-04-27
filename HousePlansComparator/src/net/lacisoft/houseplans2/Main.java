/*
  ____                             _       __          _   __                             
 |  _ \                           | |     /_/         | | /_/                             
 | |_) | ___  _ __ ___  ___  ___  | |     __ _ ___ ___| | ___                             
 |  _ < / _ \| '__/ __|/ _ \/ __| | |    / _` / __|_  / |/ _ \                            
 | |_) | (_) | |  \__ \ (_) \__ \ | |___| (_| \__ \/ /| | (_) |                           
 |____/ \___/|_|  |___/\___/|___/ |______\__,_|___/___|_|\___/   _ _                      
 | | |                               ____                       (_) |                     
 | | |__   ___  _ __ ___  ___  ___  / __ \  __ _ _ __ ___   __ _ _| |  ___ ___  _ __ ___  
 | | '_ \ / _ \| '__/ __|/ _ \/ __|/ / _` |/ _` | '_ ` _ \ / _` | | | / __/ _ \| '_ ` _ \ 
 | | |_) | (_) | |  \__ \ (_) \__ \ | (_| | (_| | | | | | | (_| | | || (_| (_) | | | | | |
 |_|_.__/ \___/|_|  |___/\___/|___/\ \__,_|\__, |_| |_| |_|\__,_|_|_(_)___\___/|_| |_| |_|
                                    \____/  __/ |                                         
                                           |___/                                          
*/
//		Borsos László	lborsos@gmail.com

package net.lacisoft.houseplans2;

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
		System.out.println(HPToString.convert(homePlans));
//		System.out.println(HPToString.convert(Search.findPlansSmallerThan(homePlans, 100)));
//		System.out.println(HPToString.convert(Search.findPlansCheaperThan(homePlans, 1500)));

		
		Comparator cx = new AreaSmallerThanComparator(100);
		Comparator cy = new CostSmallerThanComparator(1500);
		System.out.println(HPToString.convert(SearchCoparator.search(homePlans, cx)));
		System.out.println(HPToString.convert(SearchCoparator.search(homePlans, cy)));
		System.out.println(HPToString.convert(SearchCoparator.search(homePlans, new CostSmallerThanComparator(2000))));
	}

}
