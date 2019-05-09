package BT80;

import java.util.Random;

public class Thread1 extends Thread {
	Thread2 t2;
	SharedData data;

	public Thread1(SharedData data) {
		this.data = data;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random rad = new Random();
		while (true) {
			int number = rad.nextInt(101);
			data.setTotal(number);
			System.out.println("Thread1 number:" + number);
			System.out.println("total:"+data.getTotal());
			if (data.getTotal() > 100 || data.getTotal() < -100) {
				System.out.println("stop!!");
				System.exit(0);
				
			}
			try {
				Thread1.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}