package kodlamaIO;

public class InstructorManager extends UserManager{
	
	public void add(Instructor instructor) {
		System.out.printf("%s isimli e�itmen %d id'li kursu sisteme ekledi.\n", instructor.getFirstName(), instructor.getCourseId());
	}
	
	public void update(Instructor instructor) {
		System.out.printf("%s isimli e�itmen %d id'li kursu g�ncelledi.\n", instructor.getFirstName(), instructor.getCourseId());
	}
	
	public void delete(Instructor instructor) {
		System.out.printf("%s isimli e�itmen %d id'li kursu sistemden sildi.\n", instructor.getFirstName(), instructor.getCourseId());
	}
}
