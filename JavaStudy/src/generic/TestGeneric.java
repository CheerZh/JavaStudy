package generic;

import java.util.ArrayList;

import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;
   
public class TestGeneric {
   
    public static void main(String[] args) {
          
        ArrayList<APHero> apHeroList = new ArrayList<APHero>();
        apHeroList.add(new APHero());
         
        ArrayList<? extends Hero> heroList = apHeroList;
          
        //? extends Hero ��ʾ����һ��Hero���͵����෺��
          
        //heroList �ķ��Ϳ�����Hero
        //heroList �ķ��Ϳ���ʹAPHero
        //heroList �ķ��Ϳ���ʹADHero
          
        //����ȷ����ǣ���heroListȡ�����Ķ���һ���ǿ���ת�ͳ�Hero��
          
        Hero h= heroList.get(0);
          
        //���ǣ�����������Ŷ���
        //heroList.add(new ADHero()); //���������ΪheroList�ķ��� �п�����APHero
          
    }
      
}