package generic;

import java.util.LinkedList;
 
import charactor.Hero;
import property.Item;
   
public class MyStack<T> {
   
    LinkedList<T> values = new LinkedList<T>();
       
    public void push(T t) {
        values.addLast(t);
    }
   
    public T pull() {
        return values.removeLast();
    }
   
    public T peek() {
        return values.getLast();
    }
       
    public static void main(String[] args) {
        //���������Stack��ʱ��ʹ�÷���<Hero>�ͱ�ʾ��Stackֻ�ܷ�Hero
        MyStack<Hero> heroStack = new MyStack<>();
        heroStack.push(new Hero());
        //���ܷ�Item
        //heroStack.push(new Item());
         
        //���������Stack��ʱ��ʹ�÷���<Item>�ͱ�ʾ��Stackֻ�ܷ�Item
        MyStack<Item> itemStack = new MyStack<>();
        itemStack.push(new Item());
        //���ܷ�Hero
        //itemStack.push(new Hero());
    }
   
}