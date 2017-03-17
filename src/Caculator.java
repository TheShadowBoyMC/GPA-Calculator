import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Caculator {
    public static void main(String args[]) {
        JPanel panel = new JPanel(new GridLayout(8, 2));

        JTextField firstnumber = new JTextField(20);
        JTextField secondnumber = new JTextField(20);
        JTextField thirdnumber = new JTextField(20);
        JTextField fourthnumber = new JTextField(20);
        JTextField fifthnumber = new JTextField(20);
        JTextField sixthnumber = new JTextField(20);
        JTextField seventhnumber = new JTextField(20);
        JTextField eighthnumber = new JTextField(20);

        panel.add(new JLabel("First Grade"));
        panel.add(new JLabel("Second Grade"));
        panel.add(firstnumber);
        panel.add(secondnumber);
        panel.add(new JLabel("Third Grade"));
        panel.add(new JLabel("Fourth Grade"));
        panel.add(thirdnumber);
        panel.add(fourthnumber);
        panel.add(new JLabel("Fifth Grade"));
        panel.add(new JLabel("Sixth Grade"));
        panel.add(fifthnumber);
        panel.add(sixthnumber);
        panel.add(new JLabel("Seventh Grade"));
        panel.add(new JLabel("Eighth Grade"));
        panel.add(seventhnumber);
        panel.add(eighthnumber);

        int result = JOptionPane.showConfirmDialog(null, panel, "Quesion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        double total = 0;
        if (result == JOptionPane.OK_OPTION) {
            total += getPoints(firstnumber.getText());

            total += getPoints(firstnumber.getText());

            total += getPoints(thirdnumber.getText());

            total += getPoints(fourthnumber.getText());

            total += getPoints(fifthnumber.getText());

            total += getPoints(sixthnumber.getText());

            total += getPoints(seventhnumber.getText());

            total += getPoints(eighthnumber.getText());

            JTextField GPA = new JTextField(20);

            JPanel panel1 = new JPanel(new GridLayout(2, 2));
            panel1.add(new JLabel("Your GPA is: "));
            panel1.add(GPA);

            double gpa = total / 8;
            GPA.setText(String.valueOf(gpa));

            JOptionPane.showMessageDialog(null, panel1);
        }
    }

    static double getPoints(String grade) {
        double points = 0;
        if (grade.equals("A+")) {
            points = 4.4;
        } else if (grade.equals("A")) {
            points = 4.0;
        } else if (grade.equals("A-")) {
            points = 3.7;
        } else if (grade.equals("B+")) {
            points = 3.4;
        } else if (grade.equals("B")) {
            points = 3.0;
        } else if (grade.equals("B-")) {
            points = 2.7;
        } else if (grade.equals("C+")) {
            points = 2.4;
        } else if (grade.equals("C")) {
            points = 2.0;
        } else if (grade.equals("C-")) {
            points = 1.7;
        } else if (grade.equals("F")) {
            points = 0;
        }
        return points;
    }
}
