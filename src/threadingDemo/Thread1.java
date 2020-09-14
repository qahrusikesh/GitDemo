package threadingDemo;

public class Thread1 extends Thread {
	public void run() {
	for(int i=0; i<10;i++) {
		System.out.println(i+". user define thread");
	}
	
	}
	
	public static void main(String[] args) { //main thread 
		Thread1 t=new Thread1();
		t.start();
		for(int i=0; i<10;i++) {
			System.out.println(i+". Main thread");
		}
		}

}
