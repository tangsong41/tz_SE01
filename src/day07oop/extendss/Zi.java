package day07oop.extendss;

/**
 * @Author: tangsong
 * @Date: 2021-02-24 21:43
 * @Description:
 */
public class Zi extends Fu {

    public int height = 175;
    public int age = 23;

    public void show(){
        int age = 45;
        System.out.println("age = " + age);
        System.out.println("height = " + height);

        //我要访问成员变量
        System.out.println("this.age = " + this.age);

        System.out.println("super.age = " + super.age);

    }




}
