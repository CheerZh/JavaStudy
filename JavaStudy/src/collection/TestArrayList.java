package collection;

import java.util.ArrayList;
import charactor.Hero;

public class TestArrayList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ArrayList,���ڴ�Ŷ���
		ArrayList heros = new ArrayList();
		heros.add(new Hero("����"));
		
		//size��ȡArrayList�Ĵ�С
		System.out.println(heros.size());
		
		//����������"capacity"�����Ŷ�������ӣ��Զ�����
		
		heros.add(new Hero("��Ī"));
		System.out.println(heros.size());
		
		//��5��������뵽ArrayList��
		for(int i=0 ; i<5 ; i++) {
			heros.add(new Hero("hero"+i));
		}
		System.out.println(heros);
		
		//��ָ��λ�����Ӷ���
		Hero specialHero = new Hero("special Hero");
		heros.add(3,specialHero);
		
		System.out.println(heros.toString());
		
		// �ж�һ�������Ƿ���������
        // �жϱ�׼�� �Ƿ���ͬһ�����󣬶�����name�Ƿ���ͬ
        System.out.print("��Ȼһ���µĶ�������Ҳ�� hero 1��"
        		+ "����contains�ķ�����:");
        System.out.println(heros.contains(new Hero("hero 1")));
        System.out.print("����specialHero���жϣ�contains�ķ�����:");
        System.out.println(heros.contains(specialHero));
        
        //��ȡָ��λ�õ�**����**
        System.out.println(heros.get(5));
        //��������˷�Χ����Ȼ�ᱨ��
        //System.out.println(heros.get(10));
        
        System.out.println("specialHero������λ��"
        		+ ":"+heros.indexOf(specialHero));
        System.out.println("�µ�Ӣ�ۣ�����������\"hero 1\"������λ��"
        		+ ":"+heros.indexOf(new Hero("hero 1")));
        //�������棬����-1
        
        //removeɾ�����󣬸����±������
        heros.remove(2);
        System.out.println("ɾ���±���2�Ķ���");
        System.out.println(heros);
        System.out.println("ɾ��special hero");
        heros.remove(specialHero);
        System.out.println(heros);
        
        
        //set�滻
        System.out.println("���±���5��Ԫ�أ��滻Ϊ\"hero 5\"");
        heros.set(5, new Hero("hero 5"));
        System.out.println(heros);
		
        //toArrayתΪ����
        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
        System.out.println("����:" +hs);
        
        //addALL ����һ�����������е�Ԫ�أ������뵽����������
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anotherHeros);
        heros.addAll(anotherHeros);
        System.out.println("����һ��ArrayList��Ԫ�ض����뵽��ǰArrayList:");
        System.out.println("ArrayList heros:\t" + heros);
        
        
        //clear ���
        System.out.println("ʹ��clear���");
        heros.clear();
        System.out.println("ArrayList heros:\t" + heros);
	}

}
