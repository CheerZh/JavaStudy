package charactor;
public class APHero extends Hero implements AP,Mortal{
	
	//@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	public void die() {
		System.out.printf("ħ��Ӣ�� %s ����\n",name);
	
	}
}