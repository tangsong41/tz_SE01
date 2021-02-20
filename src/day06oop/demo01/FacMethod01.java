package day06oop.demo01;

import java.util.Scanner;

public class FacMethod01 {
	
	public void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			
			
			
			
		}
		
	}
	
	public boolean search(int a ,int[] arr) {
		boolean flag = false ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				flag = true;
				break;
			}
		}
		
		
		return flag ;
	}
	
	
	public static void main(String[] args) {
		int[] arr1 = {10,20,30,40,50,60};
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		FacMethod01 fac = new FacMethod01();
		boolean flag = fac.search(n1, arr1);
		if (flag) {
			System.out.println(flag);
		} else {
			System.out.println(flag+"sss");
		}
		
		
		
		
		
	}
}
