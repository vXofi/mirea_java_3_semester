package ru.mirea.lab22.Task2Chairs;

class UniversalChairFactory extends ChairFactory {
    @Override
    public VictorianChair createVictorianChair(){ return new VictorianChair(); }

    @Override
    public MagicChair createMagicChair(){ return new MagicChair(); }

    @Override
    public MultifunctionalChair createMultifunctionalChair(){ return new MultifunctionalChair(); }

}
