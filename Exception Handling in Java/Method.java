// Method to print Exception Information in Java // 

public class Method {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace(); // sabse jada use hota h  ye exception name , description and stack trace tino chij print karata h // 
            System.out.println(e); // ya tho bss e likh do 
            // ya phir //
             System.out.println(e.toString()); // isse use kar lo //  
               System.out.println(e.getMessage()); // ye exception name print nahi karega or stack trace bhi print nahi karega ye sirf description print karta h // 
               // aab print karane ke total humare pass three ways hote h //    
        }
    }
    
}
