
package publication;


public class publication_runner {
    public static void main (String[]args){
        
        publication p = new publication();
        p.setTile("harry potter and soccer's stone");
        p.setPrice("Rs. 560");
        p.display();
        
        
        book b = new book("the secret seven", "Rs.90", "134");
        b.display();
        
        tape t = new tape("the road to victory", "Rs. 1500", "90 minutes");
        t.display();
    }
    
}
