package generic;

import java.util.ArrayList;

import charactor.ADHero;
import charactor.APHero;
import charactor.Hero;
  
public class TestGeneric2 {
    public static void main(String[] args) {
  
        ArrayList<? super Hero> heroList = new ArrayList<Object>();
          
        //? super Hero ��ʾ heroList�ķ�����Hero�����丸�෺��
          
        //heroList �ķ��Ϳ�����Hero
        //heroList �ķ��Ϳ�����Object
          
        //���ԾͿ��Բ���Hero
        heroList.add(new Hero());
        //Ҳ���Բ���Hero������
        heroList.add(new APHero());
        heroList.add(new ADHero());
          
        //���ǣ����ܴ�����ȡ���ݳ���,��Ϊ�䷺�Ϳ�����Object,��Object��ǿתHero��ʧ��
        //Hero h= heroList.get(0);
          
    }
  
}