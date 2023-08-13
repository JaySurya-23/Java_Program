package com.oops;

public class Student_Marks {

	int stud_id;
	String stud_name;
	int math;
	int sci;
	int com;
	float total;
	float per;

	public void acceptdetail(int id, String name, int m, int s, int c) {
		stud_id = id;
		stud_name = name;
		math = m;
		sci = s;
		com = c;

	}

	public void persentage() {
		total = math + sci + com;
		per = (total / 300) * 100;

	}

	public void Dislpay() {
		System.out.println(stud_id + " " + stud_name + " " + math + " " + sci + " " + com + " Total marks = " + total
				+ " Persentage " + per);
	}

	public void gread() {
		if (per > 75) {
			System.out.println(" Gread A \n");
		}

		else if (per > 65) {

			System.out.println(" Gread B \n");
		} else if (per > 55) {

			System.out.println(" Gread C \n");
		}

		else if (per > 36) {

			System.out.println(" Gread D\n");
		}

		else {
			System.out.println(" Fail \n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_Marks sm = new Student_Marks();
		sm.acceptdetail(1, "Jay", 75, 60, 85);
		sm.persentage();
		sm.Dislpay();
		sm.gread();

		Student_Marks sm1 = new Student_Marks();
		sm1.acceptdetail(2, "raj", 30, 20, 5);
		sm1.persentage();
		sm1.Dislpay();
		sm1.gread();

		Student_Marks sm2 = new Student_Marks();
		sm2.acceptdetail(3, "Surya", 40, 60, 56);
		sm2.persentage();
		sm2.Dislpay();
		sm2.gread();

	}

}
