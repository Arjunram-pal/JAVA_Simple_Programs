class MultithreadingDemo extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
            
            
        }
        catch(Exception e)
        {
            System.out.println("Exception is caught"+e);
        }
    }
}
public class Multitheading
{
    public static void main(String[] args )
    {
        int n=7;
        for(int i=0;i<7;i++)
        {
            MultithreadingDemo obj=new MultithreadingDemo();
            obj.start();
        }
    }
}