package cseassign2;

public class Main_Class {
	public static void main(String args[]) {
		AddingMachine calc = new AddingMachine(); 
		calc.add(4);
		calc.subtract(2);
		calc.add(5);
		String nums;
		nums = new String(" ");
		nums = calc.toString();
		int i;
		i = calc.getTotal();
		System.out.println(nums + "= " + i);
		calc.clear();
		nums = calc.toString();
		i = calc.getTotal();
		System.out.println(nums + "= " + i);
	}

}
