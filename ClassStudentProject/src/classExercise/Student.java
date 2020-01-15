package classExercise;

public class Student {
	
	private String name;
	private String course;
	private double JavaScore;
	private double SQLScore;
	private double WebScore;
	
	public Student(String name, String course, double JavaScore, double SQLScore, double WebScore) {
		this.name = name;
		this.course = course;
		this.JavaScore = JavaScore;
		this.SQLScore = SQLScore;
		this.WebScore = WebScore;
	}
	
	public Student() {
		this.name = null;
		this.course = null;
		this.JavaScore = 0.0;
		this.SQLScore = 0.0;
		this.WebScore = 0.0;
		}
	
	public void InClass() {
	System.out.println("Learning Java");	
	}
	
	public void pass() {
		double avg=(JavaScore+SQLScore+WebScore)/3;
		
		if(avg>=70) {
		System.out.println("Pass: "+avg);
	}
	}
	
	public void fail() {
		double avg=(JavaScore+SQLScore+WebScore)/3;	
		
		if(avg<70) {
		System.out.println("Fail: "+avg);
	}

}
}
