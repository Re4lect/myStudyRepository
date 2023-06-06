public class Main {
    public static void main(String[] args) {
        Body body = new Body("Седан");
        Wheels wheels = new Wheels(4);
        Engine engine = new Engine("BMW",4.6);

        Car car = new Car(engine,body,wheels);
        System.out.println("обьем двигателя: "+car.getEngine().getVolume());
        System.out.println(car);
    }
}