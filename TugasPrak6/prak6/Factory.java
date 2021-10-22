package prak6;

import java.util.List;

class Factory {
	private String name;
	private List<ProductCategory> pcategory; // Aggregation antara ProductCategory dan Factory
	private List<Distributor> distributors; // Composition antara Distributor dan Factory
	
	Factory(String name, List<ProductCategory> pcategory){ // aggregation
		this.name = name;
		this.pcategory = pcategory;
	}
	
	public String getName() {
		return name;
	}
	
	public List<ProductCategory> getPcategory(){
		return pcategory;
	}
	
	Factory(List<Distributor> distributors){ // composition
		this.distributors = distributors;
	}
	
	public List<Distributor> getDistributors(){
		return distributors;
	}
	
	// menghitung jumlah distributor
	public int getTotalDistributor(){
		int totalDist = 0;
		for(Distributor dist : distributors) {
			totalDist++;
		}
		return totalDist;
	}
	
	public void distStatus(Status s) { // dependences
		s.on_process();
	}
}
