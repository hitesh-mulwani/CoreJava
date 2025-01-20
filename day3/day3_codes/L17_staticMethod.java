class Demo{
    String name;
    int age;
    //passing obj as argument to access the instance variable, if we try to do it without passing obj as argument it will give error
    public static void show(Demo obj){
        System.out.println("This is a static method...");
        System.out.println("value of object is- Name:"+obj.name+"  Age:"+obj.age);
    }
}
public class L17_staticMethod {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.age = 20;
        obj.name = "Hitesh";
        Demo.show(obj);
    }
    
}
