/*Purpose: Create my first ever GUI!
References & sources used:
https://www.youtube.com/watch?v=5o3fMLPY7qY

Additional Reference: https://www.edureka.co/blog/java-jframe/
Notes:
-The video walks you through step by step, but some of the items are not explained what
they are or how they work (for example the difference between a panel and a frame). However, these
topics are probably covered in a google search.
-It does cover an intro to Action Listeners which is a nice bonus!
-The ActionListener interface and overriding actionPerformed method aren't covered (bit of magic here)
-Overall great video to learn how to make your fist GUI.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class FirstGUI implements ActionListener {
    private int count = 0; //This counts the number of times the button is clicked
    private JLabel label;

    public FirstGUI() throws IOException {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this);
        button.setSize(5, 5);

        JButton button2 = new JButton("where am I?");
        button2.setSize(10, 20);

        label = new JLabel("Number of clicks: ");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new FlowLayout()); //new GridLayout(2, 3));
        panel.add(button);
        //panel.add(button2); //to add another button
        panel.add(label);

        //TODO add background image to the panel and change size of frame so that the button is on top of the image.
        //add an image
        ImageIcon icon = new ImageIcon("C:\\Users\\Owner\\Desktop\\Personal\\EducationLearning\\Coding\\CodingChallenges\\CodingChallenges\\Solutions\\Images\\space2.jpg");
        JLabel label2 = new JLabel(icon);
        panel.add(label2);


        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(1200, 800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My First GUI!");
        //frame.pack(); //TODO find out .pack does
        frame.setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        new FirstGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
