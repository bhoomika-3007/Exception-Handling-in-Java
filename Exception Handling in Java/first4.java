public class first4 {
    public static void main(String[] args) {
        try {
            int a = 100, b=0, c;
            c = a/b;  // try block  m hum risky code likhte h //  
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);   // catch block m hum code handler likhte h // 
        }    
        System.out.println("this is the runtime exception program in java ");
    }  // ye Arthmetic Exception show kara dega or program run bhi ho jagya // 
         // java.lang.ArithmeticException: / by zero //   
}
