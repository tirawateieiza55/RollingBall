package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener{

   int x = 100;
   int startAngle = 0;

   public RollingBall(){
      Timer t = new Timer(15, this);
      t.start();
   }

   
   public void paintComponent(Graphics g){
         super.paintComponent(g); //clear  หน้าจอ
        g.drawOval(x, 90, 80, 80);
        g.fillArc(x, 90, 80, 80, startAngle, 180);

    }


   @Override
   public void actionPerformed(ActionEvent e) {
      x -= 2;
      startAngle += 2;
      if (x < -80) x = getWidth();
      if (startAngle == 180) startAngle = 0;
      repaint();
   }


}