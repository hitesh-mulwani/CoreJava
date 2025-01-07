class Computer{
    public void playMusic(){
        System.out.println("Playing music.");
    }

    public String getMePen(int cash){
        if(cash>=10){
            return "Here is your Pen!";
        }
        return "Sorry you dont have enough cash to buy the pen!";
    } 
}
public class L3_methods {

    public static void main(String[] args) {
        Computer obj= new Computer();
        obj.playMusic();
        String str= obj.getMePen(15);
        System.out.println(str);
    }
}