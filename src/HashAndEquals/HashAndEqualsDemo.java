package HashAndEquals;

public class HashAndEqualsDemo {
    public static void main(String[] args) {

        //equals comparison for an object
        Student student = new Student(1, "megha", 50);
        Student student1 = new Student(1, "megha", 50);
        System.out.println(student + " " + student1);
        System.out.println(student.equals(student1));// false

        //equals comparison for string
        String string = new String("Meghana");
        String string1 = new String("Meghana");

        System.out.println(string.equals(string1));// true

        //equals comparison for string
        Integer integer = 12;
        Integer integer1 = 12;
        System.out.println(integer.equals(integer1)); //true
    }
}