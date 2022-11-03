package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("DEVA");
	}
    public void studentDept() {
    	System.out.println("IT");
    }
    public void studentId() {
		System.out.println("19bit010");
	}
    public static void main(String[] args) {
    	Student det=new Student();
    	det.collegeName();
    	det.collegeCode();
    	det.collegeRank();
    	det.deptName();
    	det.studentName();
    	det.studentDept();
        det.studentId();
	}
}
