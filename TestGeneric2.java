package recursion;

import java.util.Scanner;

public class TestGeneric2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GeneericStack2<String> stack = new GeneericStack2<>();
		System.out.print("Enter five strings: ");
		for (int i = 0; i < 5; i++) {
			stack.push(input.next());
		}
		while (!stack.isEmpty())

			System.out.println(stack.pop() + " ");

	}

}
