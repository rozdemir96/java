package kodlamaIO;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getFirstName() + " isimli ��renci " + student.getCourseId() + " id'li kursu listesine ekledi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " isimli ��renci " + student.getCourseId() + " id'li kursu listesinden ��kard�.");
	}
}
