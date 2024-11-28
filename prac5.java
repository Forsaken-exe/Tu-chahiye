import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prac5 extends JFrame {
    private JLabel nameLabel, addressLabel, phoneLabel, emailLabel, educationLabel;
    private JTextField nameField, phoneField, emailField;
    private JTextArea addressArea, educationArea;
    private JButton submitButton, resetButton;

    public prac5() {
        setTitle("Student Resume Form");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(10, 2, 5, 5));

        // Initialize components
        nameLabel = new JLabel("Name:");
        addressLabel = new JLabel("Address:");
        phoneLabel = new JLabel("Phone:");
        emailLabel = new JLabel("Email:");
        educationLabel = new JLabel("Education:");

        nameField = new JTextField();
        phoneField = new JTextField();
        emailField = new JTextField();
        addressArea = new JTextArea(3, 20); 
        educationArea = new JTextArea(3, 20);

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");

        // Add components to the frame
        add(nameLabel);
        add(nameField);

        add(addressLabel);
        add(new JScrollPane(addressArea));

        add(phoneLabel);
        add(phoneField);

        add(emailLabel);
        add(emailField);

        add(educationLabel);
        add(new JScrollPane(educationArea));

        add(submitButton);
        add(resetButton);

        // Add action listeners
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Resume submitted successfully!");
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                addressArea.setText("");
                phoneField.setText("");
                emailField.setText("");
                educationArea.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new prac5();
    }
}