
public class ID_129_Car_OOP {
    public static void main(String[] args) {
        Car car1 = new Car("101", "Car 1", "Blue", 20);
        Car car2 = new Car("R9", "Car 2", "#f2f2f2", 35);
        Car car3 = new Car("AZ-204", "Car 3", "Lightly Green", 2);

        car1.drive(10);
        System.out.println(car1.getDistance());
        System.out.println(Car.accumulate_distance);

        car2.setColor("Red");
        System.out.println(car2.getColor());

        System.out.println(car1.getName());
        System.out.println(car3.getDistance());
        System.out.println(car3.getVelocity());

        car3.setVelocity(100);
        car3.drive(20);
        car2.drive(60);
        System.out.println(Car.accumulate_distance);

        car1.setName("New Name");
        car3.setId("AZ-303");
        System.out.println(car1.getName());
        System.out.println(car3.getId());
    }
}

class Car {
    String id;
    String name;
    String color;
    int velocity;
    int distance;
    static int accumulate_distance;

    Car(String id, String name, String color, int velocity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.velocity = velocity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getDistance() {
        return distance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    void drive(int second) {
        distance = (velocity * second) + distance;
        accumulate_distance = accumulate_distance + distance;
    }
}