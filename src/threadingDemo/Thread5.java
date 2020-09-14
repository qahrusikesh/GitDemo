package threadingDemo;

public class Thread5 extends Thread {
	public void run() {
		for(int i=1; i<=10;i++) {
			System.out.println(i+".  O-arg RunMethod");
		}
		run(10);
	}
	public void run(int x) {
		for(int i=1; i<=10;i++) {
			System.out.println(i+".  1-arg RunMethod");
		}
	}

}
