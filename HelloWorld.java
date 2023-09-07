public class HelloWorld {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Hello World");
		} else if (args[0].equals("hello")) {
			System.out.println("Hello World");
		} else if (args[0].equals("goodbye")) {
			System.out.println("Goodbye, cruel world!");
		} else {
			System.out.println("Hello World"); // input isnt hello or goodbye
		}
	}

}