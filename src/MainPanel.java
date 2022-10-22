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
    private JTextField strenInput;
    private JLabel strenLbl;
    private JRadioButton dbRadioB;
    private JRadioButton fileRadioB;
    private JLabel persistanceLbl;
    private JButton savePersonB;
//    private ButtonGroup rBGroup = new ButtonGroup();

    public MainPanel(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setSize(600,550);
        this.setLocationRelativeTo(null);

        createPersonBtn.addActionListener(e -> {
            String name = nameInput.getText();
            String surname = surnameInput.getText();
            int age = Integer.parseInt(ageInput.getText());
            float height = Float.parseFloat(heightInput.getText());
            float weight = Float.parseFloat(weightInput.getText());
            String email = emailInput.getText();
            int strength = Integer.parseInt(strenInput.getText());

//            Person addPerson = new Person(name, surname, age, height, weight, email);

            PersonHandler newPerson = new PersonHandler(name, surname, age, height, weight, email, strength);
//            createPerson.setText(newPerson.createPerson()); // no need.
//            printPersonDetailsLbl.setText(addPerson.toString());
            Person _newPerson2 = new Person(name, surname, age, height, weight, email, strength);
            printPersonDetailsLbl.setText(newPerson.createPerson());

        });
        savePersonB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameInput.getText();
                String surname = surnameInput.getText();
                int age = Integer.parseInt(ageInput.getText());
                float height = Float.parseFloat(heightInput.getText());
                float weight = Float.parseFloat(weightInput.getText());
                String email = emailInput.getText();
//                String password = new String();
                int strength = Integer.parseInt(strenInput.getText());

                PersonHandler newPerson = new PersonHandler(name, surname, age, height, weight, email, strength);
                var s = newPerson.createPerson();
                if (dbRadioB.isSelected()) {
                        Persistence persistencedb = Persistence.Companion.createDBPersistence();
                        persistencedb.save(s);
                } else {
                    Persistence persistencefile = Persistence.Companion.createFilePersistence();
                    persistencefile.save(s);
                }

            }
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
//                String password = new String();
                int strength = Integer.parseInt(strenInput.getText());

                PersonHandler newPerson = new PersonHandler(name, surname, age, height, weight, email, strength);
                heightInIncLbl.setText(String.valueOf(newPerson.getHeightInInches()));
//                PersonHandler newPerson = new PersonHandler(name, surname, age, height, weight, email, strength);
//                Person _newPerson = new Person(name, surname, age, height, weight, email, strength);
//                heightInIncLbl.setText(String.valueOf(newPerson.getHeightInInches(_newPerson)));


            }

        });

    }
    // TODO: Point 7.d Deocoupling the GUI from the Persistence Classes.
    // TODO: DoubleCheck 8.


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
