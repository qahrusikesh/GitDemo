package threadingDemo;

public class Thread6 extends Thread{
	public void run() {
		m1();
		m2();
		m3();
	}
	public void m1() {System.out.println("m1");}
	public void m2() {System.out.println("m2");}
	public void m3() {System.out.println("m3");}
}
