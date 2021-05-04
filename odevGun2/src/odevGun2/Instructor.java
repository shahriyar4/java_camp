package odevGun2;

public class Instructor extends User{

	private String onlineCourseInTheInstructor;

	public Instructor() {

	}

	public Instructor(String onlineCourseInTheInstructor) {
		super();
		this.onlineCourseInTheInstructor = onlineCourseInTheInstructor;
	}

	public String getonlineCourseInTheInstructor() {
		return onlineCourseInTheInstructor;
	}

	public void setonlineCourseInTheInstructor(String programmingLanguageByTheInstructor) {
		this.onlineCourseInTheInstructor = programmingLanguageByTheInstructor;
	}

}
