package calculatorPackage;

public class calcTester {

    public static void main(String[] args){
        Calculator calc = new Calculator(5.6f,4.9f);

        System.out.println(calc.add());
        System.out.println(calc.mul());

        System.out.println(calc);
    }
}
