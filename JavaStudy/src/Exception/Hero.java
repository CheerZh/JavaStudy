package Exception;

/**
 * �μ��Զ����쳣EnemyHeroIsDeadException
 * @author zgq
 *
 */

public class Hero {
	
	public String name;
	protected float hp;
	
	public void attackHero(Hero h) throws EnemyHeroIsDeadException{
		if(h.hp == 0) {
			throw new EnemyHeroIsDeadException(h.name + "�Ѿ������ˣ�����Ҫʩ�ż���");
		}
	}

//	public String toString() {
//		return name;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616;
		
		Hero teemo = new Hero();
				
		teemo.name = "��Ī";
		teemo.hp = 0;
		
		try {
			garen.attackHero(teemo);
		}catch(EnemyHeroIsDeadException e) {
			System.out.println("�쳣��ԭ��"+ e.getMessage());
			e.printStackTrace();
		}

	}

}
