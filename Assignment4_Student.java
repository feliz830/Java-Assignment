package Assignment;

public class Assignment4_Student {
	String name;
    int age;

    Assignment4_Student(String name) {
        this.name = name;
        this.age = 0;
    }

    Assignment4_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Assignment4_Student s1 =
                new Assignment4_Student("Nandha");

        Assignment4_Student s2 =
                new Assignment4_Student("Sheik", 21);

        s1.display();
        s2.display();
    }
}

