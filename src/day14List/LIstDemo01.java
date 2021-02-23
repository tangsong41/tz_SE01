package day14List;

import java.util.ArrayList;

/**
 * @Author: tangsong
 * @Date: 2021-02-23 22:03
 * @Description:
 */
public class LIstDemo01 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("sweqw");
        arr.add("rffgfdbf");
        arr.add("sazzzzz");

        arr.add(1,"javase");

        System.out.println("arr:"+arr);

//        Error:Failed to load project configuration:
//          cannot parse file F:\workspace\tz_SE01\.idea\workspace.xml:
//              ParseError at [row,col]:[4,2]
//        Message: 元素内容必须由格式正确的字符数据或标记组成。
//        解决问题：删除 workspace.xml 文件




    }

}
