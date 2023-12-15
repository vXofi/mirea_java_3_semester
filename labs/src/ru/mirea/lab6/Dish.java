package ru.mirea.lab6;

abstract class Dish {
    String material, color;
    boolean isFragile;
    public Dish(){
        this.material = null;
        this.color = null;
        this.isFragile = false;
    }
    public Dish(String m, String c, boolean f){
        this.material = m;
        this.color = c;
        this.isFragile = f;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFragile(boolean fragile) {
        isFragile = fragile;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "type:" + this.getClass().getSimpleName() + "\nmaterial: " + this.getMaterial() + "\ncolor: " +
                this.getColor() + "\nis fragile:" + this.isFragile;
    }
}
