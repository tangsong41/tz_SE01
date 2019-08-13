package day04array;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        //1. 数组的声明
        //int    i = 0;
        int [] a = null; //推荐使用此种方式进行声明.
        int b [] = null;
 
        //注意: Java语言中声明数组时不能指定其长度(数组中元素的数)
        //int [5] c = null;
 
        //注意: 若没有为数组变量分配指向的内存空间, 就调用其属性, 会在运行时发生 "空指针异常"
        //System.out.println(a.length);
        System.out.println("********************");
        //2. 为数组分配内存空间，new后面必须指定数组长度
        a = new int[10];
 
        //3. 获取数组的长度
        System.out.println(a.length);  //10
        System.out.println("********************");
        //5. 对数组元素进行初始化
        for(int i = 0; i < a.length; i++){
            a[i] = 100 + i;
        }
 
        //4. 访问数组的元素: 数组名[数组元素下标]. 注意: 下标从 0 开始, 所以最大值是 lengh - 1, 而不是length;
        //数组元素会进行默认的初始化:
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println("********************");
        //若访问数组的下标超过合法范围, 则在运行时会抛出 ArrayIndexOutOfBoundsException，编译时不会抛
        //a[10] = 10;
 
        //数组的静态初始化
        int [] c = {1, 2, 3, 4, 5};
        int [] d = new int[]{2, 3, 4, 5, 6};
 
        for(int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }
        System.out.println("********************");
		
		
		
	}

}
