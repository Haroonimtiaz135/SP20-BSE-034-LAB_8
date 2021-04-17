
package computer;


public class Computer_runner {
    public static void main (String[]args){
        
        Computer c = new Computer("32 bits", " 4000 bytes", "250000 bytes", "3200 megahertz");
        c.display();
        
        laptop l = new laptop("16 bits", " 4250 bytes", "350000 bytes", "1600 megahertz", "134cm", "156cm", "267cm", "0.7kg");
        l.display();
        
    }
    
}
