package threadingDemo;

public class ThreadRun3 {

	public static void main(String[] args) {
		Thread3 t=new Thread3();
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println(i+". Main thread");
		}

	}

}
