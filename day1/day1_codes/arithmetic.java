public class arithmetic{
    public static void main(String[] args) {
        int num1=7;
        int num2=5;

        int sum=num1+num2;
        System.out.println(sum);
        int diff=num1-num2;
        System.out.println(diff);
        int mul=num1*num2;
        System.out.println(mul);
        int quotient=num1/num2;
        System.out.println(quotient);
        int remainder= num1%num2;
        System.out.println(remainder);

        //preincrement num1=7
        int result=++num1;
        System.out.println(num1);
        //postincrement num2=5
        result=num2++;
        System.out.println(result);
    }
}