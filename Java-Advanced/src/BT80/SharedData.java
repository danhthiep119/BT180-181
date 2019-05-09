package BT80;

public class SharedData {
	private int total=0;

	public SharedData() {

	}

	public int getTotal() {
		return total;
	}

	public synchronized void setTotal(int total) {
		this.total += total;
	}

}
