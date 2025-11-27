public class first9 {// ye h flow of the try and catch program in java // 
    public static void main(String[] args) {
        System.out.println("1");
        try {
            System.out.println("2");
            int a = 100, b = 0, c; 
            System.out.println("3");
            c=a/b;   // aab try method sidha catch belock m  jagya //  
            System.out.println("4"); // aab ye 4 or  c or 5 ko print nahi karagya // 
            System.out.println(c); // try catch block m jab hi jata h jab usse exception milti h // 
            System.out.println("5"); 
        } catch (Exception e) {
            System.out.println("6");
            System.out.println(e);          
            System.out.println("7");
        }
        System.out.println("hello");     
    }
       
}

    

