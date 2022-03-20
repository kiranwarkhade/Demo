public class Demo {
    public static void main(String[] args) {
        
        System.out.println("Hello Java program ");

        String s="              Balaji   Kumar   ";
        String s1="              Balaji   Kumar   ";


        String ss="Kiran Kumar";


        System.out.println(s==s1);
        System.out.println(s.equals("              Balaji   Kumar   "));



        System.out.println(s);
        System.out.println(s.strip());
        System.out.println(s.concat("Hari"));
        System.out.println(s.replaceAll(s, "jayram"));
        System.out.println(s.toCharArray());
       System.out.println( s.split(s));
       
    }

}
