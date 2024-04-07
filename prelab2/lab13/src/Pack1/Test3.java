package Pack1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test3 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100, 100, 450, 500);
        fr.setTitle("Welcome");
        fr.getContentPane().setLayout(null);

        JLabel label1 = new JLabel("Register Data");
        label1.setBounds(140, 10, 100, 50);
        fr.getContentPane().add(label1);

        JLabel label2 = new JLabel("Username : ");
        label2.setBounds(50, 60, 100, 20);
        fr.getContentPane().add(label2);

        JTextField TxT1 = new JTextField();
        TxT1.setBounds(250, 60, 100, 20);
        fr.getContentPane().add(TxT1);

        JLabel label3 = new JLabel("Password : ");
        label3.setBounds(50, 90, 100, 20);
        fr.getContentPane().add(label3);

        JPasswordField TxT2 = new JPasswordField();
        TxT2.setBounds(250, 90, 100, 20);
        fr.getContentPane().add(TxT2);

        JLabel label4 = new JLabel("Confirm Password : ");
        label4.setBounds(50, 120, 150, 20);
        fr.getContentPane().add(label4);

        JPasswordField TxT3 = new JPasswordField();
        TxT3.setBounds(250, 120, 100, 20);
        fr.getContentPane().add(TxT3);

        JLabel label5 = new JLabel("Name : ");
        label5.setBounds(50, 150, 100, 20);
        fr.getContentPane().add(label5);

        JTextField TxT4 = new JTextField();
        TxT4.setBounds(250, 150, 150, 20);
        fr.getContentPane().add(TxT4);

        JLabel label6 = new JLabel("Email : ");
        label6.setBounds(50, 180, 100, 20);
        fr.getContentPane().add(label6);

        JTextField TxT5 = new JTextField();
        TxT5.setBounds(250, 180, 150, 20);
        fr.getContentPane().add(TxT5);

        JButton jb = new JButton("Save");
        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String Pass = String.valueOf(TxT2.getPassword());
                String ConPass = String.valueOf(TxT3.getPassword());

                if(TxT1.getText().isEmpty()){
                    JOptionPane.showMessageDialog(fr, "Please input your username");
                }
                else if(Pass.isEmpty()){
                    JOptionPane.showMessageDialog(fr, "Please input your password");
                }
                else if(ConPass.isEmpty()){
                    JOptionPane.showMessageDialog(fr, "Please confirm your password");
                }
                else if(!Pass.equals(ConPass)){
                    JOptionPane.showMessageDialog(fr, "Password not match!");
                }
                else if(TxT4.getText().isEmpty()){
                    JOptionPane.showMessageDialog(fr, "Please input your name");
                }
                else if(TxT5.getText().isEmpty()){
                    JOptionPane.showMessageDialog(fr, "Please input your email");
                }
                else {
                    Person p = new Person(TxT1.getText(), Pass, TxT4.getText(), TxT5.getText());
                    JOptionPane.showMessageDialog(fr, "Register Data Successfully\n" + p.toString());
                }
            }
        });
        jb.setBounds(140, 240, 80, 20);
        fr.getContentPane().add(jb);
        fr.setVisible(true);
    }
}
