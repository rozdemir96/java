package kodlamaIO;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println(student.getFirstName() + " isimli öğrenci " + student.getCourseId() + " id'li kursu listesine ekledi.");
	}
	
	public void welcome(Student student, String message) {
		System.out.println("Merhaba, " + student.getFirstName() + ". " + message);
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " isimli öğrenci " + student.getCourseId() + " id'li kursu listesinden çıkardı.");
	}
}
