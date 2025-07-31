package Codes;

public class WrapperExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		Integer i = Integer.valueOf(a); // converting int into Integer explicitly
		Integer j = a; // autoboxing, compiler converts this to Integer.valueOf(a)
		System.out.println(a + " " + i + " " + j);

	}
}