
class Plane{
    /*void land(){
        System.out.println("The plane is landing..........");
    }*/
    void fly(){
        System.out.println("The plane is flying..........");
    }
}
class Cargoplane extends Plane{
    void fly(){
        System.out.println("The Cargopane plane is flying in high speed..........");
    }
    /*void takeOff(){
        System.out.println("The Cargoplane  plane is taking Off..........");
    }*/
}
class FighterPlane extends Plane{
    void fly(){
        System.out.println("The fighter plane is flying very high speed.........");
    }
}
public class inheritanceEx2 {
    public static void main(String[] args){
        Cargoplane cp=new Cargoplane();
        FighterPlane fp=new FighterPlane();
        cp.fly();
        fp.fly();;
        Plane ref;
        ref=cp;
        ref.fly();
        ref=fp;
        ref.fly();
    }
}
