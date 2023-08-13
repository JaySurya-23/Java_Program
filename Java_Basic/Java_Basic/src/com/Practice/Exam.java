package com.Practice;

//class A

//{
//
//	int i;
//	String s;
//	A(int i,String str)
//	{
//		i=i;
//		s=str;
//	}
//}
//public class Exam {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//         A a=new A(4,"abc");
//         System.out.println(a.i + a.s);
//         
//	}
//
//}

//public class Exam {
//	public static void main(String[] args) {
//		Parent ch1 = new Child();
//		System.out.println(ch1.num);
//		ch1.show();
//	}
//}
//
//class Parent {
//	int num = 100;
//
//	public void show() {
//		System.out.println(" I am parent");
//	}
//}
//
//class Child extends Parent {
//	int num = 200;
//
//	public void show() {
//		System.out.println(" I am child");
//	}
//}

//public class Exam {
//	public static void main(String[] args) {
//		AB ab = new AB();
//		ab.showVar();
//	}
//}
//
//class AB {
//	int rollNo;
//	String name;
//
//	public static void showVar() {
//		System.out.println(" roll no= " + rollNo + " name=" + name);
//	}
//}

//public class Exam {
//	public static void main(String[] args) {
//		D d = new D("Blue");
//		System.out.println(d.color);
//	}
//}
//
//class C {
//	int id;
//	String name;
//
//	C(int id) {
//		this.id = id;
//	}
//}
//
//class D extends C {
//	String color;
//	String type;
//
//	D() 
//	{
//		this.color = "Red";
//	}
//
//	D(String color) {
//		this();
//		this.color = color;
//	}
//}
public class Exam{
public static void main(String[] args) {
Tree rose = new Tree();
Tree tulip = new Tree();
Flower f=new Flower() ;

f.color= "red" ;
f.petals = new Petals();
f.petals.noOfPetals = 5;
f.petals.shape= "round" ;
rose.f = f ;
tulip.f = rose.f ;
f.color = "white" ;
f.petals = new Petals();
f.petals.noOfPetals =4 ;
f.petals.shape= "oval" ; 
System.out.println(tulip.f.petals.noOfPetals);
System.out.println(tulip.f.petals.shape);
}}
class Tree { 
int height ; 
Flower f ; 
}
class Flower {
String color ;
Petals petals ;}
class Petals {
int noOfPetals ;
String shape ; }
