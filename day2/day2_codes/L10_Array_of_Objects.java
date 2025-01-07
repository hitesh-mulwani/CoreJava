class Student{
    int roll;
    String name;
}

public class L10_Array_of_Objects {
    public static void main(String[] args) {
        Student s[] = new Student[3];
        Student s1= new Student();
        s1.roll=1;
        s1.name="hitesh";
        Student s2= new Student();
        s2.roll=2;
        s2.name="ganesh";
        Student s3= new Student();
        s3.roll=3;
        s3.name="sejal";

        s[0]=s1;
        s[1]=s2;
        s[2]=s3;

        //printing all stdent data
        System.out.println("Student Details: ");
        for (Student i: s) {
            System.out.println("Roll no-"+i.roll+" ,Name-"+i.name);
        }
    }
}
