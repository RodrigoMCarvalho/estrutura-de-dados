import java.util.Stack;

class ExPilha5 {
	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(stack.isEmpty());

		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);


	}
}