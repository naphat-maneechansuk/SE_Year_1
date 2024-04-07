import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100,100,343,273);
        fr.setTitle("Welcome to Java GUI");
        fr.getContentPane().setLayout(null);

        JLabel label1 = new JLabel("Name:");
        label1.setBounds(50, 50, 200, 14);
        fr.getContentPane().add(label1);

        JTextField txt = new JTextField();
        txt.setBounds(120, 50, 144, 20);
        fr.getContentPane().add(txt);


        JLabel label2 = new JLabel("Password:");
        label2.setBounds(50, 80, 200, 14);
        fr.getContentPane().add(label2);

        JTextField txt1 = new JTextField();
        txt1.setBounds(120, 80, 144, 20);
        fr.getContentPane().add(txt1);
        fr.setVisible(true);
    }
}
