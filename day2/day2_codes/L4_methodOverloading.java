class AddMethods{
    public int add (int a, int b){
        return a+b;
    }
    public int add (int a, int b, int c){
        return a+b+c;
    }
    public double add (double a, double b){
        return a+b;
    }
}

public class L4_methodOverloading {

    public static void main(String[] args) {
        AddMethods obj= new AddMethods();
        System.out.println("Addition of 2 int nums: "+obj.add(4,5));
        System.out.println("Addition of 3 int nums: "+obj.add(1,2,3));
        System.out.println("Addition of 2 double nums: "+obj.add(7.7,8.8));
    }
}