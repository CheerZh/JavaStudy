package property;
/**
 * ������д������λ������LifePotion��
 * @author zgq
 *
 */

public class Item {
	String name;
	int price;
	
	public Item(){
		
	} //�������вι��췽����Ĭ���޲η���ʧЧ
	
	public Item(String name) {
		this.name = name;
	}
	
	public void buy() {
		System.out.println("����");
		
	}
	public void effect() {
		System.out.println("ʹ����Ʒ�󣬿�����Ч��");
	}
	
	public static void main(String[] args) {
		Item i = new Item();
		i.effect();
		
		LifePotion lp = new LifePotion();
		lp.effect();
		
		MagicPotion mp = new MagicPotion();
		mp.effect();
		
		Item i1 = new LifePotion();
		Item i2 = new MagicPotion();
		
		System.out.println("\n"+"i1 ��Item���ͣ�ִ��effect��ӡ��");
		i1.effect();
		System.out.println("i2 Ҳ��Item���ͣ�ִ��effect��ӡ��");
		i2.effect();
	}
}
