package thread_generate;

public class ThreadTest1 extends Thread {
	
	@Override 
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("thread ����"+(i+1));
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest1 t1 = new ThreadTest1();	//new born ����
		t1.start();

	}

}
