package day04array;


/**
 * 
 * @author Administrator
 * 2019年7月5日
 */

public class JavaArrays {
	int[] arr;//这是数组的声明语句，只是创建了一个数组的引用arr
	int arr1[];
	
	public void arrLevel1() {
		int[] arrTest = new int[3];//创建新的长度为3的int数组，赋值给arrTest
	
		arrTest[0] = 8;
		arrTest[1] = 8;
		arrTest[2] = 8;
		
		int[] arrTest2 = new int[] {2,5,6};
		int[] arrTest3 = {2,5,6};
		System.out.println(arrTest3[0]);
		System.out.println(arrTest3[1]);
		System.out.println(arrTest3[2]);
		System.out.println("*******************************");
		for (int i = 0; i < arrTest3.length; i++) {
			System.out.println(arrTest3[i]);
		}
		//因为数组本身是连续的，JDK1.5之后加入了foreach循环
		for (int i : arrTest3) {//括号中的参数是：1.数组元素的类型 
								//2.当前的临时变量，内容是当前数组元素的值
								//3.冒号后面的是要遍历的数组名
			System.out.println(i);
		}
	}
	
	
	
	public void arrl2() {
		int[][] arrl2 = new int[3][4];//代表有3个含有4个元素的一维数组组成
		
		arrl2[0] = new int[4];
		arrl2[1] = new int[4];
		arrl2[2] = new int[4];
		arrl2[0][0] = 5;
		
		int[][] arrl2x = new int[][] {{2,5,6},{3,5,7},{1,5,9}}; 
		int[][] arrl2y = {{2,5,6},{3,5,7},{1,5,9}}; 
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arrl2y[i][j]);
			}
			System.out.println("*******************************");
		}
		System.out.println("*******************************");
	}
	public static void main(String[] args) {
		JavaArrays javaArrays = new JavaArrays();
		javaArrays.arrl2();
		int[] arr = {5,6,78}; 
		javaArrays.arrTest(arr);
	}
	
	public void arrTest(int[] arr) {
		
	}
	
	public int[] arrTest() {
		int[] arr = {5,8};
		return arr;
	}
	
	

}
