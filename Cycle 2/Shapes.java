// (B) Implement Polymorphism in Java

abstract class shape{
    abstract void numberOfsides();
}
class triangle extends shape{
    void numberOfsides(){
        System.out.println("Triangle has 3 sides");
    }
}
class rectangle extends shape{
    void numberOfsides(){
        System.out.println("Rectangle has 4 sides");
    }
}
class hexagon extends shape{
    void numberOfsides(){
        System.out.println("Hexagon has 6 sides");
    }
}

public class Shapes {
    public static void main(String args[]){
        triangle t=new triangle();
        rectangle r=new rectangle();
        hexagon hx=new hexagon();
        t.numberOfsides();
        r.numberOfsides();
        hx.numberOfsides();
    }
}
