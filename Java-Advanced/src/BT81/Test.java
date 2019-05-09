package BT81;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomCharacter rdc=new RandomCharacter();
		Thread1 t1=new Thread1(rdc);
		Thread2 t2=new Thread2(rdc);
		t1.start();
		t2.start();
	}

}
