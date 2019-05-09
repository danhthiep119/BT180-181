package BT80;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedData data=new SharedData();
		Thread1 t1=new Thread1(data);
		Thread2 t2=new Thread2(data);
		t1.start();
		t2.start();
		
//		if (data.getTotal() > 100 || data.getTotal() < -100) {
//			System.out.println("stop!!");
//			t1.stop();
//			t2.stop();
//		}
		
	}
}
