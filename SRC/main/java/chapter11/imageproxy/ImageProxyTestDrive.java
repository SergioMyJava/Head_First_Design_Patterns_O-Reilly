package chapter11.imageproxy;

import java.net.*;
import javax.swing.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ImageProxyTestDrive {
    private ImageComponent imageComponent;
    private JFrame frame = new JFrame("CD Cover Viewer");
    private ConcurrentMap<String, String> cds = new ConcurrentHashMap<>();

    public static void main (String[] args) throws Exception {
        new ImageProxyTestDrive();
    }

    private ImageProxyTestDrive() throws Exception{
        cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
        cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
        URL initialURL = new URL(cds.get("Selected Ambient Works, Vol. 2"));

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (String name: cds.keySet()) {
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                frame.repaint();
            });
        }

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

    }

    private URL getCDUrl(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
