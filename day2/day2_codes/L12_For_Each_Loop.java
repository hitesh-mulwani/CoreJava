
public class L12_For_Each_Loop {
    int n=3;//instance variable
    public static void main(String[] args) {
        int nums[]= new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= (int) (Math.random()*100);
        }
        for (int i : nums) {
            System.out.print(i+" ");
        }
        int n=2;//local variable
        System.out.println(n); // 2 , local will get print.
    }  
}
