package day12common.stu_StringBuilder;

/**
 * @Author: tangsong
 * @Date: 2021-02-22 23:02
 * @Description:
 */
public class StringBuilderDemo03 {

    public static void main(String[] args) {
        /*
            StringBuilder  转化为String
            toString
         */



        System.out.println("---------------------");
        /*
            String  转化为  Stringbuilder
            构造方法
         */
        String strs[] = {"Arshad", "Althamas", "Johar", "Javed", "Raju", "Krishna" };
        StringBuilder sb = new StringBuilder();
        sb.append(strs[0]);
        sb.append(" "+strs[1]);
        sb.append(" "+strs[2]);
        sb.append(" "+strs[3]);
        sb.append(" "+strs[4]);
        sb.append(" "+strs[5]);

        System.out.println("sb = " + sb);
        System.out.println("---");
        System.out.println(sb.toString());





    }

}
