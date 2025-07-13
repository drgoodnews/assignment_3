// Student.java
public class Student {
    public static void main(String[] args) {
        Student s1 = new Student("Muhammed", 20, 3.8);
        Student s2 = new Student("Ali", 22, 3.4);
        Student s3 = new Student("Hany", 19, 3.9);

        // Use methods
        s1.displayInfo();
        s1.study();

        s2.displayInfo();
        s2.study();

        s3.setGpa(4.0);
        System.out.println("\nUpdated Charlie's GPA:");
        s3.displayInfo();
    }

    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    public void study() {
        System.out.println(name + " is studying hard!");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }
}
