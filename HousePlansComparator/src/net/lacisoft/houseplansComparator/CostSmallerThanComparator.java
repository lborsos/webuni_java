package net.lacisoft.houseplansComparator;

public class CostSmallerThanComparator implements Comparator {
	float cost;
	
	public CostSmallerThanComparator(float cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean isMatch(HomePlan plan) {
		return HomePlanCalc.calculatePriceForPlan(plan) < cost;
	}
}
