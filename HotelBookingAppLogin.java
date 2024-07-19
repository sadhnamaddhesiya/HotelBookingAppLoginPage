import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelBookingAppLogin extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JCheckBox rememberMeCheckbox;
    private JLabel errorLabel;

    public HotelBookingAppLogin() {
        setTitle("Hotel Booking App - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Center the window

        // Initialize components
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        rememberMeCheckbox = new JCheckBox("Remember Me");
        errorLabel = new JLabel("", JLabel.CENTER);

        // Layout setup
        setLayout(new BorderLayout());
        JPanel loginPanel = new JPanel(new GridLayout(4, 1));
        JPanel buttonPanel = new JPanel();

        // Add components to login panel
        loginPanel.add(new JLabel("Username/Email:"));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(rememberMeCheckbox);

        // Forgot Password link
        JLabel forgotPasswordLabel = new JLabel("<html><u>Forgot Password?</u></html>");
        forgotPasswordLabel.setForeground(Color.BLUE.darker());
        forgotPasswordLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        forgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Implement forgot password logic here (e.g., open a dialog)
                JOptionPane.showMessageDialog(HotelBookingAppLogin.this, "Forgot Password functionality coming soon!");
            }
        });
        loginPanel.add(forgotPasswordLabel);

        // New User Registration link
        JLabel registerLabel = new JLabel("<html><u>New User? Register here</u></html>");
        registerLabel.setForeground(Color.BLUE.darker());
        registerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        registerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                // Implement registration redirection logic here
                JOptionPane.showMessageDialog(HotelBookingAppLogin.this, "Redirecting to registration page!");
                // Replace with actual registration window open logic
            }
        });
        loginPanel.add(registerLabel);

        // Add components to button panel
        buttonPanel.add(loginButton);

        // Add panels to frame
        add(loginPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(errorLabel, BorderLayout.NORTH);

        // Action listeners
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword());

                // Validate username and password (mock implementation)
                if (isValidLogin(username, password)) {
                    // Redirect to main dashboard (mock implementation)
                    JOptionPane.showMessageDialog(HotelBookingAppLogin.this, "Login successful!");
                    // Replace with actual dashboard display logic
                    // dispose(); // Close login window
                } else {
                    errorLabel.setText("Invalid username/password. Please try again.");
                }
            }
        });

        setVisible(true);
    }

    // Mock validation method - replace with actual authentication logic
    private boolean isValidLogin(String username, String password) {
        // Replace with actual authentication logic
        return username.equals("admin") && password.equals("admin");
    }

    public static void main(String[] args) {
        new HotelBookingAppLogin();
    }
}
