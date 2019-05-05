package charactor;
import property.Item;
import property.LifePotion;
/**
 * 隐藏；super
 * @author zgq
 *
 */
public class ADHero extends Hero implements AD,Mortal{
	
	int moveSpeed = 400; 
	//@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
	public int getMoveSpeed() {
		return this.moveSpeed;
	}
	
	public int getMoveSpeed2() {
		return super.moveSpeed;
	}
	
	//重写useItem，并在其中调用父类的useItem方法
	public void useItem(Item i) {
		System.out.println("adhero use item");
		super.useItem(i);
	}
	
	public ADHero() {
		System.out.println("AD Hero的构造方法");
	}
	
	public ADHero(String name) {
		super(name);
		System.out.println("AD Hero的构造方法");
	}
	
	public void die() {
		System.out.printf("物理英雄 %s 阵亡\n", name);
	}
	
	public static void battleWin() {
		System.out.println("ad hero battle win");
	}
	
	public static void main(String[] args) {
		Hero.battleWin();
		ADHero.battleWin();
		
		ADHero h = new ADHero("德莱文");
		
		System.out.println(h.getMoveSpeed());
		System.out.println(h.getMoveSpeed2());
		
		//Hero h = new ADHero();  //父类类型引用，指向子类对象
		h.battleWin(); //调用的是父类的方法？？
		
//		虽然h指向的是一个子类对象，但是依然调用的是父类的类方法。
//		甚至在h指向一个空对象null的时候，也能够成功调用battleWin().
//		所以和h指向哪个对象无关，只和h的类型有关系。
//		当然，也不建议通过对象去调用类方法，而应该直接通过类去调用类方法，从而规避理解上的歧义。
	}
}