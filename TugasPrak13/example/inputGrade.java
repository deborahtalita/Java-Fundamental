package example;

// Java Generic Class
public class inputGrade <T>{
	private T NIM;
	private T grade;
	
	public inputGrade(T NIM, T grade) {
		this.NIM = NIM;
		this.grade = grade;
	}

	public T getNIM() {
		return NIM;
	}

	public T getGrade() {
		return grade;
	}
	
	public static void main(String[] args) {
		inputGrade<Integer> student1 = new inputGrade<Integer>(201511014,80);
		inputGrade student2 = new inputGrade<>(201511099,"B");
		
		System.out.println(student1.getNIM() + " - Nilai: " + student1.getGrade());
		System.out.println(student2.getNIM() + " - Nilai: " + student2.getGrade());
	}
}

