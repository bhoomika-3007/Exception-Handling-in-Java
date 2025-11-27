// ye h flow of the try and catch program in java // 
public class first8 {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
            int a = 100, b = 2, c; 
            System.out.println("3");
            c=a/b;
            System.out.println("4");
            System.out.println(c); // try catch block m jab hi jata h jab usse exception milti h // 
            System.out.println("5"); // aab try method catch belock m nahi jagya // 
        } catch (Exception e) {
            System.out.println("6");
            System.out.println(e);          
            System.out.println("7");
        }
        System.out.println("hello");     
    }
    
}
