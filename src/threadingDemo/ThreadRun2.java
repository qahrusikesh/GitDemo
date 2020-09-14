package threadingDemo;

public class ThreadRun2 {

	public static void main(String[] args) {
		Thread2 t=new Thread2();
		t.run();
		for(int i=0;i<10;i++) {
			System.out.println(i+". main thread");
		}
	}

}
