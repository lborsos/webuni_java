package edu.evacodekitchen.javabasics.series.fibo;

public class FiboNumberGeneretor{
	
	private int n;
	private float[] elements;

	public FiboNumberGeneretor(int n) {
		this.n = n;
		elements = new float[n];
	}
		
	public float[] calculateElements() {
		for (int i = 0; i < n; i++) {
			elements[i] = calculateElementAt(i);
		}
		return elements;
	}

	protected float calculateElementAt(int index) {
		return index<2 ? 1f : elements[index-1]+elements[index-2];
	}
	
}
