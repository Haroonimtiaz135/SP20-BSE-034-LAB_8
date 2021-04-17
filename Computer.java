
package computer;


public class Computer {

   protected String wordsize;
   protected String memorysize;
   protected String storagesize;
   protected String speed;
   
   public Computer(){
       
   }
   
   public Computer(String a, String b, String c, String d){
       this.wordsize = a;
       this.memorysize = b;
       this.storagesize= c;
       this.speed= d;
   }
   
   public void display(){
       System.out.println("word size :"+this.wordsize);
       System.out.println("memory size :"+this.memorysize);
       System.out.println("storage size :"+this.storagesize);
       System.out.println("speed :"+this.speed);
       
   }
    
}
