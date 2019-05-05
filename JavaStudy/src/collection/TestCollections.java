package collection;
/**
 * Collections是集合的工具类
 * 包含reverse、shuffle（混淆）、sort、swap、rotate（滚动）
 * synchronizedList(线程安全化)
 */
   
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
   
public class TestCollections {
    public static void main(String[] args) {
        //初始化集合numbers
        List<Integer> numbers = new ArrayList<>();
         
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
         
        System.out.println("集合中的数据:");
        System.out.println(numbers);
        
        //reverse
        Collections.reverse(numbers);
         
        System.out.println("翻转后集合中的数据:");
        System.out.println(numbers);
        
        //shuffle
        Collections.shuffle(numbers);
        
        System.out.println("混淆后集合中的数据:");
        System.out.println(numbers);
        
        //sort
        Collections.sort(numbers);
        System.out.println("排序后集合中的数据:");
        System.out.println(numbers);
        
        //swap
        Collections.swap(numbers,0,5);
        System.out.println("交换0和5下标的数据后，集合中的数据:");
        System.out.println(numbers);
         
        //rotate(向右滚动)
        Collections.rotate(numbers,2);
        System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
        System.out.println(numbers);
        
        //synchronizedList
        System.out.println("把非线程安全的List转换为线程安全的List");
        List<Integer> synchronizedNumbers = (List<Integer>) 
        		Collections.synchronizedList(numbers);
    }
}