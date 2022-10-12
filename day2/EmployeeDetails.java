package week1.day2;

public class EmployeeDetails {
  public void EmpDetail() { 
	  String empName = "DEVA S";
	  int empId = 5901234;
	  System.out.println("EmpNmae :" + empName);
	  System.out.println("ID :" + empId);
	}
	
  public void EmpAddress() {
	  String empAddress ="coimbatore";
	  System.out.println(empAddress);
  }
  public void EmpSalary() {
	  double empSalary = 69999.9999;
	  System.out.println(empSalary);
  }
  public void EmpMobNumber() {
	  long empMobNum = 6272938990L;
	  System.out.println(empMobNum);
  }
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.EmpDetail();
		emp.EmpAddress();
		emp.EmpSalary();
		emp.EmpMobNumber();
		
	}
	
	
}
