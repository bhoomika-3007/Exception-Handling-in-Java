// finally Block  in java // 
// finally execute hoga hi hoga //
public class fin { // finally ko hum try and catch ke baad use karte h // 
    // ya hum direct try ke baad bhi use kar sakte h  finally block ko //   
    public static void main(String[] args) { // finally hamesha execute hota hi hota h chaye try tke aander exception aata ho ya nahi aata ho //
     // finally direlty use nahi hota h vo error show kara dega //
     try {
         int a =100, b=2,c;
         c=a/b;
         System.out.println(c);
     } catch (Exception e) { // ye arthmetic exception h // 
           System.out.println(e);  // catch block execute nahi hoga kyuki exception occur nahi ho rahi h // 
     }
     finally{
        System.out.println("i am in finally block ");

     }
        

    }




}
