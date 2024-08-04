import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {

    private static JPanel panel = new JPanel();
    private static JFrame frame= new JFrame();
    private static JLabel userlabel= new JLabel("User");

    private static JTextField text= new JTextField(20);

    private static JLabel passlabel= new JLabel("Password");

    private static JPasswordField pass= new JPasswordField(20);

    private static JButton button= new JButton("Login");

    private static JLabel success= new JLabel("Success");

    private static JPanel panel2= new JPanel();

    public static void main(String[] args) {

        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        userlabel.setBounds(10,20,80,25);
        panel.add(userlabel);

        text.setBounds(100,20, 165 , 25 );
        panel.add(text);

        passlabel.setBounds(10,50,80,25);
        panel.add(passlabel);

        pass.setBounds(100,50,165,25);
        panel.add(pass);

        button.setBounds(100,80,25,25);
        button.addActionListener( new LoginGUI());
        panel.add(button);
        frame.setVisible(true);






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println();

    }
}
