package tz_SE01.chap01.lesson01;

public class Pra02 {
	
	public static void main(String[] args) {
		int i=0 ;
		i=plus(i);
		i=i++;
		
		System.out.println("i:"+i);
		
		
		int d = 2;
		int e = 3;
		int s=d+++e;
		System.out.println(s+"\t"+d+"\t"+e);
		
		
		
	}
	
	public static int plus(int i) {
		// TODO Auto-generated method stub
		i+=1;
		return i;
	}
	
	
	
	
}
