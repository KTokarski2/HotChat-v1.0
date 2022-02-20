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

        int usersRegistered = 0;
        String gender [] = {"Male", "Female"};
        String country [] = {"Poland"};
        JLabel loginLabel = new JLabel("Login");
        JLabel passwordLabel = new JLabel("Password");
        JLabel emailLabel = new JLabel("Email");
        JLabel genderLabel = new JLabel("Gender");
        JLabel cityLabel = new JLabel("City");
        JLabel countryLabel = new JLabel("Country");
        JTextField loginTextField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JTextField emailTextField = new JTextField();
        JTextField cityTextField = new JTextField();
        JComboBox genderComboBox = new JComboBox(gender);
        JComboBox countryComboBox = new JComboBox(country);
        JButton registerButton = new JButton("Register");
        JButton resetButton = new JButton("Reset");
        JButton backToLoginButton = new JButton("Back");
        ImageIcon icon = new ImageIcon("Assets/HotChatIcon.png");

        Container container = getContentPane();

        public RegisterWindow() {
            this.setSize(380,550);
            this.setTitle("Register to HotChat");
            this.setIconImage(icon.getImage());
            this.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            setLayoutManager();
            setLocationAndSize();
            addComponentsToFrame();

        }

        public void setLayoutManager() {
            container.setLayout(null);
        }

        public void setLocationAndSize() {
            loginLabel.setBounds(20,20,40,70);
            passwordLabel.setBounds(20,70,80,70);
            emailLabel.setBounds(20,120,100,70);
            genderLabel.setBounds(20,170,140,70);
            cityLabel.setBounds(20,220,100,70);
            countryLabel.setBounds(20,270,100,70);
            loginTextField.setBounds(180,43,165,23);
            passwordField.setBounds(180,93,165,23);
            emailTextField.setBounds(180,143,165,23);
            genderComboBox.setBounds(180,193,165,23);
            cityTextField.setBounds(180,243,165,23);
            countryComboBox.setBounds(180,293,165,23);
            registerButton.setBounds(70,400,100,35);
            resetButton.setBounds(200,400,100,35);
            backToLoginButton.setBounds(90,460,190,35);
        }

        public void addComponentsToFrame() {
            container.add(loginLabel);
            container.add(passwordLabel);
            container.add(emailLabel);
            container.add(genderLabel);
            container.add(cityLabel);
            container.add(countryLabel);
            container.add(loginTextField);
            container.add(passwordField);
            container.add(emailTextField);
            container.add(genderComboBox);
            container.add(cityTextField);
            container.add(countryComboBox);
            container.add(registerButton);
            container.add(resetButton);
            container.add(backToLoginButton);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class UserWindow extends JFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

    public static class SettingsWindow extends JFrame implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }


}