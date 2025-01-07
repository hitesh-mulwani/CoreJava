//to understand data storing in stack and heap in JVM.
class Calculate{
    int num=5;
    public int add (int n1,int n2){
        return n1+n2;
    }
}
public class L5_Stack_and_Heap {
    public static void main(String[] args) {
        Calculate obj= new Calculate();
        int r1=obj.add(3,4);
        System.out.println("Addition of 2 numbers= "+r1);
        Calculate obj1= new Calculate();
        System.out.println("Value of num instance variable before changes...");
        System.out.println("obj: "+obj.num);
        System.out.println("obj1: "+obj1.num);

        obj.num=8; //updation

        System.out.println("Value of num instance variable after changes...");
        System.out.println("obj: "+obj.num);
        System.out.println("obj1: "+obj1.num);

    }
}
