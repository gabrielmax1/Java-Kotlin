import java.util.Objects;

public class PersonJava {
    String name;
    int age;

    public PersonJava(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " " + age;
    }

    public static void main(String[] args) {
        PersonJava myPers = new PersonJava("Markus", 55);
        PersonJava me = new PersonJava("Gabriele", 28);

        System.out.println(myPers.age + " " + myPers.name);
        System.out.println(me);
    }


    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}