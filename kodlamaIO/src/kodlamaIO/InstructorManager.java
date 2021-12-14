package kodlamaIO;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.printf("%s isimli eðitmen %d id'li kursu sisteme ekledi.\n", instructor.getFirstName(), instructor.getCourseId());
	}
	
	public void update(Instructor instructor) {
		System.out.printf("%s isimli eðitmen %d id'li kursu güncelledi.\n", instructor.getFirstName(), instructor.getCourseId());
	}
	
	public void delete(Instructor instructor) {
		System.out.printf("%s isimli eðitmen %d id'li kursu sistemden sildi.\n", instructor.getFirstName(), instructor.getCourseId());
	}
}
