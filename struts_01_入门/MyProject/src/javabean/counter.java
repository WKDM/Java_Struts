package javabean;

public class counter {
	int count=0;
	public counter(){}
	public int getCount() {
		count++;
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
