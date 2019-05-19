
package practise;


public class Practise {

    public enum animals{
   LION,
   SNAKE,
   BEAR,
   LEOPARD,
   BIRD,
   COW,
   CAT,
   DOG
}
    public static void main(String[] args) {
         for (animals s : animals.values()) { 
            System.out.println(s); 
        } 
       
    }
    
}
