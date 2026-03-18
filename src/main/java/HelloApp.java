public class HelloApp{
	public static void main(String[] args){
		String name = "World", temp_name = "";
		if (args.length > 0) name = args[0];
		System.out.println("Hello ");
		for (int i = 0; i < args.length; i++){
			if (args[i] == " ") {
				temp_name = "";
				System.out.println (",");
			}
			else {
				temp_name = temp_name + args[i];
			}
		}
		System.out.println ("!");
	}
}