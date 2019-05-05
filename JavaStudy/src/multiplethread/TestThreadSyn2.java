package multiplethread;

import charactor.Hero;
   
public class TestThreadSyn2 {
  
    public static void main(String[] args) {
 
        final Object someObject = new Object();
         
        final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 10000;
          
        int n = 100;
  
        Thread[] addThreads = new Thread[n];
        Thread[] reduceThreads = new Thread[n];
          
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                     
                    //�κ��߳�Ҫ�޸�hp��ֵ��������ռ��someObject
//                    synchronized (gareen) {
                    	
                        gareen.recover();
                        System.out.println(gareen.hp);
//                    }
                     
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
              
        }
          
        for (int i = 0; i < n; i++) {
            Thread t = new Thread(){
                public void run(){
                    //�κ��߳�Ҫ�޸�hp��ֵ��������ռ��someObject
//                    synchronized (someObject) {
                	
                	 //ʹ��gareen��Ϊsynchronized
                    //�ڷ���hurt����synchronized(this)
                        gareen.hurt();
                        System.out.println(gareen.hp);
//                    }             
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            reduceThreads[i] = t;
        }
          
        for (Thread t : addThreads) {
            try {
                t.join();
                System.out.println(t.toString());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (Thread t : reduceThreads) {
            try {
                t.join();
                System.out.println(t.toString());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
          
        System.out.printf("%d�������̺߳�%d�������߳̽�����%n���׵�Ѫ���� %.0f%n", n,n,gareen.hp);
          
    }
       
}