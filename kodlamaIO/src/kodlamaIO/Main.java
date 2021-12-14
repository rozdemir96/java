package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(0);
		student.setFirstName("Recep");
		student.setLastName("Özdemir");
		student.setCourseId(2);
		student.setLevel(1);
		student.setNumber(1111);
		System.out.println(student.getFirstName() + " " +  student.getLastName());
		
		Instructor instructor = new Instructor(0, "Engin", "Demiroğ", 0, "Biyografi...");
		System.out.println(instructor.getBiography());
		
		UserManager userManager = new UserManager();
		userManager.login(student);
		userManager.logout(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.welcome(student, "Kursa hoş geldin...");
		studentManager.delete(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
	
	}
}
