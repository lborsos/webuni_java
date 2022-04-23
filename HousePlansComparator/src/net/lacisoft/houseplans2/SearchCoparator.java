package net.lacisoft.houseplans2;

public class SearchCoparator {

	public static HomePlan[] search(HomePlan[] plans, Comparator comparator) {
		HomePlan[] filteredPlans = new HomePlan[plans.length];
		int j = 0;
		for(int i = 0; i<plans.length; i++) {
			if(comparator.isMatch(plans[i])) {
				filteredPlans[j++] = plans[i];
			}
		}
		return filteredPlans;
	}

}
