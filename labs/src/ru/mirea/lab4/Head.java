package ru.mirea.lab4;

public class Head {
    private String hairC, eyeC;
    private Boolean hasBeard;

    public Head (String hc, String ec, Boolean hb){
        this.hairC = hc;
        this.eyeC = ec;
        this.hasBeard = hb;
    }


    public Boolean getHasBeard() {
        return hasBeard;
    }

    public String getEyeC() {
        return eyeC;
    }

    public String getHairC() {
        return hairC;
    }

    public void setEyeC(String eyeC) {
        this.eyeC = eyeC;
    }

    public void setHairC(String hairC) {
        this.hairC = hairC;
    }

    public void setHasBeard(Boolean hasBeard) {
        this.hasBeard = hasBeard;
    }
    public String toString(){
        return "eye color: " + this.eyeC + "\nhair color: " + this.hairC + "\nhas beard: " + (this.hasBeard ? "yes\n" : "no\n");
    }
}
