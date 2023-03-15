
import java.awt.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Box;

public class Autobattle {
    static int a1, a2, b1, b2;
    static int score1 = 0;
    static int score2 = 0;
    public static String fightRes1, fightRes2, finalResult;

    public static void main(String[] args) {

        ButtonFrame frame = new ButtonFrame();
        frame.setSize(400, 330);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
    public static void fight() {
        a1 = randomizer();
        a2 = randomizer();
        b1 = randomizer();
        b2 = randomizer();
        fightRes1 = "You have: " + a1 + " " + a2;
        fightRes2 = "Enemy have: " + b1 + " " + b2;
        scores();


    }
    public static void scores() {
        if (a1+a2 > b1+b2) {
            score1+=1;
        }
        else if (a1+a2 < b1+b2) {
            score2+=1;
        }
        else {
            score1 += 0;
            score2 += 0;
        }
        finalResult = "You - " + score1 + " : " + score2 + " - Enemy";
    }
    public static int randomizer() {
        Random random = new Random();
        return random.nextInt(6)+1;
    }

}
class ButtonFrame extends JFrame{

    JLabel labelP1 = new JLabel("You have: 0 0");
    JLabel labelP2 = new JLabel("Enemy have: 0 0");
    JLabel labelScoreTitle = new JLabel("Score:");
    JLabel labelScore = new JLabel("You - " + 0 + " : " + 0 + " - Enemy");
    ButtonFrame(){
        setTitle("BATTLEGROUND");

        Icon icon = new ImageIcon("src/dices.png");
        JButton button = new JButton(icon);
        // додаємо обробник подій, що визначається у внутрішньому класі
        button.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent ae) {
                Autobattle.fight();
                labelP1.setText(Autobattle.fightRes1);
                labelP2.setText(Autobattle.fightRes2);
                labelScore.setText(Autobattle.finalResult);
            }
        });

        setLayout(new FlowLayout());
        Box box = Box.createVerticalBox();

        box.add(Box.createVerticalStrut(20));

        box.add(labelP1);
        box.add(Box.createVerticalGlue());
        box.add(labelP2);
        box.add(Box.createVerticalStrut(20));

        box.add(labelScoreTitle);
        box.add(labelScore);
        box.add(Box.createVerticalStrut(30));

        box.add(button);
        box.add(Box.createVerticalStrut(20));
        add(box);
    }
}
