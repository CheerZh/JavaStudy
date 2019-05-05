package Exception;

public class EnemyHeroIsDeadException extends Exception{
	
	public EnemyHeroIsDeadException() { //生成器 只用public修饰
		//无参的构造方法
	}
	
	public 
	EnemyHeroIsDeadException(String msg) {
		super(msg);  //调用父类Exception 中定义的返回错误信息方法
		//有参的构造方法
	}

}
