import java.io.FileInputStream;
public class first1 { 
    public static void main(String[] args) {
        
     // aab hum iss m try and catch ke use karenge to handle the exception // 
    try{
        FileInputStream fe = new FileInputStream("E:/abc.txt"); // try m hum risky code likhte h // 
    }
    catch(Exception e ){
        System.out.println(e);  // catch m hum handler code likhte h //  
    }
     // agar ye pata karna h ki code execute hua h ki nahi tho catch ke baad hum koi bhi print statement de sakte h // 
    System.out.println("this is the exception handling in java ");  // agar ye print ho jata h tho humara code successfully execute ho gaya h // 
} 
}    // iss program ko dhyan se dheko iss program m file mil chuki h tho iss baar koi bhi exception nahi aagya // 
  // humara program sidha compile and run ho jagya //      