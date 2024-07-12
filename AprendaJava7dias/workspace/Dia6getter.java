public class Dia6getter {
    public static void main(String[] args) {
        Car car = new Car(marca:"BMW", modelo:"X6", ano:2024);
        System.out.println(Car.getMarca());
        System.out.println(Car.getModelo());
        System.out.println(Car.getAno());
    }    
}
