package odevGun2;

public class Student extends User{
	private int studentAge;
	private String studentUniversity;

	public Student() {

	}

	public Student(int id, String studentFirstName, String studentLastName, int studentAge, String studentUniversity) {
		super();
		this.studentAge = studentAge;
		this.studentUniversity = studentUniversity;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentUniversity() {
		return studentUniversity;
	}

	public void setStudentUniversity(String studentUniversity) {
		this.studentUniversity = studentUniversity;
	}
}
