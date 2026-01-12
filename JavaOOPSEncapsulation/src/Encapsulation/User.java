package Encapsulation;

public class User {
	private String email;
	 private String password;
	 public void setEmail(String email) {
	 this.email = email;
	 }
	 public void setPassword(String password) {
	 if(password.length() >= 8)
	 this.password = password;
	 }


}
