package kodlamaIO;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName() + " sisteme giriþ yaptý.");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName() + " sistemden çýkýþ yaptý.");
	}
}
