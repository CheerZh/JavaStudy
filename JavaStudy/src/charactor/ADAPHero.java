package charactor;
public class ADAPHero extends Hero implements AD,AP,Mortal{
	
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	public void physicAttack() {
		System.out.println("����������");
	}
	
	public void die() {
		System.out.printf("���Ӣ�� %s ����\n", name);
	}
}
