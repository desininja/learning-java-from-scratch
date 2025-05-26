package creatingClass;

public class DogMain {

    public static void main(String[] args){
        Dog myDog = new Dog("Labrador","Tyson","Golden",4);
        System.out.println(myDog.getDogType());
        System.out.println(myDog.getDogName());
        System.out.println(myDog.getDogColor());
        System.out.println(myDog.getDogAge());


        System.out.println(myDog);
    }
}
