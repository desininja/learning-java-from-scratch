package exceptionExample;

public class PhoneExceptionTester{
    public static void main(String[] args){
        String[] numbers = new String[] {"123-4567",null,"234-324","234-234"};

        for (int i=0; i< numbers.length;i++){
            try{
                System.out.println(new Phone("Iphone",numbers[i]));
            }
            catch (IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }
        }

        for (int i =0; i < numbers.length;i++) {
            System.out.println(new Phone("IPhone",numbers[i]));
        }

    }
}