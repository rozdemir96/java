package kodlamaIO;

public class Instructor extends User{
	
	private String biography;

	public Instructor() {

	}
	
	public Instructor(int id, String firstName, String lastName, int courseId, String biography) {
		super();
		System.out.println("Üstte super çaðrýldý.");
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setCourseId(courseId);
		this.setBiography(biography);
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}
	
}
