package week3.day1;

public class Student extends Department{// Child extend Parent
	public void studentName() {
		System.out.println("Student Name");
	}

	public void studentDept() {
		System.out.println("Student Department " + str);// global variable from parent class
	}

	public void studentId() {
		System.out.println("Student Id");
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.str);
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}

}
