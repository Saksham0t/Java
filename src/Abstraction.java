//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//}
//class FountainPen extends Pen{
//    public void write(){
//        System.out.println("Writing");
//    }
//    public void refill(){
//        System.out.println("Refilling");
//    }
//    public void changeNib(){
//        System.out.println("Nib changed");
//    }
//}

//class Monkey{
//    void jump(){
//        System.out.println("Jumping");
//    }
//    void bite(){
//        System.out.println("Biting");
//    }
//}
//interface BasicAnimal{
//    void eat();
//    void sleep();
//}
//class Human extends Monkey implements BasicAnimal{
//    public void eat(){
//        System.out.println("Eating");
//    }
//    public void sleep(){
//        System.out.println("Sleeping");
//    }
//}

//abstract class TelePhone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//class SmartTelephone extends TelePhone{
//    void ring(){
//        System.out.println("Ringing");
//    }
//    void lift(){
//        System.out.println("Lifting");
//    }
//    void disconnect(){
//        System.out.println("Disconnecting");
//    }
//}

interface TvRemote{
    void onTv();
    void offTv();
}
interface SmartTvRemote extends TvRemote{
    void onTv();
    void offTv();
}
class Tv implements TvRemote{
    @Override
    public void onTv() {
        System.out.println("ON...");
    }
    @Override
    public void offTv() {
        System.out.println("OFF...");
    }
}

public class Abstraction {
    public static void main(String[] args) {
//     FountainPen fp = new FountainPen();
//        fp.write();
//        fp.refill();
//        fp.changeNib();

//        Human raj = new Human();
//        raj.sleep();

        // Polymorphism
//        Monkey baanar = new Human();
//        baanar.bite();
//        baanar.jump();

//        TelePhone beetle = new SmartTelephone();
//        beetle.ring();
//        beetle.lift();
//        beetle.disconnect();

        Tv sony = new Tv();
        sony.onTv();
        sony.offTv();


    }
}
