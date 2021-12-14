package kodlamaIO;

public class Student extends User{
	
	private int number;
	private int level;
	
	public Student() {
		
	}

	public Student(int id, String firstName, String lastName, int courseId, int number, int level) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setCourseId(courseId);
		this.setNumber(number);
		this.setLevel(level);
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

		
}
