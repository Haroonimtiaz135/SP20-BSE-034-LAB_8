
package publication;


public class tape extends publication {
    
    protected String mins;
    
    public tape(){
        super();
    }
    
    public tape(String title, String price, String mins){
        super(title, price);
        this.mins = mins;
    }
    
    public void setmins(String mins){
        this.mins = mins;
        
    }
    
    public String getmins(){
        return mins;
    }
    
    public void display(){
        System.out.println("\n ");
        super.display();
        System.out.println("\nRunning Time : "+getmins()+"\n");
    }
    
    
}
