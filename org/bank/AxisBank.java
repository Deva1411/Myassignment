package org.bank;

public class AxisBank extends BankInfo {
   public void deposit() {
	   System.out.println("Deposit Amount");
}
   public static void main(String[] args) {
	   AxisBank info=new AxisBank();
	   info.savings();
	   info.fixed();
	   info.deposit();
}
}
