public class App {
    public static void main (String[] args){
        System.out.println(reverse("Hello World!"));
    }   

    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
