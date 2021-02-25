package day07oop.config02;

/**
 * @Author: tangsong
 * @Date: 2021-02-25 21:59
 * @Description:
 */
public class NewPhone extends Phone {

    @Override
    public void call(String name){
        System.out.println("ship");
        System.out.println("name 子类= " + name);
    }

}
