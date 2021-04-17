
package publication;


public class publication {
    protected String title;
    protected String price;

    public publication(){
        
    }
    
    public publication(String title, String price){
        this.title = title;
        this.price= price;
        
    }
    
    public void setTile(String title){
        this.title = title;
    }
    
    public void setPrice(String price){
        this.price = price;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getPrice(){
        return price;
    }
    
    public void display(){
        System.out.println("Title : "+getTitle());
        System.out.print("Price : "+getPrice());
    }
    
}

