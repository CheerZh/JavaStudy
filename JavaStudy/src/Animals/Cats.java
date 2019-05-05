package Animals;

public class Cats extends Animal implements Pet{
	public String name ;
	
	// 构造方法名和类名一样（包括大小写）
    // 没有返回类型
	public Cats(String str){
		super(4);
		setName(str);
	}
	public Cats() {
		this("");
	}
	public void play() {
		System.out.println("I am playing");
	}
	
	@Override
	public void getName() {
		System.out.println(name);
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println("Cats eat laoshu");
	}
}
