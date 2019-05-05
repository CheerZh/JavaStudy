package charactor;
/**
 * 类多态的作用
 * @author zgq
 *
 */
import property.Item;
import property.LifePotion;
import property.MagicPotion;
import java.io.Serializable;
import java.util.logging.Logger;

public class Hero implements Serializable,Comparable<Hero>{
	//Comparable接口
	public String name;
	public float hp; //血量
	public int damage; //伤害
	float armor; //护甲
	int moveSpeed; //移动速度
	
	static String copyright;
	 
	static {
	        System.out.println("初始化 copyright");
	        copyright = "版权由Riot Games公司所有";
	    }
	
	//构造方法
	public Hero() {
		
	}
	
	public Hero(String name) {
		//System.out.println("Hero的有参构造方法");
		this.name = name;
	}
	
	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	

	
	public int compareTo(Hero anotherHero) {
		if(damage<anotherHero.damage)
			return 1;
		else
			return -1;
	}
	
	public String toString() {
		return "Hero [name=" + name + ", hp=" + hp +
				", damage=" + damage + "]\r\n";   //注释后返回的是类型树加地址
	}
	
	public void finalize() {
		System.out.println("这个英雄正在被回收");
	}
	public static void battleWin() {
		System.out.println("hero battle win");
	}
	public void useItem(Item i) {
		System.out.println("hero use item");
		i.effect();
		//通过一个方法调用多态的类实现不同的输出
	}
	
	
	
	public void kill(Mortal m) {//接口作为参数？？？？
		
		System.out.println(name + "放了一个大招");
		m.die();
	}
	
	public static void main(String[] args) {
		
		Hero garen = new Hero();
		garen.name = "盖伦";
		
		ADHero hanbing = new ADHero();
		hanbing.name = "寒冰射手";
		
		APHero guanghui = new APHero();
		guanghui.name = "光辉女神";
		
		ADAPHero ez = new ADAPHero();
		ez.name = "伊泽瑞尔";
		
		
//		LifePotion lp =new LifePotion();
//		MagicPotion mp = new MagicPotion();
//		
//		garen.useItem(lp);
//		garen.useItem(mp);
		//同一个方法用不同参数输出不同结果
		
		garen.kill(hanbing);
		garen.kill(guanghui);
		garen.kill(ez);
		
		System.out.println(garen.toString());
		System.out.println(garen);
		
		
	}

	public boolean isDead() {
		// TODO Auto-generated method stub
		return 0>=hp?true:false;
	}

	public void attackHero(Hero h) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);//1000ms
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		while(!h.isDead()) {
			h.hp-= damage;
			System.out.format("%s 正在攻击 %s, %s 的血量变成了 %.0f%n",name,h.name,h.name,h.hp);
		}	
		System.out.println(h.name +"死了!");
	}

	public synchronized void hurt() {
        if (hp == 1) {
            try {
                // 让占有this的减血线程，暂时释放对this的占有，并等待
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
 
        hp = hp - 1;
        System.out.printf("%s 减血1点,减少血后，%s的血量是%.0f%n", name, name, hp);
    }

	
	//回血
    //直接在方法前加上修饰符synchronized
    //其所对应的同步对象，就是this
    //和hurt方法达到的效果一样
	public synchronized void recover() {
		hp+=1;
		// TODO Auto-generated method stub
		
		 System.out.printf("%s 回血1点,增加血后，%s的血量是%.0f%n", name, name, hp);
	     // 通知那些等待在this对象上的线程，可以醒过来了，如第20行，等待着的减血线程，苏醒过来
	     this.notify();
		
	}

	
}

