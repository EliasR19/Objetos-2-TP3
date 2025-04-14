package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Counter count = new Counter();
		
		//Integer[] numsArr = {1,2,3,4,5,6,7,8,9,10,11};
		//List<Integer> nums = Arrays.asList(numsArr);

		//count.setNums(nums);
		
		
		count.addNumber(111);
		count.addNumber(3332);
		count.addNumber(555);
		count.addNumber(204452);

		
		System.out.println(count.cantImpares());
		System.out.println(count.cantPares());
		System.out.println(count.cantMultiplos(7));
		
		/////////PUNTO 2////////
		System.out.println("\nPUNTO 2");
		System.out.println("PUNTO2 " + count.maxEvenDigitsNumCount());
		
		System.out.println("PUNTO2: " + count.numToList(4545164));
	
	
	//////////// PUNTO 3//////////
		System.out.println("\nPUNTO 3");
		System.out.println(count.numMaxMultiplo(3, 9));
		
		////PUNTO 6//////
		System.out.println("\nPUNTO 6");
		Multioperador multiOp =  new Multioperador();
		
		multiOp.addNumber(10);
		multiOp.addNumber(5);
		multiOp.addNumber(2);
		multiOp.addNumber(4);

		System.out.println("Sum: " + multiOp.sumNumList());
		System.out.println("Sub: " + multiOp.subNumList());
		System.out.println("Mul: " + multiOp.mulNumList());
		
		
		
		
		
		
		
	}

}
