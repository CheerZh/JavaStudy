package Animals;
/**
 * 所有动物的抽象父类
 * @author zgq
 *
 */
public abstract class Animal {
	public String name;
	
	protected int legs;
	
	protected Animal(int i) {
		this.legs = i;
	}
	
	public abstract void eat() ;
	
	public void walk() {
		System.out.println(name + " walks by %d legs");
	}

}
