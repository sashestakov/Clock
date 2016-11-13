package ssa.lessons.clock;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;


public class ClockWindow extends JFrame {

//    private static ClockWindow clockWindow;

    //    private static boolean show_title=false;

     ClockWindow(){
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         //this.setSize(100,50);
//         this.setUndecorated(true);
         this.setResizable(false);
         this.setAlwaysOnTop(true);

         JLabel labelTime = new JLabel(""+new Time(System.currentTimeMillis()));
         labelTime.setHorizontalAlignment(SwingConstants.CENTER);
         labelTime.setVerticalTextPosition(SwingConstants.CENTER);
         //labelTime.setForeground();

         Timer timer = new Timer(1000, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 labelTime.setText(""+new Time(System.currentTimeMillis()));
             }
         });

         this.add(labelTime);
         this.setLocation(800,0);


//         this.setLocationRelativeTo(null);
         this.setVisible(true);
         this.pack();
         timer.start();

    }


    public static void main(String[] args) {
	// write your code here
        new ClockWindow();
    }
}
