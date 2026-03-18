public class HelloApp{
	public static void main(String[] args){
		String name = "World";
		if (args.length > 0) name = args[0];
		System.out.println("Hello ");
		for (int i = 0; i < args.length; i++){
			if (args[i] == " ") System.out.println (",");
			System.out.println (name);
		}
		System.out.println ("!");
	}
}