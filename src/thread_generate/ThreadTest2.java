package thread_generate;

public class ThreadTest2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<100; i++) {
			System.out.println("thread 실행"+(i+1));
			try {
				Thread.sleep(200);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest2 t2 = new ThreadTest2();	
		Thread t = new Thread(t2);//new born 상태
		t.start();

	}

}
