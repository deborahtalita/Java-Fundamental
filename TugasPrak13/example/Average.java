package example;

public class Average<T extends Number> {
	T[] nums;
	
	public Average(T[] nums) {
		this.nums = nums;
	}
	
	double findAverage() {
		double sum = 0.0;
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		return sum / nums.length;
	}
	
	public static void main(String args[]) {
		Double num[] = { 8.2, 2.5, 1.0, 5.7, 7.1, 9.6, 0.2 };
		
		Average<Double> n = new Average<Double>(num);
		double ave = n.findAverage();
		System.out.println("Average: " + ave);
	}
}
