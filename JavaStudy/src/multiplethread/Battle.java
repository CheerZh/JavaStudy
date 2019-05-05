package multiplethread;

import charactor.Hero;
/**
 * 方法二：实现Runnable接口
 * @author zgq
 *
 */
public class Battle implements Runnable{
     
    private Hero h1;
    private Hero h2;
 
    public Battle(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }
 
    public void run(){
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}