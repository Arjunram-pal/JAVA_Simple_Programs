class Geek1 extends Thread
{
    public void run()
    {
        synchronized(this)
        {
            System.out.println(Thread.currentThread().getName() + "...starts");
            try 
            {
                this.wait();
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "...notified");
        }
    } 

} 
class Geek2 extends Thread 
{
    Geek1 geeks1;
    Geek2(Geek1 geeks1)
    {
        this.geeks1 = geeks1;
    } 
    public void run()
    {
        synchronized(this.geeks1) 
        {
            System.out.println(Thread.currentThread().getName() + "...starts");
            try 
            {
                this.geeks1.wait();
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "...notified");
        } 

    }
}
//class Geek3 extends Thread 
//{
//    Geek1 geeks1;
//    Geek3(Geek1 geeks1)
//    {
//        this.geeks1 = geeks1;
//    } 
//    public void run()
//    {
//        synchronized(this.geeks1)
//        {
//            System.out.println(Thread.currentThread().getName() + "...starts");
//            this.geeks1.notify();
//            System.out.println(Thread.currentThread().getName() + "...notified");
//        }
//    } 
//}
//class Geek4 extends Thread 
//{
//    Geek1 geeks1;
//    Geek4(Geek1 geeks1)
//    {
//        this.geeks1 = geeks1;
//    }
//    public void run()
//    {
//        synchronized(this.geeks1)
//        {
//            System.out.println(Thread.currentThread().getName() + "...starts");
//            this.geeks1.notifyAll();
//            System.out.println(Thread.currentThread().getName() + "...notified");
//        }
//    } 
//}
public class Multithreading
{
    public static void main(String[] args) throws InterruptedException
    {
        Geek1 geeks1 = new Geek1();
        Geek2 geeks2 = new Geek2(geeks1);
//        Geek3 geeks3 = new Geek3(geeks1);
//        Geek4 geeks4 = new Geek4(geeks1);
        Thread t1 = new Thread(geeks1, "Thread-1");
        Thread t2 = new Thread(geeks2, "Thread-2");
//        Thread t3 = new Thread(geeks3, "Thread-3");
//        Thread t4 = new Thread(geeks4, "Thread-4");
        t1.start();
        t2.start();
        Thread.sleep(1000);
//        t3.start();
//        Thread.sleep(1000);
//        t4.start();
    }
}