package ryu.java.ch01;

public class Ex01 {
	static int a = 10;
	int b = 010;
	static int c = 0x999;
	static long d = 10;
	long e = 01110;
	long f = 0x7fff_ffff_ffff_ffffL;
	static float g = 1.0f/3.0f;
	static int i = 110/3;
	static double h = g/i;
	static double a1 = (double)g;
	static int a2 = (int)g;
	String c1 = "남자";
	char c2 = '남';
	int i1 = 31;
	int v1 = 100;
		
	public static void pi(String c1, char c2, int i1) {
		System.out.println("성별1 : " + c1);
		System.out.println("성별2 : " + c2);
		System.out.println("나이 : " + i1);
	}

	public void pi1() {
		String c1 = "여자";
		char c2 = '여';
		int i1 = 30;
		System.out.println("성별1 : " + c1);
		System.out.println("성별2 : " + c2);
		System.out.println("나이 : " + i1);
	}
	
	public static void main(String[] args) {
		System.out.printf("%c",'d');
		System.out.println();
		System.out.printf("%6c", 'b', "c");
		System.out.println();
		System.out.printf("%s", "c");
		System.out.printf("%6s", 'b', "c");
		System.out.println();
		System.out.println(a);
		Ex01 ex01 = new Ex01();
		System.out.println(ex01.b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(ex01.e);
		System.out.println(ex01.f);
		System.out.println(Ex01.g);
		System.out.println(Ex01.h);
		System.out.println(g>h);
		System.out.println(g<h);
		System.out.println(a1);
		System.out.println(a2);
		/*String c1 = "남자";
		char c2 = '남';
		int i1 = 31;
		pi(c1, c2, i1);*/
		pi(ex01.c1,ex01.c2,ex01.i1);
		int v1 = 300;
		System.out.println(v1);
		System.out.println(ex01.v1);
		System.out.println(new Ex01().v1);
		ex01.pi1();
	}
}
