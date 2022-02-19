import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {


    public static class LoginWindow extends JFrame implements ActionListener {

        Container container = getContentPane();
        JLabel userNameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        JTextField userTextField = new JTextField();
        JPasswordField passwordTextField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton resetButton = new JButton("Reset");
        JCheckBox showPassword = new JCheckBox("Show Password");
        ImageIcon icon = new ImageIcon("Assets/HotChatIcon.png");

        public LoginWindow() {

            this.setTitle("Welcome to HotChat app!");
            this.setVisible(true);
            this.setBounds(10,10,370,600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setIconImage(icon.getImage());
            setLayoutManager();
            setLocationAndSize();
            addComponentsToContainer();
            addActionEvent();

        }

        public void setLayoutManager() {
            container.setLayout(null);
        }

        public void setLocationAndSize() {
            userNameLabel.setBounds(50,150,100,30);
            passwordLabel.setBounds(50,220,100,30);
            userTextField.setBounds(150,150,150,30);
            passwordTextField.setBounds(150,220,150,30);
            showPassword.setBounds(150,250,150,30);
            loginButton.setBounds(50,300,100,30);
            resetButton.setBounds(200,300,100,30);
        }

        public void addComponentsToContainer() {
            container.add(userNameLabel);
            container.add(passwordLabel);
            container.add(userTextField);
            container.add(passwordTextField);
            container.add(showPassword);
            container.add(loginButton);
            container.add(resetButton);
        }

        public void addActionEvent() {
            loginButton.addActionListener(this);
            resetButton.addActionListener(this);
            showPassword.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource() == loginButton) {
                String userText;
                String passwordText;
                userText = userTextField.getText();
                passwordText = passwordTextField.getText();
                if(userText.equalsIgnoreCase("ktokarski") && passwordText.equalsIgnoreCase("123")) {
                    JOptionPane.showMessageDialog(this,"Login Successful!");
                }else {
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
                }
            }

            if(e.getSource() == resetButton) {
                userTextField.setText("");
                passwordTextField.setText("");
            }

            if(e.getSource() == showPassword) {
                if(showPassword.isSelected()) {
                    passwordTextField.setEchoChar((char)0);
                }else {
                    passwordTextField.setEchoChar('*');
                }
            }

        }
    }

    public static class RegisterWindow extends JFrame implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


}