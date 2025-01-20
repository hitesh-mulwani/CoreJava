class L14_immutableString {
    public static void main(String[] args) {
        //creating constant for name ref var 
        String name="hitesh";
        System.out.println(name); //eg add^: 101
        
        //adding new constant to string constant pool in heap
        name= name+ " mulwani";
        System.out.println(name); //refers to new constant in heap eg add^: 105

        //more than one ref var can point to the same constant value in string pool to save memory
        String s1= "hello";
        String s2= "hello";
        System.out.println(s1==s2); //returns true , as both will point to the same add^
         
    }
}
