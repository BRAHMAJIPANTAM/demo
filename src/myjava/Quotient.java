package myjava;
import java.util.*;
public class Quotient {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int num,div,rem,divi;
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		div=sc.nextInt();
		rem=num%div;
		System.out.println(rem);
		divi=num/div;
		System.out.println(divi);
	}

}
