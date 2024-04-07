import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100,100,343,500);
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
        JLabel address = new JLabel("Address");
        address.setBounds(50,105,200,14);
        fr.getContentPane().add(address);

        JTextArea ta = new JTextArea(5, 120);
        ta.setBounds(76, 11, 191, 50);
        fr.getContentPane().add(ta);

        JScrollPane scroll = new JScrollPane(ta);
        scroll.setBounds(120, 110, 130, 50);
        fr.getContentPane().add(scroll);
        //scroll

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
        JLabel label4 = new JLabel("Skills");
        label4.setBounds(50, 200, 200, 14);
        fr.getContentPane().add(label4);

        JCheckBox cb1 = new JCheckBox("C");
        cb1.setBounds(110, 200, 100, 14);
        fr.getContentPane().add(cb1);
        JCheckBox cb2 = new JCheckBox("C++");
        cb2.setBounds(110, 220, 100, 14);
        fr.getContentPane().add(cb2);
        JCheckBox cb3 = new JCheckBox("Java");
        cb3.setBounds(110, 240, 100, 14);
        fr.getContentPane().add(cb3);
        JCheckBox cb4 = new JCheckBox("Python");
        cb4.setBounds(110, 260, 100, 14);
        fr.getContentPane().add(cb4);
        JCheckBox cb5 = new JCheckBox("PHP");
        cb5.setBounds(110, 280, 100, 14);
        fr.getContentPane().add(cb5);
        JCheckBox cb6 = new JCheckBox("R");
        cb6.setBounds(110, 300, 100, 14);
        fr.getContentPane().add(cb6);
        //Skills
        JLabel label5 = new JLabel("Skills");
        label5.setBounds(50, 320, 200, 14);
        fr.getContentPane().add(label5);

        String[] pet = {"High school", "Bachelor", "Master’s Degree", "Ph.D."};
        JComboBox cb = new JComboBox(pet);
        cb.setBounds(110, 320, 100, 20);
        fr.getContentPane().add(cb);

        JButton btn1 = new JButton("OK");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent a) {
                String gender = "";
                if (male.isSelected()){
                    gender = "Male";
                }else if (Female.isSelected()){
                    gender = "Female";
                }
                String skill = "";
                if(cb1.isSelected()){
                    skill += cb1.getText() + " ";
                }
                if (cb2.isSelected()){
                    skill += cb2.getText() + " ";
                }
                if (cb3.isSelected()){
                    skill += cb3.getText() + " ";
                }
                if (cb4.isSelected()){
                    skill += cb4.getText() + " ";
                }
                if (cb5.isSelected()){
                    skill += cb5.getText() + " ";
                }
                if (cb6.isSelected()){
                    skill += cb6.getText() + " ";
                }
                JOptionPane.showMessageDialog(fr,"Your information\n"+
                        "Name : "+txt.getText()+"\n"+
                        "Address :"+ta.getText()+"\n"+
                        "Gender :"+gender+"\n"+
                        "Skill :"+skill+"\n"+
                        "Education :"+cb.getSelectedItem()+"\n");
            }
        });
        btn1.setBounds(129, 430, 85, 23);
        fr.getContentPane().add(btn1);
        //button

        fr.setVisible(true);
    }
}
