package studentdatabaseapp;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.enroll();
		stu1.payTuition();
		System.out.println(stu1.toString());
	}
}
