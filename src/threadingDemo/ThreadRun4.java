package threadingDemo;

public class ThreadRun4 {

	public static void main(String[] args) {
		Thread4 t=new Thread4();
		t.start();
		for(int i=1;i<=10;i++) {
			System.out.println(1+". main thread");
		}
				

	}

}
