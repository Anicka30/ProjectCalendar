package calendar;

/**DayDate.java
 *Project 3 Assignment
 * @author Anicka Schouw
 * August 2021
 */

import java.awt.Component;
import java.util.Calendar;

public class DayDate extends javax.swing.JLayeredPane {

    private int month,year;

    public DayDate(int month,int year) {
        initComponents();
        this.month = month;
        this.year = year;
        init();
    }
    private void init(){
        mon.asDay();
        tue.asDay();
        wed.asDay();
        thu.asDay();
        fri.asDay();
        sat.asDay();
        sun.asDay();
        setDate();
    }

    private void setDate(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,year);
        c.set(Calendar.MONTH,month -1); //January as 0 therefore start from 0
        c.set(Calendar.DATE, 1);
        int beginDay = c.get(Calendar.DAY_OF_WEEK) -1; // -1 is to index, get day of the week.
        c.add(Calendar.DATE, -beginDay);
        for(Component com : getComponents()){
            Blocks b = (Blocks) com;
            if(!b.isDay()){
                b.setText(c.get(Calendar.DATE)+ "");
                b.setDate(c.getTime());
                b.currentMonth(c.get(Calendar.MONTH) == month - 1);
                c.add(Calendar.DATE, 1);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        sun = new calendar.Blocks();
        mon = new calendar.Blocks();
        tue = new calendar.Blocks();
        wed = new calendar.Blocks();
        thu = new calendar.Blocks();
        fri = new calendar.Blocks();
        sat = new calendar.Blocks();
        blocks8 = new calendar.Blocks();
        blocks9 = new calendar.Blocks();
        blocks10 = new calendar.Blocks();
        blocks11 = new calendar.Blocks();
        blocks12 = new calendar.Blocks();
        blocks13 = new calendar.Blocks();
        blocks14 = new calendar.Blocks();
        blocks15 = new calendar.Blocks();
        blocks16 = new calendar.Blocks();
        blocks17 = new calendar.Blocks();
        blocks18 = new calendar.Blocks();
        blocks19 = new calendar.Blocks();
        blocks20 = new calendar.Blocks();
        blocks21 = new calendar.Blocks();
        blocks22 = new calendar.Blocks();
        blocks23 = new calendar.Blocks();
        blocks24 = new calendar.Blocks();
        blocks25 = new calendar.Blocks();
        blocks26 = new calendar.Blocks();
        blocks27 = new calendar.Blocks();
        blocks28 = new calendar.Blocks();
        blocks29 = new calendar.Blocks();
        blocks30 = new calendar.Blocks();
        blocks31 = new calendar.Blocks();
        blocks32 = new calendar.Blocks();
        blocks33 = new calendar.Blocks();
        blocks34 = new calendar.Blocks();
        blocks35 = new calendar.Blocks();
        blocks36 = new calendar.Blocks();
        blocks37 = new calendar.Blocks();
        blocks38 = new calendar.Blocks();
        blocks39 = new calendar.Blocks();
        blocks40 = new calendar.Blocks();
        blocks41 = new calendar.Blocks();
        blocks42 = new calendar.Blocks();
        blocks43 = new calendar.Blocks();
        blocks44 = new calendar.Blocks();
        blocks45 = new calendar.Blocks();
        blocks46 = new calendar.Blocks();
        blocks47 = new calendar.Blocks();
        blocks48 = new calendar.Blocks();
        blocks49 = new calendar.Blocks();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setBackground(new java.awt.Color(255, 255, 255));
        sun.setForeground(new java.awt.Color(255, 0, 0));
        sun.setText("Sunday");
        sun.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(sun);

        mon.setBackground(new java.awt.Color(255, 255, 255));
        mon.setText("Monday");
        mon.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(mon);

        tue.setBackground(new java.awt.Color(255, 255, 255));
        tue.setText("Tuesday");
        tue.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(tue);

        wed.setBackground(new java.awt.Color(255, 255, 255));
        wed.setText("Wednesday");
        wed.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(wed);

        thu.setBackground(new java.awt.Color(255, 255, 255));
        thu.setText("Thursday");
        thu.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(thu);

        fri.setBackground(new java.awt.Color(255, 255, 255));
        fri.setText("Friday");
        fri.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(fri);

        sat.setBackground(new java.awt.Color(255, 255, 255));
        sat.setForeground(new java.awt.Color(255, 0, 0));
        sat.setText("Saturday");
        sat.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(sat);

        blocks8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks8);

        blocks9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks9);

        blocks10.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks10);

        blocks11.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks11);

        blocks12.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks12);

        blocks13.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks13);

        blocks14.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks14);

        blocks15.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks15);

        blocks16.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks16);

        blocks17.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks17);

        blocks18.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks18);

        blocks19.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks19);

        blocks20.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks20);

        blocks21.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks21);

        blocks22.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks22);

        blocks23.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks23);

        blocks24.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks24);

        blocks25.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks25);

        blocks26.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks26);

        blocks27.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks27);

        blocks28.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks28);

        blocks29.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks29);

        blocks30.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks30);

        blocks31.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks31);

        blocks32.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks32);

        blocks33.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks33);

        blocks34.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks34);

        blocks35.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks35);

        blocks36.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks36);

        blocks37.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks37);

        blocks38.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks38);

        blocks39.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks39);

        blocks40.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks40);

        blocks41.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks41);

        blocks42.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks42);

        blocks43.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks43);

        blocks44.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks44);

        blocks45.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks45);

        blocks46.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks46);

        blocks47.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks47);

        blocks48.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks48);

        blocks49.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 12)); // NOI18N
        add(blocks49);
    }// </editor-fold>
    /**/

    // Variables declaration - do not modify
    private calendar.Blocks blocks10;
    private calendar.Blocks blocks11;
    private calendar.Blocks blocks12;
    private calendar.Blocks blocks13;
    private calendar.Blocks blocks14;
    private calendar.Blocks blocks15;
    private calendar.Blocks blocks16;
    private calendar.Blocks blocks17;
    private calendar.Blocks blocks18;
    private calendar.Blocks blocks19;
    private calendar.Blocks blocks20;
    private calendar.Blocks blocks21;
    private calendar.Blocks blocks22;
    private calendar.Blocks blocks23;
    private calendar.Blocks blocks24;
    private calendar.Blocks blocks25;
    private calendar.Blocks blocks26;
    private calendar.Blocks blocks27;
    private calendar.Blocks blocks28;
    private calendar.Blocks blocks29;
    private calendar.Blocks blocks30;
    private calendar.Blocks blocks31;
    private calendar.Blocks blocks32;
    private calendar.Blocks blocks33;
    private calendar.Blocks blocks34;
    private calendar.Blocks blocks35;
    private calendar.Blocks blocks36;
    private calendar.Blocks blocks37;
    private calendar.Blocks blocks38;
    private calendar.Blocks blocks39;
    private calendar.Blocks blocks40;
    private calendar.Blocks blocks41;
    private calendar.Blocks blocks42;
    private calendar.Blocks blocks43;
    private calendar.Blocks blocks44;
    private calendar.Blocks blocks45;
    private calendar.Blocks blocks46;
    private calendar.Blocks blocks47;
    private calendar.Blocks blocks48;
    private calendar.Blocks blocks49;
    private calendar.Blocks blocks8;
    private calendar.Blocks blocks9;
    private calendar.Blocks fri;
    private calendar.Blocks mon;
    private calendar.Blocks sat;
    private calendar.Blocks sun;
    private calendar.Blocks thu;
    private calendar.Blocks tue;
    private calendar.Blocks wed;
    // End of variables declaration
}

