package day02var;
// 注意: 直接给 byte 类型的变量赋值为一个合法范围内的数值, 可以通过编译；但是，不能把int型变量赋值给byte变量，比如int a = 1; byte b = c;
// 而直接给 float 类型的变量赋值为一个合法范围内的浮点型, 则不能通过编译，数值后面需要加F或者f
// 但是可以把一个整数赋值给float
public class Test {
    public static void main(String[] args) {
        byte a = 15;
        int b = 1;
//        byte c = b;
        float d = 3.14F;
        float e = 2;
        System.out.println(b + ", " + e);
        System.out.println("b = "+ b +", e = "+ e);
 
    }
}