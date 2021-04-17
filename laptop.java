
package computer;


public class laptop extends Computer{
    
    protected String lenght;
    protected String width;
    protected String height;
    protected String weight;
    
    public laptop(){
        super();
    }
    
    public laptop(String a, String b, String c, String d, String e, String f, String g, String h){
        super(a, b, c, d);
        this.lenght = e;
        this.width = f;
        this.height = g;
        this.weight = h;
    }
    
    public void display(){
        System.out.println("\n");
        super.display();
        System.out.println("length :"+this.lenght);
        System.out.println("width :"+this.width);
        System.out.println("height :"+this.height);
        System.out.println("weight :"+this.weight);
    }
    
}
