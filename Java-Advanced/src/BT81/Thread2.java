package BT81;

public class Thread2 extends Thread {
	//Khoi tao thoi gian bat dau chay
	long start = (long) System.currentTimeMillis();

	RandomCharacter rdc;

	public Thread2(RandomCharacter rdc) {
		this.rdc = rdc;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (rdc) {
				rdc.notifyAll();
				try {
					rdc.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Khoi tao thoi gian chay
				long end = (long) System.currentTimeMillis();
				//Chuyen doi chu thuong thanh chu hoa theo bang ASCII
				int upperChar = (int) rdc.getC();
				System.out.println("Thread 2 UpperChar Thread 1: " + (char) (upperChar - 32));
				//Chay 20s dung chuong trinh
				if (end - start > 20000) {
					System.out.println("Exit!!");
					System.exit(0);
				}
			}

			try {
				Thread2.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
