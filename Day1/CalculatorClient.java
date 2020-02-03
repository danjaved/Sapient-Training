public class CalculatorClient
{
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int a=8;
        int b=2;
        System.out.println("Sum = "+calculator.add(a,b));
        System.out.println("Diffrence = "+calculator.substract(a, b));
        System.out.println("Product = "+calculator.product(a,b));
        System.out.println("Quotient ="+calculator.divide(a, b));
        System.out.println("Modulus = "+calculator.module(a, b));
        
    }
}