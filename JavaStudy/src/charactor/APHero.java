package charactor;
public class APHero extends Hero implements AP,Mortal{
	
	//@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	
	public void die() {
		System.out.printf("魔法英雄 %s 阵亡\n",name);
	
	}
}