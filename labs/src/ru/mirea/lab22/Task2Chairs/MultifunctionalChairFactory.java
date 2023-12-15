package ru.mirea.lab22.Task2Chairs;

class MultifunctionalChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new MultifunctionalChair();
    }
}
