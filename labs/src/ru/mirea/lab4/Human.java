package ru.mirea.lab4;

import java.util.Scanner;

public class Human {
    //limbs[0] - head
    //limbs[1] and limbs[2] - left and right arms respectively
    //limbs[3] and limbs[4] - left and right legs respectively
    private Object[] limbs = new Object[5];

    public Human(){
        Scanner sc = new Scanner(System.in);
        int input;
        String choice;
        while(true) {
            System.out.println("""
                    Input:\s
                     0 to save body composition\s
                     1 to input a head (1 max)\s
                     2 to input an arm (2 max)\s
                     3 to input a leg (2 max)""");
            while (!sc.hasNextInt()) {
                System.out.println("only type integer is supported");
                sc.next();
            }

            input = sc.nextInt();
            sc.nextLine();

            switch (input) {
                case (0):
                    break;
                case (1):
                    String hc, ec;
                    boolean hb;
                    System.out.println("input eye color:\n");
                    ec = sc.nextLine();
                    System.out.println("input hair color:\n");
                    hc = sc.nextLine();
                    System.out.println("does head have a beard (t/f):\n");
                    hb = sc.nextLine().equals("t");
                    limbs[0] = new Head(hc, ec, hb);
                    continue;
                case (2):
                    System.out.println("is arm right or left (r/l):\n");
                    choice = sc.nextLine();
                    if (choice.equals("l")){
                        limbs[1] = new Arm(true);
                    }
                    else{limbs[2] = new Arm(false);}
                    continue;
                case (3):
                    System.out.println("is leg right or left (r/l):\n");
                    choice = sc.nextLine();
                    if (choice.equals("l")){
                        limbs[3] = new Leg(true);
                    }
                    else{limbs[4] = new Leg(false);}
                    continue;
                default:
                    System.out.println("unsupported command code");
                    break;
            }
            break;
        }
    }
    public Human(Head h, Arm a1, Arm a2, Leg l1, Leg l2){
        limbs[0] = h;
        limbs[1] = a1;
        limbs[2] = a2;
        limbs[3] = l1;
        limbs[4] = l2;
    }

    public Head getHead(){
        if (limbs[0] != null){
            return (Head) limbs[0];
        }
        else{
            System.out.println("limb is not present");
            return null;
        }
    }
    public Arm getLeftArm(){
        if (limbs[0] != null){
            return (Arm) limbs[1];
        }
        else{
            System.out.println("limb is not present");
            return null;
        }
    }
    public Arm getRightArm(){
        if (limbs[0] != null){
            return (Arm) limbs[2];
        }
        else{
            System.out.println("limb is not present");
            return null;
        }
    }
    public Leg getLeftLeg(){
        if (limbs[0] != null){
            return (Leg) limbs[3];
        }
        else{
            System.out.println("limb is not present");
            return null;
        }
    }
    public Leg getRightLeg(){
        if (limbs[0] != null){
            return (Leg) limbs[4];
        }
        else{
            System.out.println("limb is not present");
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (var l : limbs){
            if (l != null) {
                out.append(l.toString());
            }
        }
        return "Your human composition:\n" + out.toString();
    }
}
