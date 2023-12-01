import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {

    public MyCalculator() {

        var font = new Font("Comic Sans", Font.BOLD, 16);

        var p1 = new JPanel(new GridLayout(4,3,5,5));
        p1.setBackground(Color.blue);
        JButton btn;

        Object[] btnValues = {1,2,3,4,5,6,7,8,9,0,"."};
        for (int i = 0; i < btnValues.length; i++) {
            btn = new JButton(String.valueOf(btnValues[i]));
            btn.setBackground(Color.red);
            btn.setFont(font);
            p1.add(btn);
        }

        var p2 = new JPanel(new GridLayout(4,1,5,5));
        p2.setBackground(Color.blue);
        String[] operations = {"+", "-", "Clear"};
        for( int j = 0; j < operations.length; j++) {
            btn = new JButton(operations[j]);
            btn.setBackground(Color.green);
            btn.setFont(font);
            p2.add(btn);
        }

        var p3 = new JPanel(new GridLayout());
        p3.add(p1,BorderLayout.WEST);
        p3.add(p2,BorderLayout.EAST);

        var p4 = new JPanel(new BorderLayout());
        var textField = new JTextField("45.4");
        textField.setFont(font);
        textField.setBackground(Color.yellow);
        p4.add(textField, BorderLayout.NORTH);
        p4.add(p3,BorderLayout.CENTER);


        add(p4);
    }

    public static void main(String[] args) {

        var example = new MyCalculator();
        example.setTitle("Calculator");
        example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        example.setSize(600,300);
        example.setVisible(true);
    }
}
