package day16File;

import java.io.File;

/**
 * 
 * @author Administrator
 *
 */
public class MkFile01 {
	
	/*
	 * File类共提供了三个不同的构造函数，以不同的参数形式灵活地接收文件和目录名信息。

	构造函数：
	1）File (String   pathname)   
	     例:File  f1=new File("FileTest1.txt"); //创建文件对象f1，f1所指的文件是在当前目录下创建的FileTest1.txt
	2）File (String  parent  ,  String child)
	     例:File f2=new  File(“D:\\dir1","FileTest2.txt") ;//  注意：D:\\dir1目录事先必须存在，否则异常
	3）File (File    parent  , String child)
	     例:File  f4=new File("\\dir3");
	          File  f5=new File(f4,"FileTest5.txt");  //在如果 \\dir3目录不存在使用f4.mkdir()先创建

	        一个对应于某磁盘文件或目录的File对象一经创建， 就可以通过调用它的方法来获得文件或目录的属性。    
	       1）public boolean exists( ) 判断文件或目录是否存在
	       2）public boolean isFile( ) 判断是文件还是目录 
	       3）public boolean isDirectory( ) 判断是文件还是目录
	       4）public String getName( ) 返回文件名或目录名
	       5）public String getPath( ) 返回文件或目录的路径。
	       6）public long length( ) 获取文件的长度 
	       7）public String[ ] list ( ) 将目录中所有文件名保存在字符串数组中返回。 
	       File类中还定义了一些对文件或目录进行管理、操作的方法，常用的方法有：
	       1） public boolean renameTo( File newFile );    重命名文件
	       2） public void delete( );   删除文件
	       3）  public boolean mkdir( ); 创建目录
	*/
	
	
	
	
	
	public static void main(String[] args) {
		//File f=new File("D:\\workspace\\pro_java\\tz_SE01\\src\\day15file");
		File f1 = new File("D:\\workspace\\pro_java\\tz_SE01\\src\\day15file\\dir");
//		f1.mkdir();
		System.out.println(f1.mkdir());
		File f2 = new File("D:\\workspace\\pro_java\\tz_SE01\\src\\day15file\\dir\\d_child");
//		ff.createNewFile();
//		f2.mkdirs();
		System.out.println(f2.mkdirs());
	}
}
