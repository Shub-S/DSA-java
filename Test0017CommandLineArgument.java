public class Test0017CommandLineArgument{
	public static void main (String ...args){
		if (args.length > 0){
			System.out.println("Arguments are");
			for (String x : args)
			System.out.print(x + " ");
		}else
			System.out.println("No Arguments");
	}
}