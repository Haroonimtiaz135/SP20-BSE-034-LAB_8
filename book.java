
package publication;


public class book extends publication{
    protected String pagecount;
    
    public book(){
        super();
    }
    
    public book(String title, String price,String pagecount){
        super(title, price);
        this.pagecount = pagecount;
    }
    
    public void setPageCount(String pagecount){
        this.pagecount = pagecount;
    }
    
    public String getPageCount(){
        return pagecount;
    }
    
    public void display(){
        System.out.println("\n");
        super.display();
        System.out.println("\nPage Count : "+getPageCount()+"\n");
        
    }
    
}
