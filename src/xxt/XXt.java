package xxt;
import java.io.*;
public class XXt {

	public static void main(String[] args) throws IOException {
		/*创建输入，输出流，一边读，一边写，再关闭*/
		FileInputStream fis =new FileInputStream("E:\\javaio\\123.txt");
		FileOutputStream fos =new FileOutputStream("E:\\javaio\\12345.txt");
		byte[] b=new byte[1024];
		int temp=0;
		if((temp=fis.read(b))!=-1)
			fos.write(b,0,temp);
		fos.flush();
		fis.close();
		fos.close();

	}

}
