package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Counter {
	
	private List<Integer> nums =  new ArrayList<Integer>();
	
	public void addNumber(int number) {
		nums.add(number);
	}
	
	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}
	
	////////////////////////////////PUNTO 1/////////////////////////////
	public int cantPares() {
		return (int)nums.stream().filter(n -> n % 2 == 0).count();
	}
	
	public int cantImpares() {
		return (int)nums.stream().filter(n -> n % 2 != 0).count();
	}
	
	public int cantMultiplos(int num) {
		return (int)nums.stream().filter(n -> n % num == 0).count();
	}
	
	
	///////////////////////////PUNTO 2////////////////////////////////////////////

	
	public int maxEvenDigitsNumCount() {
		int evenDigits = 0;
		int maxEvenDigitNum = 0;
//		for(int n : nums) {
			
			//FORMA A
//			if(cantEnvenDigits(n) > evenDigits) {
//				evenDigits = cantEnvenDigits(n);
//				maxEvenDigitNum = n;
//				
//			}
			
			//FORMA B
//			if(cantPares(numToList(n)) > evenDigits) {
//				evenDigits = cantEnvenDigits(n);
//				maxEvenDigitNum = n;
//			}
//		}
		//FORMA C si no hay devuelve el primer numero de la lista. Si tiene  la misma cantidad devuelve el primero que encontro.
		return nums.stream().max((n1,n2) -> cantPares(numToList(n1)) - (cantPares(numToList(n2)))).get();
		
		//FORMA A-B
		//return maxEvenDigitNum;
	}

	//FORMA A
	private int cantEnvenDigits(int n) {
		int count = 0;
		int numLenght = (int)Math.log10(n)+1;
		int base = (int) Math.pow(10, numLenght-1);
		for(int x = 0; x < numLenght; x++)	{
			if((n / base) % 2 == 0) {
				count++;
			}
			base = base / 10;
		}
		

		return count;
	}
	
	//FORMA B
	//pasar cada digito del numero a una lista 
	public List<Integer> numToList(int n){
		List<Integer> digitList = new ArrayList<Integer>();
		
		int numLenght = (int)Math.log10(n)+1;
		int base = (int) Math.pow(10, numLenght-1);
		
		for(int x = 0; x < numLenght; x++) {
			digitList.add(n / base);
			n = n - (n / base * base);
			base = base / 10;
		}
		
		return digitList;
	}
	
	//contar los pares de la lista dada
	private int cantPares(List<Integer> digitList) {
		return (int)digitList.stream().filter(n -> n % 2 == 0).count();
	}
	
	
	
}
