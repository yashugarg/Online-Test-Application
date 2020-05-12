package too;

import java.awt.Component;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author gargy
 */
public class Home extends javax.swing.JFrame {

    int marks = 0, current = 0, now = 0;
    int m[] = new int[10];
    int[] quesIndex = new int[10];
    ButtonGroup BtnGr = new ButtonGroup();
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

    public Home(String s) {
        super(s);
        initComponents();
        Component [] components = this.getContentPane().getComponents();
        for(Component component : components){
            if(component instanceof JButton){
                ((JButton) component).setUI(new BasicButtonUI());
            }
        }
        BtnGr.add(jRadioButton1);
        BtnGr.add(jRadioButton2);
        BtnGr.add(jRadioButton3);
        BtnGr.add(jRadioButton4);
        for (int i = 0; i < 10; i++) {
            int randomIndex = (int) (Math.random() * 20);
            quesIndex[i] = randomIndex;
        }
        set();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Q1 = new javax.swing.JButton();
        Q2 = new javax.swing.JButton();
        Q3 = new javax.swing.JButton();
        Q4 = new javax.swing.JButton();
        Q5 = new javax.swing.JButton();
        Q6 = new javax.swing.JButton();
        Q7 = new javax.swing.JButton();
        Q8 = new javax.swing.JButton();
        Q9 = new javax.swing.JButton();
        Q10 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        questionLabel = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(39, 39, 39));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 400));

        Q1.setForeground(new java.awt.Color(255, 255, 255));
        Q1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q1.setText("Question 1");
        Q1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q1ActionPerformed(evt);
            }
        });

        Q2.setForeground(new java.awt.Color(255, 255, 255));
        Q2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q2.setText("Question 2");
        Q2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q2ActionPerformed(evt);
            }
        });

        Q3.setForeground(new java.awt.Color(255, 255, 255));
        Q3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q3.setText("Question 3");
        Q3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q3ActionPerformed(evt);
            }
        });

        Q4.setForeground(new java.awt.Color(255, 255, 255));
        Q4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q4.setText("Question 4");
        Q4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q4ActionPerformed(evt);
            }
        });

        Q5.setForeground(new java.awt.Color(255, 255, 255));
        Q5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q5.setText("Question 5");
        Q5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q5ActionPerformed(evt);
            }
        });

        Q6.setForeground(new java.awt.Color(255, 255, 255));
        Q6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q6.setText("Question 6");
        Q6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q6ActionPerformed(evt);
            }
        });

        Q7.setForeground(new java.awt.Color(255, 255, 255));
        Q7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q7.setText("Question 7");
        Q7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q7ActionPerformed(evt);
            }
        });

        Q8.setForeground(new java.awt.Color(255, 255, 255));
        Q8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q8.setText("Question 8");
        Q8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q8ActionPerformed(evt);
            }
        });

        Q9.setForeground(new java.awt.Color(255, 255, 255));
        Q9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q9.setText("Question 9");
        Q9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q9ActionPerformed(evt);
            }
        });

        Q10.setForeground(new java.awt.Color(255, 255, 255));
        Q10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/default.png"))); // NOI18N
        Q10.setText("Question 10");
        Q10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Q10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/hover.png"))); // NOI18N
        Q10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/button/selected.png"))); // NOI18N
        Q10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Q10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Q1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_START);

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(0, 0));

        questionLabel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        questionLabel.setText("Question:");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton1");

        jRadioButton3.setText("jRadioButton1");

        jRadioButton4.setText("jRadioButton1");

        nextButton.setBackground(new java.awt.Color(51, 51, 255));
        nextButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(0, 153, 0));
        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setLabel("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q1ActionPerformed
        current = 0;
        set();
    }//GEN-LAST:event_Q1ActionPerformed

    private void Q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q2ActionPerformed
        current = 1;
        set();
    }//GEN-LAST:event_Q2ActionPerformed

    private void Q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q3ActionPerformed
        current = 2;
        set();
    }//GEN-LAST:event_Q3ActionPerformed

    private void Q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q4ActionPerformed
        current = 3;
        set();
    }//GEN-LAST:event_Q4ActionPerformed

    private void Q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q5ActionPerformed
        current = 4;
        set();
    }//GEN-LAST:event_Q5ActionPerformed

    private void Q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q6ActionPerformed
        current = 5;
        set();
    }//GEN-LAST:event_Q6ActionPerformed

    private void Q7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q7ActionPerformed
        current = 6;
        set();
    }//GEN-LAST:event_Q7ActionPerformed

    private void Q8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q8ActionPerformed
        current = 7;
        set();
    }//GEN-LAST:event_Q8ActionPerformed

    private void Q9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q9ActionPerformed
        current = 8;
        set();
    }//GEN-LAST:event_Q9ActionPerformed

    private void Q10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q10ActionPerformed
        current = 9;
        set();
    }//GEN-LAST:event_Q10ActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (check())
            marks = marks + 1;
        current++;
        JOptionPane.showMessageDialog(this, "Correct Answers: " + marks + "/10");
        System.exit(0);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (check())
            marks = marks + 1;
        current++;
        set();
    }//GEN-LAST:event_nextButtonActionPerformed
    
    /**
     * @param args the command line arguments
     */

    void set() {
        BtnGr.clearSelection();
        for (int i = 0; i < 10; i++) {
            if (current == i) {
                questionLabel.setText("<html><p>Ques " + (current+1) + ": " + allQues[quesIndex[i]][0] + "</p></html>");
                jRadioButton1.setText(allQues[quesIndex[i]][1]);
                jRadioButton2.setText(allQues[quesIndex[i]][2]);
                jRadioButton3.setText(allQues[quesIndex[i]][3]);
                jRadioButton4.setText(allQues[quesIndex[i]][4]);
            }
        }
    }

    boolean check() {
        for (int i = 0; i < 10; i++) {
            if (current == i) {
                if (jRadioButton1.isSelected())
                    return (jRadioButton1.getActionCommand().equals(allQues[quesIndex[i]][5]));
                if (jRadioButton2.isSelected())
                    return (jRadioButton2.getActionCommand().equals(allQues[quesIndex[i]][5]));
                if (jRadioButton3.isSelected())
                    return (jRadioButton3.getActionCommand().equals(allQues[quesIndex[i]][5]));
                if (jRadioButton4.isSelected())
                    return (jRadioButton4.getActionCommand().equals(allQues[quesIndex[i]][5]));
            }
        }
        return false;
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home("Online Test Application").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Q1;
    private javax.swing.JButton Q10;
    private javax.swing.JButton Q2;
    private javax.swing.JButton Q3;
    private javax.swing.JButton Q4;
    private javax.swing.JButton Q5;
    private javax.swing.JButton Q6;
    private javax.swing.JButton Q7;
    private javax.swing.JButton Q8;
    private javax.swing.JButton Q9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
