package cseassign3;

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
		
		Calculator jim = new Calculator(); 
		jim.add(4);
		jim.subtract(2);
		jim.add(5);
		jim.mult(6);
		jim.div(7);
		jim.power(2);
		String tot;
		tot = new String(" ");
		tot = jim.toString();
		int j;
		j = jim.getTotal();
		System.out.println(tot + "= " + j);
		jim.div(0);
		tot = jim.toString();
		j = jim.getTotal();
		System.out.println(nums + "= " + j);
		jim.add(4);
		jim.power(-1);
		tot = jim.toString();
		j = jim.getTotal();
		System.out.println(nums + "= " + j);
		jim.add(4);
		jim.clear();
		tot = jim.toString();
		j = jim.getTotal();
		System.out.println(nums + "= " + j);
	}

}
