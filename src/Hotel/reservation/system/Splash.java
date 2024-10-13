package Hotel.reservation.system;


import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,680,700);
        add(label);

        setLayout(null);
        setLocation(350,20);
        setSize(600,700);
        setVisible(true);

        try {
            Thread.sleep(5000);
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
