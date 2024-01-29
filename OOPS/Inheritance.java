// class shape{
//     String colour;
// }
// class Triangle extends shape{
//     public void printcolour(){
//         System.out.println(this.colour);
//     }
// }
// public class Inheritance{
//     public static void main(String args[]){
//         Triangle t1=new Triangle();
//         t1.colour="red";
//         t1.colour="black";
//         t1.printcolour();
//     }
// }

// single level inheritance

// class Shape{
    
//     public void area(){
//         System.out.println("Displayed ares");
//     }
// }
// class Triangle extends Shape{
//     public void area(int l, int h){
//         System.out.println(1/2.0*h*l);
//     }
// }
// public class Inheritance{
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();
//         t1.area(4,5);
        
//     }
// }


// multi level inheritance
class Shape{
    public void area(){
        System.out.println("Displayed area");
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
class EquiletralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}
public class Inheritance{
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.area(5,7);

        EquiletralTriangle t2 = new EquiletralTriangle();
        t2.area(7,8);

    }
}