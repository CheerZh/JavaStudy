package collection;

import java.util.ArrayList;
import charactor.Hero;

public class TestArrayList {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//容器类ArrayList,用于存放对象
		ArrayList heros = new ArrayList();
		heros.add(new Hero("盖伦"));
		
		//size获取ArrayList的大小
		System.out.println(heros.size());
		
		//容器的容量"capacity"会随着对象的增加，自动增长
		
		heros.add(new Hero("提莫"));
		System.out.println(heros.size());
		
		//把5个对象加入到ArrayList中
		for(int i=0 ; i<5 ; i++) {
			heros.add(new Hero("hero"+i));
		}
		System.out.println(heros);
		
		//在指定位置增加对象
		Hero specialHero = new Hero("special Hero");
		heros.add(3,specialHero);
		
		System.out.println(heros.toString());
		
		// 判断一个对象是否在容器中
        // 判断标准： 是否是同一个对象，而不是name是否相同
        System.out.print("虽然一个新的对象名字也叫 hero 1，"
        		+ "但是contains的返回是:");
        System.out.println(heros.contains(new Hero("hero 1")));
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(heros.contains(specialHero));
        
        //获取指定位置的**对象**
        System.out.println(heros.get(5));
        //如果超出了范围，依然会报错
        //System.out.println(heros.get(10));
        
        System.out.println("specialHero所处的位置"
        		+ ":"+heros.indexOf(specialHero));
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置"
        		+ ":"+heros.indexOf(new Hero("hero 1")));
        //不在里面，返回-1
        
        //remove删除对象，根据下标或名称
        heros.remove(2);
        System.out.println("删除下标是2的对象");
        System.out.println(heros);
        System.out.println("删除special hero");
        heros.remove(specialHero);
        System.out.println(heros);
        
        
        //set替换
        System.out.println("把下标是5的元素，替换为\"hero 5\"");
        heros.set(5, new Hero("hero 5"));
        System.out.println(heros);
		
        //toArray转为数组
        Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
        System.out.println("数组:" +hs);
        
        //addALL 把另一个容器里所有的元素，都加入到该容器里来
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros heros:\t" + anotherHeros);
        heros.addAll(anotherHeros);
        System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
        System.out.println("ArrayList heros:\t" + heros);
        
        
        //clear 清空
        System.out.println("使用clear清空");
        heros.clear();
        System.out.println("ArrayList heros:\t" + heros);
	}

}
