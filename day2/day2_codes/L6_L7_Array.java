//l6 is about basic need for array (in notes), L7 is practical implementation.
public class L6_L7_Array {

    public static void main(String[] args) {
        int nums []= {1,2,3};
        System.out.println("before updating nums[0]: "+nums[0]);
        nums[0]=4;
        System.out.println("after updating nums[0]: "+nums[0]);

        int nums1 []= new int[3];
        System.out.println("value of nums1[0] initially after creating it dynamically: "+nums1[0]);
        nums1[0]=6;
        nums1[1]=7;
        nums1[2]=8;
        System.out.println("values of nums1 after updating values using loop...");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+" ");
        }
    }
}