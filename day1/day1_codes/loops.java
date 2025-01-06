import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //while loop - print HI multiple times
        int i=1;
        while(i<=5){
            System.out.println("HI "+i);
            int j=1;
            while(j<=3){
                System.out.println("    HELLO "+j);
                j++;
            }
            i++;
        }
        System.out.println("Bye normal while loop... ");

        //do while loop
        System.out.println("\ndo while loop begins...");
        int ch;
        int a=5;
        int b=2;
        do{
            System.out.println("MENU: 1-add,2-substract,3-exit.");
            System.out.print("enter choice: ");
            ch=sc.nextInt();
            if (ch==1){
                System.out.println("addition= "+ (a+b));
            }else if(ch==2){
                System.out.println("Substraction= "+ (a-b));
            }else if(ch==3){
                System.out.println("exiting the program bye...");
                break;
            }
            else {
                System.out.println("invalid choice try again.");
            }
        }while(ch!=3);

        //for loop
        System.out.println("\nfor loop begins...");
        int tableNum;
        System.out.print("enter the table number: ");
        tableNum=sc.nextInt();

        for (int f=1;f<=10;f++){
            System.out.println(tableNum+" x "+f+" = "+ (tableNum*f));
        }
    }   
}
