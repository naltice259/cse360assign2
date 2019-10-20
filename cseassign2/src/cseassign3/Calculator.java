package cseassign3;

public class Calculator {
	protected int total;
	protected String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = new String("0 ");
	}
	public int getTotal () {
		return total;
	}
	public void add (int value) {
		total = total + value;
		history = history + "+ " + value + " ";
	}
	public void subtract (int value) {
		total = total - value;
		history = history + "- " + value + " ";
	}
	public void mult (int value) {
		total = total * value;
		history = "(" + history + ")" + "* " + value + " ";
	}
	public void div (int value) {
		if(value == 0) {
			total = 0;
			history = "(" + history + ")" + "/ " + value + " ";
		}else {
			total = total / value;
			history = "(" + history + ")" + "/ " + value + " ";
		}
	}
	public void power (int value) {
		if(value < 0) {
			total = 0;
			history = "(" + history + ")" + "^ " + value + " ";
		}else if(value > 0) {
			for(int i = 1; i < value; i++) {
				total = total*total;
			}
			history = "(" + history + ")" + "^ " + value + " ";
		}else {
			total = 1;
			history = "(" + history + ")" + "^ " + value + " ";
		}
	}
	public String toString () {
		return history;
	}
	public void clear() {
		total = 0;  // not needed - included for clarity
		history = new String("0 ");
	}
}
