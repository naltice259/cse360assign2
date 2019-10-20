// Nicholas Altice
// https://github.com/naltice259/cse360assign2


package cseassign3;

public class AddingMachine {
	protected int total;
	protected String history;
	
	public AddingMachine () {
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
	public String toString () {
		return history;
	}
	public void clear() {
		total = 0;  // not needed - included for clarity
		history = new String("0 ");
	}
}
