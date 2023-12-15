package ru.mirea.lab22.Task2Chairs;

class VictorianChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new VictorianChair();
    }
}
