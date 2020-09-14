package threadingDemo;

public class Threadrun8 {

	public static void main(String[] args) {
		Thread8 t1=new Thread8();
		t1.start();
		Thread9 t2=new Thread9();
		t2.start();
		Thread10 t3=new Thread10();
		t3.start();
		new Thread8().start();
		new Thread9().start();
		new Thread10().start();

	}

}
