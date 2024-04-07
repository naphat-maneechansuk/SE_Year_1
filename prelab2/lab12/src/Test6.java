import javax.swing.*;

public class Test6 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100,100,343,300);
        fr.setTitle("Welcome to Java GUI");
        fr.getContentPane().setLayout(null);

        JLabel label1 = new JLabel("Name:");
        label1.setBounds(50, 50, 200, 14);
        fr.getContentPane().add(label1);

        JTextField txt = new JTextField();
        txt.setBounds(120, 50, 144, 20);
        fr.getContentPane().add(txt);
        //name
        JLabel label2 = new JLabel("Password:");
        label2.setBounds(50, 80, 200, 14);
        fr.getContentPane().add(label2);

        JPasswordField password = new JPasswordField();
        password.setBounds(120, 80, 144, 20);
        String passText = new String(password.getPassword());
        fr.getContentPane().add(password);
        //password
        JTextArea ta = new JTextArea(5, 120);
        ta.setBounds(76, 11, 191, 50);
        fr.getContentPane().add(ta);

        JScrollPane scroll = new JScrollPane(ta);
        scroll.setBounds(120, 110, 130, 50);
        fr.getContentPane().add(scroll);
        //scroll

        JButton btn1 = new JButton("OK");
        btn1.setBounds(129, 230, 85, 23);
        fr.getContentPane().add(btn1);
        //button
        JLabel label3 = new JLabel("Gender");
        label3.setBounds(50, 170, 200, 14);
        fr.getContentPane().add(label3);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(110,170,70,14);
        fr.getContentPane().add(male);
        JRadioButton Female = new JRadioButton("Female");
        Female.setBounds(177,170,70,14);
        fr.getContentPane().add(Female);
        //Gender
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(Female);
        //addgroup
        fr.setVisible(true);
    }

}
