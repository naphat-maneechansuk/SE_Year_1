import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Test2 {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100,100,500,300);
        fr.setTitle("Welcome to Java GUI");
        fr.getContentPane().setLayout(null);
        JLabel label1 = new JLabel("Number1");
        label1.setBounds(50, 30, 100, 14);
        fr.getContentPane().add(label1);

        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 50, 70, 20);
        fr.getContentPane().add(tf1);

        JLabel label2 = new JLabel("Operater");
        label2.setBounds(200, 30, 70, 14);
        fr.getContentPane().add(label2);

        String[] Oper = {"+", "-", "X", "/"};

        JComboBox cb = new JComboBox<>(Oper);
        cb.setBounds(200, 50, 60, 20);
        fr.getContentPane().add(cb);

        JLabel label3 = new JLabel("Number2");
        label3.setBounds(350, 30, 100, 14);
        fr.getContentPane().add(label3);

        JTextField tf2 = new JTextField();
        tf2.setBounds(350, 50, 70, 20);
        fr.getContentPane().add(tf2);
        JButton jb = new JButton("Calculate");
        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jb.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        try {
                            String operater = (String) cb.getSelectedItem();
                            int result = 0;
                            int num1 = Integer.parseInt(tf1.getText());
                            int num2 = Integer.parseInt(tf2.getText());
                            if(operater.equals("+")){
                                result = num1 + num2;
                            }
                            else if(operater.equals("-")){
                                result = num1 - num2;
                            }
                            else if(operater.equals("X")){
                                result = num1 * num2;
                            }
                            else if(operater.equals("/")){
                                if(num2 != 0){
                                    result = num1 / num2;
                                }
                                else {
                                    JOptionPane.showMessageDialog(fr, "Error Division by zero");
                                }
                            }
                            JOptionPane.showMessageDialog(fr, num1 + " " + cb.getSelectedItem() + " " + num2 + " = " + result);
                        }
                        catch(NumberFormatException ex){
                            JOptionPane.showMessageDialog(fr, "Please invalid input");
                        }
                    }
                });
            }
        });
        jb.setBounds(180, 130, 100, 20);
        fr.getContentPane().add(jb);
        fr.setVisible(true);
    }
}