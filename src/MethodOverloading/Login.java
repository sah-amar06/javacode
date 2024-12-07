package MethodOverloading;

public class Login {
	
	public void doLogin()
	{
		System.out.println("Login with SSO");
	}
	
	public void doLogin(String un, String password)
	{
		System.out.println("Please enter your username and password : " +un +" " +password);
	}
	
	public void doLogin(String un, String password, int otp)
	{
		System.out.println("Please enter your username and passoword and OTP : " +un +" " +password + " " + otp);
	}
	
	public void doLogin(String google)
	{
		System.out.println("Please sigin with Google : " +google);
	}
	
	public void doLogin(long phone, int otp)
	{
		System.out.println("Please enter your phone number : " +phone);
	}

	public static void main(String[] args) {
		
		Login lg = new Login();
		lg.doLogin();
		lg.doLogin("abc@gmail.com");
		lg.doLogin(9823718234l, 982743);
		lg.doLogin("abc", "abc123");
		lg.doLogin("abc1", "abc6253", 938322);
				

	}

}
