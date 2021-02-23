package day12common.stu_StringBuilder;

import java.util.Scanner;

/**
 * @Author: tangsong
 * @Date: 2021-02-22 23:35
 * @Description:
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        /*
            字符串 反转 升级
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("qingshuru: ");
        String dd = sc.nextLine();
        String ddf = resverse(dd);
        System.out.println(ddf);

    }

    public static String resverse(String arr){
        StringBuilder sb = new StringBuilder();

//        sb += "["
//
//        sb += "]"
        String ss = sb.append(arr).reverse().toString();
        return ss ;
    }







}
