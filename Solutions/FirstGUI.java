/*Purpose: Create my first ever GUI!
References & sources used:
https://www.youtube.com/watch?v=5o3fMLPY7qY

Additional Reference: https://www.edureka.co/blog/java-jframe/
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstGUI implements ActionListener {
    private int count = 0; //This counts the number of times the button is clicked
    JLabel label;

    public void makeGUI(){

        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);
        button.setSize(5, 5);

        //Practice creating another button
        JButton button2 = new JButton("where am I?");
        button2.setSize(10, 20);

        label = new JLabel("Number of clicks: ");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new FlowLayout()); //new GridLayout(2, 3));
        panel.add(button);
        //panel.add(button2); //to add another button
        panel.add(label);

        //TODO change size of background image.
        //add an image
        ImageIcon icon = new ImageIcon("C:\\Users\\Owner\\Desktop\\Personal\\EducationLearning\\Coding\\Coding" +
                "Challenges\\CodingChallenges\\Solutions\\Images\\space2.jpg");
        JLabel label2 = new JLabel(icon);
        panel.add(label2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First GUI!");
        //frame.pack(); //TODO find out what .pack does: bascially it justs sets the size
        //of the frame so that all its contents are at or above their preferred sizes
        frame.setVisible(true);
    }

    public static void main (String[] args) {
        FirstGUI test1 = new FirstGUI();
        test1.makeGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
