package calendar;

/**Blocks.java
 * Project 3 Assignment
 * @author Anicka Schouw
 * August 2021
 */

import java.awt.*;
import java.util.Date;
import javax.swing.*;


public class Blocks extends JButton {

    private Date date;
    private boolean day;

    public Blocks(){
        setContentAreaFilled(false);
        setBorder(null);
        setHorizontalAlignment(JLabel.CENTER);
    }
    public void asDay(){
        day = true;
    }

    public boolean isDay(){
        return day;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void currentMonth(boolean act){
        if(act){
            setForeground(new Color(75,75,75));
        } else {
            setForeground(new Color(170,170,170));
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        if(day){
            g.setColor(new Color(212,212,212));
            g.drawLine(0, getHeight()-1, getWidth(), getHeight()-1);
        }
        super.paintComponent(g);
    }

}
