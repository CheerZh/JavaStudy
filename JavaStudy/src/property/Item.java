package property;
/**
 * 测试重写方法，位于子类LifePotion中
 * @author zgq
 *
 */

public class Item {
	String name;
	int price;
	
	public Item(){
		
	} //定义了有参构造方法后，默认无参方法失效
	
	public Item(String name) {
		this.name = name;
	}
	
	public void buy() {
		System.out.println("购买");
		
	}
	public void effect() {
		System.out.println("使用物品后，可以有效果");
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
		
		System.out.println("\n"+"i1 是Item类型，执行effect打印：");
		i1.effect();
		System.out.println("i2 也是Item类型，执行effect打印：");
		i2.effect();
	}
}
