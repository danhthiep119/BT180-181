package BT81;

public class Thread1 extends Thread{
	RandomCharacter rdc;
	
	public Thread1(RandomCharacter rdc) {
		this.rdc=rdc;
	}
	
	//Khoi tao random chuoi so trong khoang min -> max
	public static int getRandomIntBetweenRange(int min, int max){
	    int x = (int) ((Math.random()*((max-min)+1))+min);
	    return x;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			Thread1.sleep(1);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while (true) {
			synchronized (rdc) {
				//Su dung ham randon de tao chu dua theo bang ma ASCII
				int charNum = getRandomIntBetweenRange(97, 122);
				rdc.setC((char) charNum);
				System.out.println("Thread 1 Character: " + (char) charNum);
				rdc.notifyAll();
				try {
					rdc.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread1.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
