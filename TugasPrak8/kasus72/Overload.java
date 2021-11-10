package kasus72;

class Overload {
	void demo (int a) {
		System.out.println("a: "+a);
	}
	void demo(int a, int b) {
		System.out.println("a: "+ a);
	}
	double demo(double a) {
		System.out.println("double a: "+a);
		return a*a;
	}
}
