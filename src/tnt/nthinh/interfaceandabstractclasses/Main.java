package tnt.nthinh.interfaceandabstractclasses;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(60);
        carInterface.move(90);
        System.out.println("hihi");
        System.out.println("Moi71 them vo ne");
        System.out.println("Cai nay the, tren magn ne");        
    }
}
