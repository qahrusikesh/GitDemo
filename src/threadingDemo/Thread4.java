package threadingDemo;

public class Thread4 extends Thread {
	public void start() {
		for(int i=1; i<=10;i++) {
			System.out.println(i+". usedrdefined Thread");
		}
	}

}
