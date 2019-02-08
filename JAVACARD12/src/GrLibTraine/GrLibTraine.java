package GrLibTraine;

import java.awt.*;
import java.awt.event.*;

public class GrLibTraine extends Frame implements WindowListener {

    public void windowOpened(WindowEvent e) {};

    public void windowClosing(WindowEvent e) {
        dispose();
        System.exit(0);
    };

    public void windowClosed(WindowEvent e) {};
    public void windowIconified(WindowEvent e) {};
    public void windowDeiconified(WindowEvent e) {};
    public void windowActivated(WindowEvent e) {};
    public void windowDeactivated(WindowEvent e) {};

    public void paint(Graphics g) {
        Dimension rc = getSize();
        Insets in = getInsets();

        int RH = rc.width;
        int RW = rc.height;

        int minX = in.left;
        int maxX = RH - in.right;
        int minY = in.top;
        int maxY = RW - in.bottom;

        int cx, cy, dx, dy;

        cx = Math.abs(maxX - minX) / 2;
        cy = Math.abs(maxY - minY) / 2;
        dx = maxX / 10;
        dy = maxY / 10;


        g.setColor(new Color(0x000000));
        String txt = "Програмування графічними примітивами: ";
        g.setFont(new Font("Trebuchet Ms", Font.PLAIN, 24));
        int nf = g.getFontMetrics().stringWidth(txt);
       // g.drawString(txt, nf / 2 - 220, nf / 2 - 180);



        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4.0f));


        int a=40;
        int b=80;
        int c=11*20;
        int d=60;

        //g.drawLine();
        g.drawLine(cx-3*dx,cy+4*dy,cx-3*dx+a,cy+4*dy);
        g.drawLine(cx-3*dx,cy+4*dy,cx-3*dx,cy+4*dy-b);
        g.drawLine(cx-3*dx,cy+4*dy-b,cx-3*dx-a,cy+4*dy-b-a);
        g.drawLine(cx-3*dx-a,cy+4*dy-b-a,cx-3*dx-a,cy+4*dy-b-a-c);

        //g.drawLine(cx-3*dx+a,cy+4*dy,);

        g.drawLine(cx-3*dx+a,cy+4*dy,cx-3*dx+a,cy+4*dy-b);
        g.drawLine(cx-3*dx+a,cy+4*dy-b,cx-3*dx+a+a,cy+4*dy-b-a);
        g.drawLine(cx-3*dx+a+a,cy+4*dy-b-a,cx-3*dx+a+a,cy+4*dy-b-a-c);


        g.drawLine(cx-3*dx+a,cy+4*dy-b,cx-3*dx,cy+4*dy-b);

        int ckola = cx-3*dx-a/4;

        g.drawOval(ckola-d/2,cy+4*dy-b-a-c-d/3*2,d*2,d*3/2);

        g.setColor(new Color(0xFFFFFF));
        g.fillRect(cx-3*dx-a+2,cy+4*dy-b-a-c-2,3*a-4,d+5);

        g.setColor(new Color(0x000000));
        g.drawOval(ckola,cy+4*dy-b-a-c,d,d);
        g.drawOval(ckola,cy+4*dy-b-a-c/2+d-5,d,d);
        g.drawOval(ckola,cy+4*dy-b-a-c+c/2-d/2+5/2,d,d);

        //--------------------------------
        g2.setStroke(new BasicStroke(2.0f));

        //g.drawLine();

        g.drawLine(cx-3*dx+a+a+a/2,cy+4*dy,cx-3*dx+a+a+a/2,cy+4*dy-b-a-c);
        g.drawLine(cx-3*dx+a+a,cy+4*dy-b-a,cx-3*dx+3*a,cy+4*dy-b-a);
        g.drawLine(cx-3*dx+a+a,cy+4*dy-b-a-c,cx-3*dx+3*a,cy+4*dy-b-a-c);

        txt = "c";
        g.drawString(txt, ckola+2*d-3,cy);

        g.drawLine(cx-3*dx+3*a,cy+4*dy-b,cx-3*dx,cy+4*dy-b);
        g.drawLine(cx-3*dx+3*a,cy+4*dy,cx-3*dx,cy+4*dy);

        txt = "a";
        g.drawString(txt, ckola+2*d-3,cy+3*dy-a+5);

        txt = "b";
        g.drawString(txt, ckola+2*d-3,cy+4*dy-a+5);

        g.drawLine(cx-3*dx-a,cy+4*dy+a,cx-3*dx-a,cy+4*dy-b-a-c);
        g.drawLine(cx-3*dx,cy+4*dy+a,cx-3*dx,cy+4*dy-b);
        g.drawLine(cx-3*dx+a,cy+4*dy+a,cx-3*dx+a,cy+4*dy-b);

        g.drawLine(cx-3*dx-a,cy+4*dy+a/2,cx-3*dx+a,cy+4*dy+a/2);

        txt = "a";
        g.drawString(txt, cx-3*dx-a+a/4,cy+4*dy+a);
        txt = "a";
        g.drawString(txt, cx-3*dx+a/4,cy+4*dy+a);

        g.drawLine(ckola,cy+4*dy-b-a-c+d/2,ckola+d,cy+4*dy-b-a-c+d/2);
        txt = "d";
        g.drawString(txt, ckola+d/3,cy+4*dy-b-a-c+d/2);







        //--------------------------------
        g.setColor(new Color(0x000000));
        g.setFont(new Font("Trebuchet Ms", Font.PLAIN, 24));

        txt = ", де";
        g.drawString(txt, ckola+2*d+a,cy+4*dy-b-c-d/3*2-a/2);
        txt = "a=2;";
        g.drawString(txt, ckola+2*d+a,cy+4*dy-b-c-d/3*2+5);
        txt = "b=4;";
        g.drawString(txt, ckola+2*d+a,cy+4*dy-b-c-d/3*2+a/2+10);
        txt = "c=11;";
        g.drawString(txt, ckola+2*d+a,cy+4*dy-b-c-d/3*2+a+15);
        txt = "d=3;";
        g.drawString(txt, ckola+2*d+a,cy+4*dy-b-c-d/3*2+a*3/2+20);



    }

    public GrLibTraine() {
        super("Графічні примітиви.");
        addWindowListener(this);
        setLayout(null);
        setLocation(120,100);
        setSize(800,600);
        show();
    }
}