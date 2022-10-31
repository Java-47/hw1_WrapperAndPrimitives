package telranhw.wrapper.controller;

public class hw1 {

	public static void main(String[] args) {
		if (args.length == 0) {
			String[] arr = new String[] {"byte", "int", "short", "long", "char", "float", "double"};
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				checker(arr[i]);
				}
		}else {
		for (int i = 0; i < args.length; i++) {
			
			checker(args[i]);
			}
		}

	}
	public static void checker(String primitive)
	{
		
		switch (primitive) {
		case "byte":
			System.out.println("Max: "+ Byte.MAX_VALUE);
			System.out.println("Min: " + Byte.MIN_VALUE);
			break;
		case "int":
			System.out.println("Max: "+ Integer.MAX_VALUE);
			System.out.println("Min: " + Integer.MIN_VALUE);
			break;
		case "short":
			System.out.println("Max: "+ Short.MAX_VALUE);
			System.out.println("Min: " + Short.MIN_VALUE);
			break;
		case "long":
			System.out.println("Max: "+ Long.MAX_VALUE);
			System.out.println("Min: " + Long.MIN_VALUE);
			break;
		case "char": 
			System.out.println("Max: "+ +Character.MAX_VALUE);
			System.out.println("Min: " + +Character.MIN_VALUE);
			break;
		case "float":
			System.out.println("Max: "+ Float.MAX_VALUE);
			System.out.println("Min: " + Float.MIN_VALUE);
			break;
		case "double":
			System.out.println("Max: "+ Double.MAX_VALUE);
			System.out.println("Min: " + Double.MIN_VALUE);
			break;
			
		default:
			System.out.println(primitive + " - Error wrong primitive");
		}
	}

}
