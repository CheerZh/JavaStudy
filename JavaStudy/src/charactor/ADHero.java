package charactor;
import property.Item;
import property.LifePotion;
/**
 * ���أ�super
 * @author zgq
 *
 */
public class ADHero extends Hero implements AD,Mortal{
	
	int moveSpeed = 400; 
	//@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	
	public int getMoveSpeed() {
		return this.moveSpeed;
	}
	
	public int getMoveSpeed2() {
		return super.moveSpeed;
	}
	
	//��дuseItem���������е��ø����useItem����
	public void useItem(Item i) {
		System.out.println("adhero use item");
		super.useItem(i);
	}
	
	public ADHero() {
		System.out.println("AD Hero�Ĺ��췽��");
	}
	
	public ADHero(String name) {
		super(name);
		System.out.println("AD Hero�Ĺ��췽��");
	}
	
	public void die() {
		System.out.printf("����Ӣ�� %s ����\n", name);
	}
	
	public static void battleWin() {
		System.out.println("ad hero battle win");
	}
	
	public static void main(String[] args) {
		Hero.battleWin();
		ADHero.battleWin();
		
		ADHero h = new ADHero("������");
		
		System.out.println(h.getMoveSpeed());
		System.out.println(h.getMoveSpeed2());
		
		//Hero h = new ADHero();  //�����������ã�ָ���������
		h.battleWin(); //���õ��Ǹ���ķ�������
		
//		��Ȼhָ�����һ��������󣬵�����Ȼ���õ��Ǹ�����෽����
//		������hָ��һ���ն���null��ʱ��Ҳ�ܹ��ɹ�����battleWin().
//		���Ժ�hָ���ĸ������޹أ�ֻ��h�������й�ϵ��
//		��Ȼ��Ҳ������ͨ������ȥ�����෽������Ӧ��ֱ��ͨ����ȥ�����෽�����Ӷ��������ϵ����塣
	}
}