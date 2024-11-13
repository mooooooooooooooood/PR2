package PR2.tut13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class loginGUI1 {
    // Declare variables
    private static JLabel headingLabel;
    private static JLabel userLabel;
    private static JTextField usernameInputField;
    private static JLabel passwordLabel;
    private static JPasswordField passwordInputField; // Use JPasswordField instead of JTextField
    private static JButton loginButton;
    private static JLabel errorLabel;
    private static JLabel pwerrorLabel;

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Login");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(mainFrame);

        // create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);

        // Create title
        headingLabel = new JLabel("Login Form");
        headingLabel.setBounds(10, 10, 390, 25);
        headingLabel.setHorizontalAlignment(JLabel.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 25));

        // Create User label
        userLabel = new JLabel("User");
        userLabel.setBounds(30, 60, 80, 25);
        userLabel.setFont(new Font("Arial", Font.BOLD, 15));

        // Create username input field
        usernameInputField = new JTextField(30);
        usernameInputField.setBounds(120, 60, 165, 25);

        // Create password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(30, 100, 80, 25);
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));

        // Create password input field
        passwordInputField = new JPasswordField(30);
        passwordInputField.setBounds(120, 100, 165, 25);

        // Create login button
        loginButton = new JButton("Login");
        loginButton.setBounds(120, 140, 80, 25);

        // Create user error label
        errorLabel = new JLabel("");
        errorLabel.setBounds(30, 180, 330, 25);
        errorLabel.setFont(new Font("Arial", Font.BOLD, 16));
        errorLabel.setForeground(Color.RED);

        // Create password error label
        pwerrorLabel = new JLabel("");
        pwerrorLabel.setBounds(30, 210, 330, 25);
        pwerrorLabel.setFont(new Font("Arial", Font.BOLD, 16));
        pwerrorLabel.setForeground(Color.RED);

        // Add components to panel
        mainPanel.add(headingLabel);
        mainPanel.add(userLabel);
        mainPanel.add(usernameInputField);
        mainPanel.add(passwordLabel);
        mainPanel.add(passwordInputField);
        mainPanel.add(errorLabel);
        mainPanel.add(pwerrorLabel);
        mainPanel.add(loginButton);

        // set frame visible
        mainFrame.add(mainPanel);
        mainFrame.setVisible(true);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameInputField.getText();
                if (username.length() < 1) {
                    errorLabel.setText("Username should not be empty!");
                    usernameInputField.requestFocus();
                } else {
                    errorLabel.setText("");
                }

                String password = new String(passwordInputField.getPassword());
                if (password.length() < 8) {
                    pwerrorLabel.setText("Password should not be less than 8 characters!");
                    passwordInputField.requestFocus();
                } else {
                    pwerrorLabel.setText("");
                }
            }
        });
    }
}

