public class L9_Jagged_and_3dArray {
    public static void main(String[] args) {
        
        int nums[][] = new int [3][]; //jagged
        //now mention each individual column size seperately

        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];

        //assign values loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j]= (int) (Math.random()*100);
            }
        }
        System.out.println("print values using normal array...");
        for (int i = 0; i < nums.length; i++) {
            System.out.print("[");
            for (int j = 0; j < nums[i].length; j++) {
                if(j<(nums[i].length-1)){
                    System.out.print(nums[i][j] +",");
                }else{
                    System.out.print(nums[i][j]+"");
                }
            }
            System.out.print("]");
            System.out.println();
        }

        System.out.println("printing array using for each array..."); //useful as you dont need to mention size
        for (int[] n : nums) {
            System.out.print("[ ");
            for (int m : n) {
                System.out.print(m+" ");
            }
            System.out.print("]");
            System.out.println();
        }

        //3d array
        //int three[][][] = new int[4][3][2];
    }
}
