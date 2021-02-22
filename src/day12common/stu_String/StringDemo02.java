package day12common.stu_String;

import java.util.Scanner;

/**
 * @Author: tangsong
 * @Date: 2021-02-22 2:49
 * @Description:
 */
public class StringDemo02 {


    // 字符串 遍历 统计字符串 次数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("请输入echo:");
        String line = sc.nextLine();

        int daixie = 0 ;
        int xiaoxie = 0 ;
        int shuzi = 0;

        for (char i : line.toCharArray()) {
            System.out.println(line.toCharArray());
            if(i >= 'A' && i <= 'Z'){
                daixie++ ;
            }else if (i >= 'a' && i <= 'z' ) {
                xiaoxie++;
            }else if (i >= '0' && i <= '9' ) {
                shuzi++;
            }

        }

        System.out.println(daixie+"\t"+xiaoxie+"\t"+shuzi);

        int daixie1 = 0 ;
        int xiaoxie1 = 0 ;
        int shuzi1 = 0;
        for (int j = 0; j <line.length() ; j++) {
            char i = line.charAt(j);
            if(i >= 'A' && i <= 'Z'){
                daixie1++ ;
            }else if (i >= 'a' && i <= 'z' ) {
                xiaoxie1++;
            }else if (i >= '0' && i <= '9' ) {
                shuzi1++;
            }

        }



        System.out.println(daixie1+"\t"+xiaoxie1+"\t"+shuzi1);




    }



}
