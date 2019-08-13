package tz_SE01.chap01.lesson01;

import org.junit.Test;

public class Pra_FOR {
	
	public static void main(String[] args) {
		int i ;
		for ( i = 0; i < 50; i++) {
			if (i/6==0) {
				continue;
			}
			i--;
			if (i==5) {
				break;
			}
		}
		System.out.println("i:"+i);
	}
//	@Test
//	public void getStu() {
//		int i ;
//		for ( i = 0; i < 50; i++) {
//			if (i/6==0) {
//				continue;
//			}
//			i--;
//			if (i==5) {
//				break;
//			}
//			
//		}
//		
//		System.out.println("i:"+i);
//		
//		
//	}
}
