package ru.mirea.lab20;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Keys extends JPanel {

    private List<JButton> buttons = new LinkedList<>();

    /***
     * Create and place a button for each function and digit.
     */
    public Keys(){
        String[] buttonMainStr = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "C", "+",
                "Enter"};

        Font ftIco = new Font("Arial", Font.PLAIN, 24);  // Font for buttons with a single char.
        Font ftText = new Font("Arial", Font.PLAIN, 20); // Font the other buttons.
        this.setPreferredSize(new Dimension(405, 350));
        this.setOpaque(false); // To get the same color as the element behind.
        this.setLayout(new GridLayout(5, 4, 5, 5));

        for(String str: buttonMainStr){
            JButton butt = new JButton(str);
            if (butt.getText().equals("Enter")) {
                // Set the width of the "Enter" button to span 4 columns
                this.add(butt, new GridLayout(1, 4));
                buttons.add(butt);
            } else{
                    butt.setFont(str.length() == 1 ? ftIco : ftText);
                    this.add(butt);
                    buttons.add(butt);
                }
        }
    }

    /***
     * Return the list of all buttons of the keyboard.
     * @return The List of all button.
     */
    public List<JButton> getButtons() {
        return buttons;
    }
}
