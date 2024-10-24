import java.util.Arrays;

public class Person {

    public Person(String firstName, String lastName){
        this.name = firstName;
        this.lastName = lastName;
    }

    public String name;
    public String lastName;
    public int age;
    String[] arr;

    public void showElement(){
        String arrs = Arrays.toString(arr);
        String result = String.format("Person = {name: %s, lastName: %s, age: %d, arr: %s}", name, lastName, age, arrs);
        System.out.println(result);
    }
}
