package ru.mirea.lab22.Task2Chairs;

class MagicChairFactory extends ChairFactory {
    @Override
    Chair createChair() {
        return new MagicChair();
    }
}
