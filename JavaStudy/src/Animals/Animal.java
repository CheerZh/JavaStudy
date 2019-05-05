package Animals;
/**
 * ���ж���ĳ�����
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
