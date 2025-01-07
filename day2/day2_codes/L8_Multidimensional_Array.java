public class L8_Multidimensional_Array {
    public void printArr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void assignRandomValues(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=(int) (Math.random()*10);
            }
        }
    }
    public static void main(String[] args) {
        int nums[][] = new int[3][3];
        L8_Multidimensional_Array obj= new L8_Multidimensional_Array();
        obj.assignRandomValues(nums);
        System.out.println("print array using normal for loop: ");
        obj.printArr(nums);
        System.out.println("printing array using for each loop: ");
        for (int[] n : nums) {
            for (int m : n) {
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }   
}
