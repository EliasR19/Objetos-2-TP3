package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	private List<Integer> nums =  new ArrayList<Integer>();
	
	public void addNumber(int number) {
		nums.add(number);
	}
	
	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}
	
	public int sumNumList() {
		return nums.stream().reduce(0, (a,b) -> a + b);
	}
	public int subNumList() {
		return nums.stream().reduce(0, (a,b) -> a - b);
	}
	public int mulNumList() {
		return nums.stream().reduce(1, (a,b) -> a * b);
	}
}
