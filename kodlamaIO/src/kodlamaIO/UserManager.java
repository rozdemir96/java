package kodlamaIO;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " sisteme giri� yapt�.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " sistemden ��k�� yapt�.");
	}
}
