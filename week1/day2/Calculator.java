package week1.day2;

import java.security.DomainCombiner;

public class Calculator {
	public void addTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subTwoNumbers(int e,int f ) {
		int g=e-f;
		System.out.println(g);
	}
	public void multiplyTwoNumbers(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divideTwoNumbers(float x,float y) {
		float z=x+y;
		System.out.println(z);
	}
	
	
public static void main(String[] args) {
	Calculator calc = new Calculator();
	calc.addTwoNumbers(12, 22);
	calc.subTwoNumbers(33, 22);
	calc.multiplyTwoNumbers(88.234, 21.3466);
	calc.divideTwoNumbers(98.75F, 20.50F);
	
}
	
}