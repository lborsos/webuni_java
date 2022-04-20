package net.lacisoft.houseplanslaci;

public class Search {

	public static HomePlan[] findPlansSmallerThan(HomePlan[] plans, float area) {
		HomePlan[] filteredPlans = new HomePlan[plans.length];
		int j = 0;
		for(int i = 0; i<plans.length; i++) {
			if(plans[i].area < area) {
				filteredPlans[j] = plans[i];
				j++;
			}
		}
		return filteredPlans;
	}
	
	public static HomePlan[] findPlansCheaperThan(HomePlan[] plans, float price) {
		HomePlan[] filteredPlans = new HomePlan[plans.length];
		int j = 0;
		for(int i = 0; i<plans.length; i++) {
			if(HomePlanCalc.calculatePriceForPlan(plans[i]) < price) {
				filteredPlans[j] = plans[i];
				j++;
			}
		}
		return filteredPlans;
	}
	
	
	/*
	HomePlanCalc[] homePlanCalc;
	HomePlanCalc[] homePlanCalcFiltered;
	
	Search (HomePlanCalc[] homePlansCalc) {
		this.homePlanCalc = homePlansCalc;
	}
	
	private void filter() {
		for (int i=0; i<homePlanCalc.length; i++) {
			
		}
	}
	
	public static HomePlanCalc[] areaFilter(float area) {
		return homePlanCalc;
	}
	
	public boolean areaIsLess(float area) {
		return homePlan.area < area;
	}

	public boolean costIsLess(float cost) {
		CalcWorkmanshipCost calcWC = new CalcWorkmanshipCost(homePlan);
		return calcWC.Calc() < cost;
	}*/
	
	
}
