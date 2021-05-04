package odevGun2;

public class UserManager {
	public void userAdd(User user) {

		System.out.println(user.getFirstname() + " isimli user kaydedildi");

	}

	public void userDelete(User user) {

		System.out.println(user.getFirstname() + " isimli user silindi");

	}
}
