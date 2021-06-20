package test;

import java.util.Scanner;

public class student {

	String id;
	int Course_A;
	int Course_B;
	int Course_C;
	int Course_D;
	student(){}
	student(String Id,int Course_a,	int Course_b,int Course_c,int Course_d){
		id=Id;
		Course_A=Course_a;
		Course_B=Course_b;
		Course_C=Course_c;
		Course_D=Course_d;
	}
	public void in() {
        @SuppressWarnings("resource")
 //       Sysyem.out.println("输入学生"+id+"成绩");
		Scanner scan = new Scanner(System.in);
        id=scan.next();
		Course_A=scan.nextInt();
		Course_B=scan.nextInt();
		Course_C=scan.nextInt();
		Course_D=scan.nextInt();
	}
}
