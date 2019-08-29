package labexercise;

import side.InvalidAgeException;

public class Exception {
// Creating a custom exception
	public static void main(String args[]) {
		try {
			CustomException exception1 = new CustomException();
			exception1.setAge(25);
			System.out.println(exception1.getAge());
		}catch(InvalidAgeException m) {
			System.out.println("Exception ocurred:"+ m);
		}
		
	}

}
