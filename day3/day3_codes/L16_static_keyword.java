class Mobile{
    String name;
    String brand;
    int price;
    static String type;

    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println("Type: "+type);
    }
}

public class L16_static_keyword {
    public static void main(String[] args) {
        Mobile.type="Smartphone"; // static variable common for all objects
        Mobile m1= new Mobile();
        m1.brand="apple";
        m1.name="iphone 12";
        m1.price=80000;

        Mobile m2= new Mobile();
        m2.brand="samsung";
        m2.name="galaxy s21";
        m2.price=70000;

        m1.showDetails();
        m2.showDetails();
    }
}
