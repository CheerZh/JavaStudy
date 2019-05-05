package collection;
     
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
     
import charactor.Hero;
     
public class ListSearchTime {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<Hero>();
            
        for (int j = 0; j < 2000000; j++) {
            Hero h = new Hero("Hero " + j);
            heros.add(h);
        }
            
        // 进行10次查找，观察大体的平均值
        for (int i = 0; i < 10; i++) {
        	
            // 打乱heros中元素的顺序
            Collections.shuffle(heros);
             
            long start = System.currentTimeMillis();
            //获取当前时间
     
            String target = "Hero 1000000";
     
            for (Hero hero : heros) {
                if (hero.name.equals(target)) {  //equals
                    System.out.println("找到了 hero!" );
                    break;
                }
            }
            
            long end = System.currentTimeMillis();
            long elapsed = end - start;
            System.out.println("一共花了：" + elapsed + " 毫秒");
        }
             
    }
}