package tnt.nthinh.interfaceandabstractclasses;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();

    }
}
