package ru.mirea.lab22.Task2Chairs;

abstract class ChairFactory {
    abstract VictorianChair createVictorianChair();
    abstract MagicChair createMagicChair();
    abstract MultifunctionalChair createMultifunctionalChair();
}
