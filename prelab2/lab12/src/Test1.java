import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100,100,343,273);
        fr.setTitle("Welcome to Java GUI");
        fr.getContentPane().setLayout(null);

        JLabel label1 = new JLabel("My name is Earth.");
        label1.setBounds(50, 50, 200, 14);
        fr.getContentPane().add(label1);

        JLabel label2 = new JLabel("I like is banana.");
        label2.setBounds(50,70,200,14);
        fr.getContentPane().add(label2);
        fr.setVisible(true);
    }
}
