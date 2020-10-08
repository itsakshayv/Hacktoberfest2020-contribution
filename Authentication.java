import java.util.Scanner;
class Main{
	public static void main(String []args){
		String name;
		String pass;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Usename: ");
		name=scanner.nextLine();
		System.out.print("Enter your password: ");
		pass=scanner.nextLine();
		Authentication a=new Authentication();
		User user = new User();
		user.setUsername(name);
		user.setPassword(pass);
		try{
			a.isAuthentication(user);
		}catch(Loginfail loginfail){
			loginfail.printStackTrace();
	}
  }
}
class Authentication{
	public boolean isAuthentication(User user) throws Loginfail{
		if(user.getUsername().equals(user.getPassword())){
			System.out.println("Login Successfull");
			return true;
		}
		else{
			throw new Loginfail ("Invalid username or password");
		}
	}
}
class Loginfail extends Exception{
	String msg=null;
	public Loginfail(){
	}
	public Loginfail(String msg){
		this.msg=msg;
	}
	public String toString(){
		return msg;
	}
}
class User{
	String username;
	String password;
	String getUsername(){
		return username;
	}
	void setUsername(String username){
		this.username=username;
	}
	String getPassword(){
		return password;
	}
	void setPassword(String password){
		this.password=password;
	}
}