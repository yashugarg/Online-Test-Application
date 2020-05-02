import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener {
    JLabel l;
    JRadioButton but[] = new JRadioButton[5];
    JButton b1, b2;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    OnlineTest(String s) {
        super(s);
        l = new JLabel();
        add(l);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            but[i] = new JRadioButton();
            add(but[i]);
            bg.add(but[i]);
        }
        b1 = new JButton("Next");
        b2 = new JButton("Bookmark");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        set();
        l.setBounds(30, 40, 450, 20);
        but[0].setBounds(50, 80, 100, 20);
        but[1].setBounds(50, 110, 100, 20);
        but[2].setBounds(50, 140, 100, 20);
        but[3].setBounds(50, 170, 100, 20);
        b1.setBounds(100, 240, 100, 30);
        b2.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (check())
                count = count + 1;
            current++;
            set();
            if (current == 9) {
                b1.setEnabled(false);
                b2.setText("Result");
            }
        }
        if (e.getActionCommand().equals("Bookmark")) {
            JButton bk = new JButton("Bookmark" + x);
            bk.setBounds(480, 20 + 30 * x, 100, 30);
            add(bk);
            bk.addActionListener(this);
            m[x] = current;
            x++;
            current++;
            set();
            if (current == 9)
                b2.setText("Result");
            setVisible(false);
            setVisible(true);
        }
        for (int i = 0, y = 1; i < x; i++, y++) {
            if (e.getActionCommand().equals("Bookmark" + y)) {
                if (check())
                    count = count + 1;
                now = current;
                current = m[y];
                set();
                ((JButton) e.getSource()).setEnabled(false);
                current = now;
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            current++;
            JOptionPane.showMessageDialog(this, "correct ans=" + count);
            System.exit(0);
        }
    }

    void set() {
        but[4].setSelected(true);
        if (current == 0) {
            l.setText("Que1: Which one among these is not a primitive datatype?");
            but[0].setText("int");
            but[1].setText("Float");
            but[2].setText("boolean");
            but[3].setText("char");
        }
        if (current == 1) {
            l.setText("Que2: Which class is available to all the class automatically?");
            but[0].setText("Swing");
            but[1].setText("Applet");
            but[2].setText("Object");
            but[3].setText("ActionEvent");
        }
        if (current == 2) {
            l.setText("Que3: Which package is directly available to our class without importing it?");
            but[0].setText("swing");
            but[1].setText("applet");
            but[2].setText("net");
            but[3].setText("lang");
        }
        if (current == 3) {
            l.setText("Que4: String class is defined in which package?");
            but[0].setText("lang");
            but[1].setText("Swing");
            but[2].setText("Applet");
            but[3].setText("awt");
        }
        if (current == 4) {
            l.setText("Que5: Which institute is best for java coaching?");
            but[0].setText("Utek");
            but[1].setText("Aptech");
            but[2].setText("SSS IT");
            but[3].setText("jtek");
        }
        if (current == 5) {
            l.setText("Que6: Which one among these is not a keyword?");
            but[0].setText("class");
            but[1].setText("int");
            but[2].setText("get");
            but[3].setText("if");
        }
        if (current == 6) {
            l.setText("Que7: Which one among these is not a class? ");
            but[0].setText("Swing");
            but[1].setText("Actionperformed");
            but[2].setText("ActionEvent");
            but[3].setText("Button");
        }
        if (current == 7) {
            l.setText("Que8: which one among these is not a function of Object class?");
            but[0].setText("toString");
            but[1].setText("finalize");
            but[2].setText("equals");
            but[3].setText("getDocumentBase");
        }
        if (current == 8) {
            l.setText("Que9: which function is not present in Applet class?");
            but[0].setText("init");
            but[1].setText("main");
            but[2].setText("start");
            but[3].setText("destroy");
        }
        if (current == 9) {
            l.setText("Que10: Which one among these is not a valid component?");
            but[0].setText("JButton");
            but[1].setText("JList");
            but[2].setText("JButtonGroup");
            but[3].setText("JTextArea");
        }
        l.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            but[j].setBounds(50, 80 + i, 200, 20);
    }

    boolean check() {
        if (current == 0)
            return (but[1].isSelected());
        if (current == 1)
            return (but[2].isSelected());
        if (current == 2)
            return (but[3].isSelected());
        if (current == 3)
            return (but[0].isSelected());
        if (current == 4)
            return (but[2].isSelected());
        if (current == 5)
            return (but[2].isSelected());
        if (current == 6)
            return (but[1].isSelected());
        if (current == 7)
            return (but[3].isSelected());
        if (current == 8)
            return (but[1].isSelected());
        if (current == 9)
            return (but[2].isSelected());
        return false;
    }

    public static void main(String s[]) {
        new OnlineTest("Online Test Of Java");
    }
}