package calendar;

import Slide.CalendarSlide;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**CalendarChange.java
 *Project 3 Assignment
 * @author Anicka Schouw
 * August 2021
 */

public class CalendarChange extends javax.swing.JPanel {

    private int month, year ;

    public CalendarChange() {
        initComponents();
        thisMonth();
        transition.show(new DayDate(5,2021), CalendarSlide.AnimateType.TO_RIGHT);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        transition = new Slide.CalendarSlide();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Next = new javax.swing.JButton();
        Previous = new javax.swing.JButton();
        LabelMthYr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));

        transition.setBackground(new java.awt.Color(255, 255, 255));

        Next.setText(">>");
        Next.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        Previous.setText("<<");
        Previous.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Previous.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousActionPerformed(evt);
            }
        });

        LabelMthYr.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelMthYr.setForeground(new java.awt.Color(255, 255, 255));
        LabelMthYr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelMthYr.setText("Month - Year");

        jLayeredPane1.setLayer(Next, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Previous, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LabelMthYr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(LabelMthYr, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LabelMthYr)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(63, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(transition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(transition, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {
        if(month == 12){
            month = 1;
            year++;
        }else{
            month++;
        }
        transition.show(new DayDate(month, year),CalendarSlide.AnimateType.TO_LEFT);
        displayMonthYear();
    }

    private void PreviousActionPerformed(java.awt.event.ActionEvent evt) {
        if(month ==1){
            month = 12;
            year --;
        }else{
            month--;
        }
        transition.show(new DayDate(month, year), CalendarSlide.AnimateType.TO_RIGHT);
        displayMonthYear();
    }

    private void thisMonth(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        month = c.get(Calendar.MONTH);
        year = c.get(Calendar.YEAR);
    }

    private void displayMonthYear(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month -1);
        c.set(Calendar.YEAR, year);
        c.set(Calendar.DATE,1);
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM-yyyy");
        LabelMthYr.setText(sdf.format(c.getTime()));
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel LabelMthYr;
    private javax.swing.JButton Next;
    private javax.swing.JButton Previous;
    private javax.swing.JLayeredPane jLayeredPane1;
    private Slide.CalendarSlide transition;
    // End of variables declaration
}

