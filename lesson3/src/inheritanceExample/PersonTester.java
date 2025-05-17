package inheritanceExample;

public class PersonTester {

    public static void main(String[] args){

        Person tanu = new Person("Tanu","Nautiyal");
0
        System.out.println(tanu);

        Student mike = new Student("Mike","Thompson","12");
        System.out.println(mike);

        StudentEmployee ashu = new StudentEmployee("Ashu","Bhatt","06",20.8,"8080720");
        System.out.println(ashu);
    }
}
