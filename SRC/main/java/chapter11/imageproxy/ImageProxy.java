package chapter11.imageproxy;

import java.net.*;
import java.awt.*;
import javax.swing.*;

public class ImageProxy implements Icon {
<<<<<<< HEAD:SRC/main/java/chapter11/imageproxy/ImageProxy.java
=======

>>>>>>> f4c4b140de47ea773cc497ccdad3a88eaf585867:src/main/java/chapter11/imageproxy/ImageProxy.java
    ImageProxy(URL url) { imageURL = url; }

    private volatile ImageIcon imageIcon;
    private final URL imageURL;
    private boolean retrieving = false;

    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x+300, y+190);
            if (!retrieving) {
                retrieving = true;
                Thread retrievalThread = new Thread(() -> {
                    try {
                        setImageIcon(new ImageIcon(imageURL, "CD Cover"));
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }
    }
}
