package chapter11.imageproxy;

import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String, String> cds = new Hashtable<String, String>();
    public static void main (String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();                      //тут как я понимаю мы создаем класс в котором создается
    }                                                                                   //меню кнопки ну и прикрепляются ссылки к ним
    public ImageProxyTestDrive() throws Exception{
        cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");// собственно кнопки с адресами
        cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
        cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
        cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
        cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
        cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
        URL initialURL = new URL((String)cds.get("Selected Ambient Works, Vol. 2")); // тут какимто чудным образом происходит инициализация картинки
                                                                                    // я так понимаю это по умолчанию стоит "Selected Ambient Works, Vol. 2" или что?
        menuBar = new JMenuBar();                                                   //создаем меню
        menu = new JMenu("Favorite CDs");                                        //создаем надпись меню
        menuBar.add(menu);                                                          //добавляем надпись в название меню
        frame.setJMenuBar(menuBar);                                                 //добавляем созданное меню в рамку
        for(Enumeration e = cds.keys(); e.hasMoreElements();) {                     //тут хрен его знает что происходит, но как я предпологаю по ключу(кнопке)
            String name = (String)e.nextElement();                                  //нажатой по URL получается картинка и передается в наши классы
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(event -> {
                imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand()))); // тут посредствам лямбда выражения это происходит, но что тут происходит у меня не получается
                frame.repaint();                                                            //дебажил и getCDUrl возвращает null
            });
        }
// set up frame and menus
        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);

    }
    URL getCDUrl(String name) {
        try {
            return new URL((String)cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
