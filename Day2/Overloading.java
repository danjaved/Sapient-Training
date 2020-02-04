public class Overloading
{
    public long sum(int a,int b)
    {
        System.out.println("Both integer");
        return a+b;
    }
    public long sum(long a,int b)
    {
        System.out.println("long int");
        return a+b;
    }
    public long sum(int a,long b)
    {
        System.out.println("long int");
        return a+b;
    }
    public long sum(int a,int b,int c)
    {
        System.out.println("three");
        return a+b+c;
    }
    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.sum(12,12);
        
    }
}