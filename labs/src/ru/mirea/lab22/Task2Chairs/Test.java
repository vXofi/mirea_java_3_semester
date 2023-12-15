package ru.mirea.lab22.Task2Chairs;

public class Test {
    public static void main(String[] args) {
        UniversalChairFactory factory = new UniversalChairFactory();


        Chair victorianChair = factory.createVictorianChair();
        Chair multifunctionalChair = factory.createMultifunctionalChair();
        Chair magicChair = factory.createMagicChair();

        Client client = new Client();
        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}
