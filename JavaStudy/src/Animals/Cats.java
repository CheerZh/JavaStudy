package Animals;

public class Cats extends Animal implements Pet{
	public String name ;
	
	// ���췽����������һ����������Сд��
    // û�з�������
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
