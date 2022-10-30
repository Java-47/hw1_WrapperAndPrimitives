package telranhw.wrapper.controller;

public class hw1 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Max byte: "+ Byte.MAX_VALUE);
			System.out.println("Min byte: " + Byte.MIN_VALUE);
			System.out.println("Max Integer: "+ Integer.MAX_VALUE);
			System.out.println("Min Integer: " + Integer.MIN_VALUE);
			System.out.println("Max Short: "+ Short.MAX_VALUE);
			System.out.println("Min Short: " + Short.MIN_VALUE);
			System.out.println("Max Long: "+ Long.MAX_VALUE);
			System.out.println("Min Long: " + Long.MIN_VALUE);
			System.out.println("Max Character: "+ +Character.MAX_VALUE);
			System.out.println("Min Character: " + +Character.MIN_VALUE);
			System.out.println("Max Float: "+ Float.MAX_VALUE);
			System.out.println("Min Float: " + Float.MIN_VALUE);
			System.out.println("Max Double: "+ Double.MAX_VALUE);
			System.out.println("Min Double: " + Double.MIN_VALUE);
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
