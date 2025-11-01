import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameGrafics extends JFrame implements ActionListener {

    JPanel jp = new JPanel();
    JButton jb1 = new JButton("1");
    JButton jb2 = new JButton("2");
    JButton jb3 = new JButton("3");
    JButton jb4 = new JButton("4");
    JButton jb5 = new JButton("5");
    JButton jb6 = new JButton("6");
    JButton jb7 = new JButton("7");
    JButton jb8 = new JButton("8");
    JButton jb9 = new JButton("9");
    JButton jb10 = new JButton("10");
    JButton jb11 = new JButton("11");
    JButton jb12 = new JButton("12");
    JButton jb13 = new JButton("13");
    JButton jb14 = new JButton("14");
    JButton jb15 = new JButton("15");
    JButton jEmpty = new JButton("");
    JButton[] buttonsArray = {jEmpty, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15};
    JButton[] correctArray = {jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10, jb11, jb12, jb13, jb14, jb15, jEmpty};

    public GameGrafics() {

        buttonsArray = shuffleArray(buttonsArray);

        this.add(jp);
        jp.setLayout(new GridLayout(4, 4));

        placeButtonsInJPanel(buttonsArray, jp);

        for (int i = 0; i < buttonsArray.length; i++) {
            buttonsArray[i].addActionListener(this);
        }
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void placeButtonsInJPanel(JButton[] buttonsArray, JPanel jp) {
        for (int i = 0; i < buttonsArray.length; i++) {
            jp.add(buttonsArray[i]);
        }
        jp.repaint();
        jp.revalidate();
        boolean hasWon = hasThePlayerWon(buttonsArray);
        if (hasWon) {
            JOptionPane.showMessageDialog(null, "Grattis, du vann!");
        }
    }

    public boolean hasThePlayerWon(JButton[] buttonsArray) {
        for (int i = 0; i < buttonsArray.length; i++) {
            if (!buttonsArray[i].equals(correctArray[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            if (jb1.getText().equals("1")) {
                if (isValidPlacement(buttonsArray, jb1, jEmpty)) {
                    placeButtonsInJPanel(buttonsArray, jp);
                }
            }

        } else if (e.getSource() == jb2) {
            if (isValidPlacement(buttonsArray, jb2, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }

        } else if (e.getSource() == jb3) {
            if (isValidPlacement(buttonsArray, jb3, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb4) {
            if (isValidPlacement(buttonsArray, jb4, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb5) {
            if (isValidPlacement(buttonsArray, jb5, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb6) {
            if (isValidPlacement(buttonsArray, jb6, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb7) {
            if (isValidPlacement(buttonsArray, jb7, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb8) {
            if (isValidPlacement(buttonsArray, jb8, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb9) {
            if (isValidPlacement(buttonsArray, jb9, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb10) {
            if (isValidPlacement(buttonsArray, jb10, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb11) {
            if (isValidPlacement(buttonsArray, jb11, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb12) {
            if (isValidPlacement(buttonsArray, jb12, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb13) {
            if (isValidPlacement(buttonsArray, jb13, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb14) {
            if (isValidPlacement(buttonsArray, jb14, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        } else if (e.getSource() == jb15) {
            if (isValidPlacement(buttonsArray, jb15, jEmpty)) {
                placeButtonsInJPanel(buttonsArray, jp);
            }
        }

    }

    public static JButton[] shuffleArray(JButton[] buttons) {

        List<JButton> intList = Arrays.asList(buttons);

        Collections.shuffle(intList);

        intList.toArray(buttons);
        return buttons;
    }


    public boolean isValidPlacement(JButton[] bA, JButton klickedButton, JButton emptyButton) {
        int klickedButtonIndex = getIndexPlacement(bA, klickedButton);
        int emptyButtonIndex = getIndexPlacement(bA, emptyButton);
        if (emptyButtonIndex == 0) {
            if (klickedButtonIndex == 1 || klickedButtonIndex == 4) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 1) {
            if (klickedButtonIndex == 0 || klickedButtonIndex == 2 || klickedButtonIndex == 5) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 2) {
            if (klickedButtonIndex == 1 || klickedButtonIndex == 3 || klickedButtonIndex == 6) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 3) {
            if (klickedButtonIndex == 2 || klickedButtonIndex == 7) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 4) {
            if (klickedButtonIndex == 0 || klickedButtonIndex == 5 || klickedButtonIndex == 8) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 5) {
            if (klickedButtonIndex == 1 || klickedButtonIndex == 4 || klickedButtonIndex == 6 || klickedButtonIndex == 9) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 6) {
            if (klickedButtonIndex == 2 || klickedButtonIndex == 5 || klickedButtonIndex == 7 || klickedButtonIndex == 10) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 7) {
            if (klickedButtonIndex == 3 || klickedButtonIndex == 6 || klickedButtonIndex == 11) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 8) {
            if (klickedButtonIndex == 4 || klickedButtonIndex == 9 || klickedButtonIndex == 12) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 9) {
            if (klickedButtonIndex == 5 || klickedButtonIndex == 8 || klickedButtonIndex == 13 || klickedButtonIndex == 10) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 10) {
            if (klickedButtonIndex == 6 || klickedButtonIndex == 9 || klickedButtonIndex == 11 || klickedButtonIndex == 14) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 11) {
            if (klickedButtonIndex == 7 || klickedButtonIndex == 10 || klickedButtonIndex == 15) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 12) {
            if (klickedButtonIndex == 8 || klickedButtonIndex == 13) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 13) {
            if (klickedButtonIndex == 9 || klickedButtonIndex == 12 || klickedButtonIndex == 14) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 14) {
            if (klickedButtonIndex == 10 || klickedButtonIndex == 13 || klickedButtonIndex == 15) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        if (emptyButtonIndex == 15) {
            if (klickedButtonIndex == 11 || klickedButtonIndex == 14) {
                bA[emptyButtonIndex] = klickedButton;
                bA[klickedButtonIndex] = emptyButton;
                return true;
            }
            return false;
        }
        return false;
    }

    public int getIndexPlacement(JButton[] bA, JButton klickedButton) {
        for (int i = 0; i < bA.length; i++) {
            if (bA[i].getText().equals(klickedButton.getText())) {
                return i;
            }
        }
        return -1;
    }


}
