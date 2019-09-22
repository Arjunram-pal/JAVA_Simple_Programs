class Sport
{
    int spmk=75;
}
class Result extends Sport
{
    int sub1=55;
    int sub2=60;
    public void total()
    {
       System.out.println("Total marks="+(spmk+sub1+sub2));
    }
}
public class Inheritance_pprogram
{
    public static void main(String[] args)
    {
        Result s=new Result();
        s.total();
    }
}