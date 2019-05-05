package collection;
/**
 * Collections�Ǽ��ϵĹ�����
 * ����reverse��shuffle����������sort��swap��rotate��������
 * synchronizedList(�̰߳�ȫ��)
 */
   
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
   
public class TestCollections {
    public static void main(String[] args) {
        //��ʼ������numbers
        List<Integer> numbers = new ArrayList<>();
         
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
         
        System.out.println("�����е�����:");
        System.out.println(numbers);
        
        //reverse
        Collections.reverse(numbers);
         
        System.out.println("��ת�󼯺��е�����:");
        System.out.println(numbers);
        
        //shuffle
        Collections.shuffle(numbers);
        
        System.out.println("�����󼯺��е�����:");
        System.out.println(numbers);
        
        //sort
        Collections.sort(numbers);
        System.out.println("����󼯺��е�����:");
        System.out.println(numbers);
        
        //swap
        Collections.swap(numbers,0,5);
        System.out.println("����0��5�±�����ݺ󣬼����е�����:");
        System.out.println(numbers);
         
        //rotate(���ҹ���)
        Collections.rotate(numbers,2);
        System.out.println("�Ѽ������ҹ���2����λ��������ݺ󣬼����е�����:");
        System.out.println(numbers);
        
        //synchronizedList
        System.out.println("�ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List");
        List<Integer> synchronizedNumbers = (List<Integer>) 
        		Collections.synchronizedList(numbers);
    }
}