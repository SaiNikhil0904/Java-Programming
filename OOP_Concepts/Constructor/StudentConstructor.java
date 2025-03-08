class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
        this.name = "unknown";
    }
}

public class StudentConstructor {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "xyz";
        System.out.println(obj.name);
    }
}