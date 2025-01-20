class L13_String{
    public static void main(String[] args) {
        String test="hello world!";
        System.out.println(test);
        String name = new String("hitesh");
        System.out.println(name);

        //printing hashcode of our string
        System.out.println(name.hashCode());

        //concatenate two strings
        System.out.println("hello"+name);
        System.out.println(name.concat("mulwani"));

        //find char at a particular index
        System.out.println("char at index 3: " + name.charAt(3));
    }
}