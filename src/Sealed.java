abstract sealed class Vechile permits Bike,Car{
    public static void print(){
        System.out.println("This is from vechile class");
    }
}

final class Bike extends Vechile{
    public static void print(){
        System.out.println("This is from Bike class");
    }
}

final class Car extends Vechile{
    public static void print(){
        System.out.println("This is from Car class");
    }
}

//The cycle is not mentioned in the permits section so it cann't be extended by using vechile class

//class Cycle extends Vechile{
//    public static void print(){
//        System.out.println("This is from Cycle class");
//    }
//}

public class Sealed {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.print();

    }

}
