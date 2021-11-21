package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("ID: " + id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Info: " + id + "," + name);
	}

	public void getStudentInfo(String email, int phone) {
		System.out.println("Email: " + email + "," + phone);
	}

	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(111);
		s.getStudentInfo(111, "Saran");
		s.getStudentInfo("saranpvino@gmail.com", 1234567);
	}

}
