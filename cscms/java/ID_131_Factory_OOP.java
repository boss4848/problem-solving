
public class ID_131_Factory_OOP {
    public static void main(String[] args) {
        Factory fac1 = new Factory(67, 9, 10, 1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}

class Factory {
    double iron;
    double copper;
    double silver;
    double gold;
    int circuitBoard = 0;

    Factory(double iron, double copper, double silver, double gold) {
        this.iron = iron;
        this.copper = copper;
        this.silver = silver;
        this.gold = gold;
    }

    public double getIron() {
        return iron;
    }

    public double getCopper() {
        return copper;
    }

    public double getSilver() {
        return silver;
    }

    public double getGold() {
        return gold;
    }

    void buildCircuitBoard(int num) {
        // for (int i = num; i >= 0; i--) {
        // if (silver >= 2 && gold > 0.01 && copper >= 5) {
        // circuitBoard++;
        // silver -= 2;
        // gold -= 0.01;
        // copper -= 5;

        // }
        // }
        circuitBoard += num;
        double copperNeeded = (5 * num) / 1000000.00;
        double silverNeeded = (2 * num) / 1000000.00;
        double goldNeeded = (0.01 * num) / 1000000;
        this.copper -= copperNeeded;
        this.silver -= silverNeeded;
        this.gold -= goldNeeded;
    }

    public int getCircuitBoard() {
        return circuitBoard;
    }

}