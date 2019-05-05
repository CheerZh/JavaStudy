package Animals;

public class Fish extends Animal{
	private String name;
	
	public void play() {
		System.out.println("I am playing in water");
	}
	
	public void getName() {
		System.out.println(name);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void walk() {
		System.out.println(name + " can't walk but swim and have no leg");
	}
	
	public void eat() {
		System.out.println("Fishes eat cong he cao");
	}
	
	public  Fish() {
		super(0);
	}
}
