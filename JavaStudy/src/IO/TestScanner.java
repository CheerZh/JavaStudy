package IO;
 
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
/**
 * @ClassName: ExSystemIn1
 * @Description: 练习-自动创建类
 * @author: yunche
 * @date: 2018/07/30
 */
public class TestScanner
{
    public static void main(String[] args)
    {
        File templet = new File("d:/test2.txt");
 
        System.out.println("请输入类的名称:");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
 
        System.out.println("请输入属性的类型:");
        String propertyType = s.nextLine();
 
        System.out.println("请输入属性的名称:");
        String propertyName = s.nextLine();
 
 
 
        try(FileReader fr = new FileReader(templet))
        {
            char[] cs = new char[(int)templet.length()];
            fr.read(cs);
            String res = String.valueOf(cs);
             
            String Uproperty = propertyName.substring(0, 1).toUpperCase()
                    + propertyName.substring(1, propertyName.length());
            String result =res.replace("@class@", name).replace("@type@", propertyType).
                    replace("@property@", propertyName).replace("@Uproperty@", Uproperty);
            System.out.println("替换后的内容");
            System.out.println(result);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}