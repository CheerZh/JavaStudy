package generic;

import java.util.ArrayList;

import property.Item;
import charactor.APHero;
import charactor.Hero;
  
public class TestGeneric3 {
  
    public static void main(String[] args) {
  
        ArrayList<APHero> apHeroList = new ArrayList<APHero>();
         
        //?����ͨ�������ʾ���ⷺ��
        ArrayList<?> generalList = apHeroList;
 
        //?��ȱ��1�� ��Ȼ?�������ⷺ�ͣ���ô���仰˵����Ͳ�֪���������������ʲô����
        //����ֻ����Object����ʽȡ����
        Object o = generalList.get(0);
 
        //?��ȱ��2�� ��Ȼ?�������ⷺ�ͣ���ô���п�����Hero,Ҳ�п�����Item
        //���ԣ������ֶ����ȥ�����з��գ������ʲôʲô���͵Ķ��󣬶����ܷŽ�ȥ
        //generalList.add(new Item()); //������� ��Ϊ?�������ⷺ�ͣ����п��ܲ���Item
        //generalList.add(new Hero()); //������� ��Ϊ?�������ⷺ�ͣ����п��ܲ���Hero
        //generalList.add(new APHero()); //�������  ��Ϊ?�������ⷺ�ͣ����п��ܲ���APHero
  
    }
}
