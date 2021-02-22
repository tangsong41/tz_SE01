package day12common.stu_String;

import java.util.Scanner;

/**
 * @Author: tangsong
 * @Date: 2021-02-22 22:42
 * @Description:
 */
public class TestString04 {
    /*
     * 字符串 反转
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qingshuru:");
        String  dd = sc.nextLine();
        String ddf = reverse(dd);

        System.out.println(ddf);


    }
    /*
    字符串 反转 方法
    利用 数组类型方式，将 字符串 倒着 读写
     */
    public static String reverse(String s){
        String ss = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            ss += s.charAt(i) ;

        }

        return ss ;
    }



}
