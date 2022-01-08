import static java.lang.Thread.sleep;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Hewan("Harimau"));
		Thread t2 = new Thread(new Hewan("Angsa"));
		Thread t3 = new Thread(new Hewan("Gajah"));
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class Hewan implements Runnable{
	String nama;
	
	// konstruktor
	public Hewan(String n) {
		nama = n;
	}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hewan: " + nama + " - " + i);
		}
	}
}
