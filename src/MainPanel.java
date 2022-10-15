import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JFrame {
    private JPanel mainPanel;
    private JLabel nameLbl;
    private JTextField nameInput;
    private JTextField ageInput;
    private JLabel ageLbl;
    private JLabel printPersonDetailsLbl;
    private JButton createPersonBtn;
    private JTextField heightInput;
    private JTextField weightInput;
    private JTextField emailInput;
    private JLabel heightLbl;
    private JLabel weightLbl;
    private JLabel emailLbl;
    private JLabel surnameLbl;
    private JTextField surnameInput;
    private JButton heightInInchesButton;
    private JLabel heightInIncLbl;

    public MainPanel(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(550,450);
        this.setLocationRelativeTo(null);

        createPersonBtn.addActionListener(e -> {
            String name = nameInput.getText();
            String surname = surnameInput.getText();
            int age = Integer.parseInt(ageInput.getText());
            float height = Float.parseFloat(heightInput.getText());
            float weight = Float.parseFloat(weightInput.getText());
            String email = emailInput.getText();


//            Person addPerson = new Person(name, surname, age, height, weight, email);

            PersonHandler newPerson = new PersonHandler(name, surname, age, height, weight, email);
//            createPerson.setText(newPerson.createPerson()); // no need.
//            printPersonDetailsLbl.setText(addPerson.toString());
            printPersonDetailsLbl.setText(newPerson.createPerson());

        });

        heightInInchesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameInput.getText();
                String surname = surnameInput.getText();
                int age = Integer.parseInt(ageInput.getText());
                float height = Float.parseFloat(heightInput.getText());
                float weight = Float.parseFloat(weightInput.getText());
                String email = emailInput.getText();

                PersonHandler newPerson = new PersonHandler(name, surname, age, height, weight, email);
                Person _newPerson = new Person(name, surname, age, height, weight, email);
                heightInIncLbl.Text(newPerson.getHeightInches(_newPerson));
            }
        });

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
