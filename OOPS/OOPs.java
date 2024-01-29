class Pen{
    String colour;
    String type;
    public void write(){
        System.out.println("Write Somethings");
    }
    public void printcolour(){
        System.out.println(this.colour);
    }
    
    public void printtype(){
        System.out.println(this.type);
    }
}
public class OOPs{
    public static void main (String args[]){
        Pen pen1 = new Pen();
        pen1.colour="blue";
        pen1.type="gel";

        Pen pen2 = new Pen(); 
        pen2.colour = "black";
        pen2.type = "ballpoint";

        pen1.printcolour();
        pen1.printtype();
        pen2.printcolour();
        pen2.printtype();
        pen1.write();
    }
}                                                                                                                                                                                                                                         