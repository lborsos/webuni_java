package net.lacisoft.houseplans2;


public class AreaSmallerThanComparator implements Comparator{
	float area;
	
	public AreaSmallerThanComparator(float area) {
		this.area = area;
	}
	
	@Override
	public boolean isMatch(HomePlan plan) {
		return plan.area < area;
	}
}
