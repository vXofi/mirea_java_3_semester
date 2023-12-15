package ru.mirea.lab22.Task2Chairs;

public class Test {
    public static void main(String[] args) {
        ChairFactory victorianFactory = new VictorianChairFactory();
        Chair victorianChair = victorianFactory.createChair();

        ChairFactory multifunctionalFactory = new MultifunctionalChairFactory();
        Chair multifunctionalChair = multifunctionalFactory.createChair();

        ChairFactory magicFactory = new MagicChairFactory();
        Chair magicChair = magicFactory.createChair();

        Client client = new Client();
        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}
