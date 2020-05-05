import java.awt.event.*;
import javax.swing.*;

class OnlineTest extends JFrame implements ActionListener {
    JLabel l;
    JRadioButton but[] = new JRadioButton[5];
    JButton b1, b2;
    ButtonGroup bg;
    int marks = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];
    int[] quesIndex = new int[10];
    public static String allQues[][] = {
            { "Which one among these is not a keyword?", "class", "int", "get", "if", "get" },
            { "Which one among these is not a primitive datatype?", "int", "Float", "boolean", "char", "Float" },
            { "A process that involves recognizing and focusing on the important characteristics of a situation or object is known as:",
                    "Encapsulation", "Polymorphism", "Abstraction", "Inheritance", "Abstraction" },
            { "Which statement is true regarding an object?", "An object is what classes instantiated are from",
                    "An object is an instance of a class", " An object is a variable",
                    "An object is a reference to an attribute", "An object is an instance of a class" },
            { "In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:",
                    "Encapsulation", "Interface", "Composition", "Inheritance", "Inheritance" },
            { "The wrapping up of data and functions into a single unit is called", "Encapsulation", "Abstraction",
                    "Data Hiding", "Polymorphism", "Encapsulation" },
            { "In object-oriented programming, new classes can be defined by extending existing classes. This is an example of:",
                    "Encapsulation", "Interface", "Composition", "Inheritance", "Inheritance" },
            { "Given a class named student, which of the following is a valid constructor declaration for the class?",
                    "Student (student s) { }", "Student student ( ) { }", "private final student ( ) { }",
                    "void student ( ) { }", "Student (student s) { }" },
            { "Which of these field declarations are legal within the body of an interface?",
                    "private final static int answer = 42 ", "public static int answer=42", "final static answer =42",
                    "int answer", "public static int answer=42" },
            { "A package is a collection of", "Classes", "Interfaces", "Editing tools", "Classes and interfaces",
                    "Classes and interfaces" },
            { "Basic Java language functions are stored in which of the following java package?", " java.lang",
                    "java.io", " java.util", "java.awt", " java.lang" },
            { "Which of the following is a member of the java.lang package?", "List", "Queue", "Math", "Process",
                    "Queue" },
            { "What is the fundamental unit of information of writer streams?", "Characters", "Bytes", "Files",
                    "Records", "Characters" },
            { "File class is included in which package?", "java.io", "java.lang", "java.awt", "java.net", "java.io" },
            { "URL stands for", "Universal reader locator", "Universal reform loader", "Uniform resource loader",
                    "Uniform resource locator", "Uniform resource locator" },
            { "What is the return type of the method getID() defined in AWTEvent class?", "Int", "long", "Object",
                    "Component", "Int" },
            { "Which one of these is a valid method declaration?", "void method1", "void method2()",
                    "void method3(void)", "method4()", "void method2()" },
            { "Given a class named Book, which one of these is a valid constructor declaration for the class?",
                    "Book(Book b) { }", "Book Book() { }", "private final Book() { }", "void Book() { }",
                    "Book(Book b) { }" },
            { "Which one of the following class definitions is a valid definition of a class that cannot be extended?",
                    "class Link { }", "abstract class Link { }", "static class Link { }", "final class Link { }",
                    "final class Link { }" },
            { "How restrictive is the default accessibility compared to public, protected, and private accessibility?",
                    "Less restrictive than public", "More restrictive than public, but less restrictive than protected",
                    "More restrictive than protected, but less restrictive than private",
                    "More restrictive than private",
                    "More restrictive than protected, but less restrictive than private" } };

    OnlineTest(String s) {
        super(s);
        l = new JLabel();
        add(l);
        for (int i = 0; i < 10; i++) {
            int randomIndex = (int) (Math.random() * 20);
            quesIndex[i] = randomIndex;
        }
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
        l.setBounds(30, 40, 800, 20);
        but[0].setBounds(50, 80, 500, 20);
        but[1].setBounds(50, 110, 500, 20);
        but[2].setBounds(50, 140, 350, 20);
        but[3].setBounds(50, 170, 305, 20);
        b1.setBounds(100, 240, 100, 30);
        b2.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(900, 350);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (check())
                marks = marks + 1;
            current++;
            set();
            if (current == 9) {
                b1.setEnabled(false);
                b2.setText("Result");
            }
        }
        if (e.getActionCommand().equals("Bookmark")) {
            JButton bk = new JButton("Bookmark" + x);
            bk.setBounds(780, 40 + 30 * x, 100, 30);
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
                    marks = marks + 1;
                now = current;
                current = m[y];
                set();
                ((JButton) e.getSource()).setEnabled(false);
                current = now;
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                marks = marks + 1;
            current++;
            JOptionPane.showMessageDialog(this, "correct ans=" + marks);
            System.exit(0);
        }
    }

    void set() {
        but[4].setSelected(true);
        for (int i = 0; i < 10; i++) {
            if (current == i) {
                l.setText("Ques: " + allQues[quesIndex[i]][0]);
                but[0].setText(allQues[quesIndex[i]][1]);
                but[1].setText(allQues[quesIndex[i]][2]);
                but[2].setText(allQues[quesIndex[i]][3]);
                but[3].setText(allQues[quesIndex[i]][4]);
            }
        }
        l.setBounds(30, 40, 800, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            but[j].setBounds(50, 80 + i, 500, 20);
    }

    boolean check() {
        for (int i = 0; i < 10; i++) {
            if (current == i) {
                for (int j = 0; j < 4; j++) {
                    if (but[j].isSelected()) {
                        return (but[j].getActionCommand().equals(allQues[quesIndex[i]][5]));
                    }
                }
            }
        }
        return false;
    }

    public static void main(String s[]) {
        new OnlineTest("Online Test Of Java");
    }
}