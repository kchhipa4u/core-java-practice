/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Threading;

/**
 *
 * @author kc211701
 */

class A extends Thread{
    int count = 0;
        public void run(){
            
            synchronized (this) {
                System.out.println("Fun");
                System.out.println(Thread.currentThread().getName());
                for(int i =0; i < 50 ; i++){
                    count = count + i;
                }
                System.out.println("before notify" + Thread.currentThread().getName());

                notify();
                System.out.println("before notify" + Thread.currentThread().getName());
        }
    }
}




public class ThreadTest{

public static void main(String argv[]) throws InterruptedException {
    A a = new A();
    a.start();
    synchronized (a) 
    {
        Thread.sleep(10000L);
        System.out.println("waiting");
        try{
            a.wait();
        }catch(InterruptedException e){

        }
        System.out.println(a.count);

        }

}

}
