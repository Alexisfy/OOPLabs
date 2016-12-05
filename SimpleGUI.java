import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Сделать заказ");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Количество:");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);
    private JCheckBox check2 = new JCheckBox("Check", false);

    public SimpleGUI() {
        super("Магазин Кофе");
        this.setBounds(200,200,500,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);

        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);
        container.add(check2);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Кнопка нажата\n";
            message += "введенный текст " + input.getText() + "\n";
            message += (radio1.isSelected()?"Radio #1":"Radio #2")
                    + " выбран\n";
            message += "CheckBox  " + ((check.isSelected())
                    ?"выбран":"не выбран");
            JOptionPane.showMessageDialog(null,
                    message,
                    "Ваш Заказ",
                    JOptionPane.PLAIN_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SimpleGUI app = new SimpleGUI();
        app.setVisible(true);
    }
}