package day02var;


/**
 * 
 * @author Administrator
 *
 *格式：(条件表达式)?表达式1：表达式2；
　　如果条件为true，运算后的结果是表达式1；
　　如果条件为false，运算后的结果是表达式2； 
 *
 */

public class TestOperator {
    public static void main(String[] args) {
        //取模
        int r = 10 % 3;
        System.out.println(r);  //1
 
        //自增
        int i = 10;
 
        //i++: 先取 i 值, 在运算(i = i + 1)
        int j = i++;
        System.out.println(j);
        System.out.println(i);
 
        int m = 100;
        //++m: 先运算(m = m + 1), 后取值
        int n = ++m;
        System.out.println(n);
        System.out.println(m);
 
        //+： 字符串相加
        String str = "abc";
        String str2 = "def";
 
        String str3 = str + str2; //abcdef
        System.out.println(str3);
 
        //如果对负数取模，可以把模数负号忽略不记
        System.out.println(10 % -3); //1
        //如果被模的数是负数, 则先对其绝对值进行取模运算, 结果在加上一个负号
        System.out.println(-10 % 3); //-1
 
        System.out.println(-10 % -3); //-1
 
        //整数之间做除法时，只保留整数部分而舍弃小数部分
        int x=3510;
        x= x / 1000 * 1000;
        System.out.println(x); //3000
 
        //+ 除字符串相加功能外，还能把非字符串转换成字符串
        String str4 = "1";
        System.out.println(str4 + 100); //1100
 
        //逻辑运算符
        int a = 10;
        int b = 20;
 
        // &: 与 运算符, 当且仅当两边都为真时, 表达式的结果为 true
        System.out.println(a > 5 & b < 30); //true
        System.out.println(a > 15 & b < 30); //false
        System.out.println(a > 5 & b < 20); //false
 
        // |: 或 运算符, 当且仅当两边都为假时, 表达式结果为 false
        System.out.println(a > 5 | b < 30); //true
        System.out.println(a > 15 | b < 3); //false
        System.out.println(a > 5 | b < 20); //true
 
        // ^: 异或 运算符, 当且仅当两边的表达式的结果不同时为 true, 否则为 false
        System.out.println(a > 5 ^ b < 30); //false
        System.out.println(a > 15 ^ b < 3); //false
        System.out.println(a > 5 ^ b < 20); //true
 
        // !: 取反 运算符.
        System.out.println(!(a > 5)); //false
 
        //短路逻辑运算符: &&, ||. 若 短路逻辑运算符前的表达式已经可以确定整个表达式的值,
        //则不再判断 短路运算符后边的表达式的值
        System.out.println(a > 15 && (10 / 0 == 1)); //false
 
        //位运算符
        int c = 3; //0000 0011
 
        //左移运算符
        System.out.println(c << 2); //0000 1100 -> 12  3 * (2*2) = 12
 
        //右移运算符
        System.out.println(c >> 2); //0000 0000 -> 0   3 / (2 * 2) = 0;
 
        //无符号右移运算符
        int d = -1;
        System.out.println(d >> 1); //-1
        System.out.println(d >>> 1); //2147483647
 
        //& 位运算符
        /*
         *   0000 0010
         * & 0000 0011
         * ___________
         *   0000 0010
         */
        System.out.println(2 & 3); //2
 
        //三元运算符
        String e = d > 3 ? "d > 3" : "d <= 3";
        System.out.println(e); // d <= 3
 
        //编译不能通过, 因为 : 的两边必须是表达式, 且必须是类型兼容的表达式
        //d > 3 ? System.out.println("a") : System.out.println("b");
 
        String res = d > 3 ? ">3" : "<=3";
    }
}