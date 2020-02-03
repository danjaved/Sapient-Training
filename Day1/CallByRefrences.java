public class CallByRefrences
{
    public static void main(String[] args) {
        
        int primitiveValue=100;
        int[] intarray=new int[10];
        callByValue(primitiveValue);
        System.out.println("The value primitiveValue after execution");
        CallByRefrence(intarray);
        System.out.println("The value of array element after execution");
    }
    public static void callByValue(int value)
    {
        value+=2;
    }
    public static void CallByRefrence(int[] array)
    {
        System.out.println("Wihtin the callByRefrence method the value of array is "+array[0]);
        array[0]=15;
        System.out.println("Within the callByrefrence method, after setting the value of array is "+array[0]);
    }
}
