package week1.day1;

public class Fibonocci {

	public static void main(String[] args) {

		int firstNum = 0;
		int secondNum = 1;
		int output = 0;
		System.out.println(firstNum);
		System.out.println(secondNum);
		for (int i = 2; i < 8; i++) {
			output = firstNum + secondNum; 
			firstNum = secondNum; 
			secondNum = output; 
			System.out.println(output); 

		}

	}

}
