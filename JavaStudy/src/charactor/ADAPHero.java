package charactor;
public class ADAPHero extends Hero implements AD,AP,Mortal{
	
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
	public void die() {
		System.out.printf("混合英雄 %s 阵亡\n", name);
	}
}
