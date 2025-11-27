public class fina {
    public static void main(String[] args) { // finally hamesha execute hota hi hota h chaye try tke aander exception aata ho ya nahi aata ho //
     // finally direlty use nahi hota h vo error show kara dega //
     try {
         int a =100, b=0,c;
         c=a/b;
         System.out.println(c);
     } catch (Exception e) { // ye arthmetic exception h // 
           System.out.println(e);  // aab ki baar catch block execute hoga exception occur ho rahi h  // 
     }
     finally{
        System.out.println("i am in finally block "); // or finally bhi execute hoga //  

     }
        

    }

    
}
