package p4n;

public class Student {
    private int age;
    private String name;
    private String crs;
    // Parameterized Constructor to set Student
    // name, age, course enrolled in.
    public Student(String n, int a, String c)
    {
        this.name = n;
        this.age = a;
        this.crs = c;
    }
    // Setter Methods to set table data to be
    // displayed
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCrs() { return crs; }
}