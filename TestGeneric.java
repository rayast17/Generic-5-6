package recursion;

import java.util.Scanner;

public class TestGeneric {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericStack<String> stack1 = new GenericStack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input five strings: ");
		for (int i = 0; i < 5; i++) {
			stack1.push(sc.nextLine());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}

	}
}
