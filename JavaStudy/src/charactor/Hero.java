package charactor;
/**
 * ���̬������
 * @author zgq
 *
 */
import property.Item;
import property.LifePotion;
import property.MagicPotion;
import java.io.Serializable;
import java.util.logging.Logger;

public class Hero implements Serializable,Comparable<Hero>{
	//Comparable�ӿ�
	public String name;
	public float hp; //Ѫ��
	public int damage; //�˺�
	float armor; //����
	int moveSpeed; //�ƶ��ٶ�
	
	static String copyright;
	 
	static {
	        System.out.println("��ʼ�� copyright");
	        copyright = "��Ȩ��Riot Games��˾����";
	    }
	
	//���췽��
	public Hero() {
		
	}
	
	public Hero(String name) {
		//System.out.println("Hero���вι��췽��");
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
				", damage=" + damage + "]\r\n";   //ע�ͺ󷵻ص����������ӵ�ַ
	}
	
	public void finalize() {
		System.out.println("���Ӣ�����ڱ�����");
	}
	public static void battleWin() {
		System.out.println("hero battle win");
	}
	public void useItem(Item i) {
		System.out.println("hero use item");
		i.effect();
		//ͨ��һ���������ö�̬����ʵ�ֲ�ͬ�����
	}
	
	
	
	public void kill(Mortal m) {//�ӿ���Ϊ������������
		
		System.out.println(name + "����һ������");
		m.die();
	}
	
	public static void main(String[] args) {
		
		Hero garen = new Hero();
		garen.name = "����";
		
		ADHero hanbing = new ADHero();
		hanbing.name = "��������";
		
		APHero guanghui = new APHero();
		guanghui.name = "���Ů��";
		
		ADAPHero ez = new ADAPHero();
		ez.name = "�������";
		
		
//		LifePotion lp =new LifePotion();
//		MagicPotion mp = new MagicPotion();
//		
//		garen.useItem(lp);
//		garen.useItem(mp);
		//ͬһ�������ò�ͬ���������ͬ���
		
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
			System.out.format("%s ���ڹ��� %s, %s ��Ѫ������� %.0f%n",name,h.name,h.name,h.hp);
		}	
		System.out.println(h.name +"����!");
	}

	public synchronized void hurt() {
        if (hp == 1) {
            try {
                // ��ռ��this�ļ�Ѫ�̣߳���ʱ�ͷŶ�this��ռ�У����ȴ�
                this.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
 
        hp = hp - 1;
        System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
    }

	
	//��Ѫ
    //ֱ���ڷ���ǰ�������η�synchronized
    //������Ӧ��ͬ�����󣬾���this
    //��hurt�����ﵽ��Ч��һ��
	public synchronized void recover() {
		hp+=1;
		// TODO Auto-generated method stub
		
		 System.out.printf("%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n", name, name, hp);
	     // ֪ͨ��Щ�ȴ���this�����ϵ��̣߳������ѹ����ˣ����20�У��ȴ��ŵļ�Ѫ�̣߳����ѹ���
	     this.notify();
		
	}

	
}

