class Calculate{
    public int add(int a, int b){
        return a+b;
    }
}

public class L1_class_and_object {

    public static void main(String[] args) {
        Calculate obj= new Calculate();
        int num1=4;
        int num2=5;
        int result=obj.add(num1,num2);
        System.out.println("Addition of 2 numbers: "+result);
    }
}