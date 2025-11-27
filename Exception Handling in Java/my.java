public class my {
    public static void main(String[] args) {
        try {
            int a = 100, b=0, c;
            c=a/b; 
            System.out.println(c); // try ke badd directly finally use kar sakte h // 
        }
        finally{
            System.out.println("i am in finally block ");
            // finally m hum clean up code likhte h // 
            // iss m hum close kara dete h open sources ko // 
        }
    }
    
}
