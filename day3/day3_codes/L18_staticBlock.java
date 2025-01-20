class Student{
    String name;
    int rollNo;
    static String class_div; 

    public Student(){
        name = "Unknown";
        rollNo = 0;
        System.out.println("Constructor is invoked");
    }
    static{
        class_div = "SE-B";
        System.out.println("Static block is invoked");
    }
}

public class L18_staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Student"); //to invoke static bloack without using object
        // static block is invoked before constructor
        Student s1 = new Student();
        Student s2 = new Student();
    }
}
