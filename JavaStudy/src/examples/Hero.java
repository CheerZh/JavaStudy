package examples;

public class Hero {
    
    String name; //����
        
    float hp; //Ѫ��
        
    float armor; //����
        
    int moveSpeed; //�ƶ��ٶ�
        
    //��һ�������Ĺ��췽��
    public Hero(String name){
        System.out.println("һ�������Ĺ��췽��");
        this.name = name;
    }
      
    //�����������Ĺ��췽��
    public Hero(String name,float hp){
        this(name);  //������һ�����췽����= Hero��name����
        System.out.println("���������Ĺ��췽��");
        this.hp = hp;
    }
 
    public static void main(String[] args) {
        Hero teemo =  new Hero("��Ī",383);
         
        System.out.println(teemo.name);
         
    }
      
}

