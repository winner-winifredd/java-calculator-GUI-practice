import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class JavaCalculator extends JFrame {
    double firstNum;
    double secondNum;
    double total;
    double plusminus;
    int plusClick;
    int minusClick;
    int multiplyClick;
    int devideClick;
    int decimalClick;
    private JButton Button9;
    private JButton clear;
    private JButton decimal;
    private JTextField display;
    private JButton divide;
    private JButton equals;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JPanel jPanel1;
    private JButton minus;
    private JButton multiply;
    private JButton plus;
    private JButton posneg;

    public JavaCalculator() {
        this.initComponents();
    }

    private void initComponents() {
        this.jButton9 = new JButton();
        this.jPanel1 = new JPanel();
        this.display = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.jButton7 = new JButton();
        this.jButton8 = new JButton();
        this.jButton10 = new JButton();
        this.clear = new JButton();
        this.decimal = new JButton();
        this.plus = new JButton();
        this.minus = new JButton();
        this.multiply = new JButton();
        this.divide = new JButton();
        this.posneg = new JButton();
        this.equals = new JButton();
        this.Button9 = new JButton();
        this.jButton9.setText("jButton1");
        this.setDefaultCloseOperation(3);
        this.setTitle("My Calculator");
        this.setBackground(new Color(102, 102, 102));
        this.setResizable(false);
        this.jPanel1.setBackground(new Color(204, 204, 204));
        this.display.setEditable(false);
        this.display.setFont(new Font("Tahoma", 1, 18));
        this.display.setBorder(BorderFactory.createEtchedBorder());
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("1");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setText("2");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setFont(new Font("Tahoma", 1, 14));
        this.jButton3.setText("3");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setFont(new Font("Tahoma", 1, 14));
        this.jButton4.setText("4");
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton5.setFont(new Font("Tahoma", 1, 14));
        this.jButton5.setText("5");
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton6.setFont(new Font("Tahoma", 1, 14));
        this.jButton6.setText("6");
        this.jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton6ActionPerformed(evt);
            }
        });
        this.jButton7.setFont(new Font("Tahoma", 1, 14));
        this.jButton7.setText("7");
        this.jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton7ActionPerformed(evt);
            }
        });
        this.jButton8.setFont(new Font("Tahoma", 1, 14));
        this.jButton8.setText("8");
        this.jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton8ActionPerformed(evt);
            }
        });
        this.jButton10.setFont(new Font("Tahoma", 1, 14));
        this.jButton10.setText("0");
        this.jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.jButton10ActionPerformed(evt);
            }
        });
        this.clear.setFont(new Font("Tahoma", 1, 14));
        this.clear.setText("C");
        this.clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.clearActionPerformed(evt);
            }
        });
        this.decimal.setFont(new Font("Tahoma", 1, 14));
        this.decimal.setText(".");
        this.decimal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.decimalActionPerformed(evt);
            }
        });
        this.plus.setFont(new Font("Tahoma", 1, 14));
        this.plus.setText("+");
        this.plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.plusActionPerformed(evt);
            }
        });
        this.minus.setFont(new Font("Tahoma", 1, 18));
        this.minus.setText("-");
        this.minus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.minusActionPerformed(evt);
            }
        });
        this.multiply.setFont(new Font("Tahoma", 1, 14));
        this.multiply.setText("*");
        this.multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.multiplyActionPerformed(evt);
            }
        });
        this.divide.setFont(new Font("Tahoma", 1, 14));
        this.divide.setText("/");
        this.divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.divideActionPerformed(evt);
            }
        });
        this.posneg.setFont(new Font("Tahoma", 1, 14));
        this.posneg.setText("+/-");
        this.posneg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.posnegActionPerformed(evt);
            }
        });
        this.equals.setFont(new Font("Tahoma", 1, 14));
        this.equals.setText("=");
        this.equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.equalsActionPerformed(evt);
            }
        });
        this.Button9.setFont(new Font("Tahoma", 1, 14));
        this.Button9.setText("9");
        this.Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                JavaCalculator.this.Button9ActionPerformed(evt);
            }
        });
        GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
        this.jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.display, -1, 256, 32767).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton7, -2, 57, -2).addGap(10, 10, 10).addComponent(this.jButton8, -2, 57, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton10, -2, 57, -2).addGap(10, 10, 10).addComponent(this.clear, -2, 57, -2)).addComponent(this.posneg, -2, 124, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.equals, -1, 122, 32767).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.Button9, -2, 57, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.multiply, -1, 55, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.decimal, -2, 57, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.divide, -1, 55, 32767)))).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.jButton1, Alignment.LEADING, -1, -1, 32767).addComponent(this.jButton4, Alignment.LEADING, -1, 57, 32767)).addGap(10, 10, 10).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton2, -2, 57, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton3, -2, 57, -2)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton5, -2, 57, -2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton6, -2, 57, -2))).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.plus, -1, 55, 32767).addComponent(this.minus, -1, 55, 32767)))).addContainerGap()));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.display, -2, 29, -2).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1, -2, 38, -2).addComponent(this.jButton2, -2, 38, -2).addComponent(this.jButton3, -2, 38, -2).addComponent(this.plus, -2, 37, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton5, -2, 37, -2).addComponent(this.jButton4, -2, 38, -2).addComponent(this.jButton6, -2, 37, -2).addComponent(this.minus, -2, 38, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton8, -2, 37, -2).addComponent(this.Button9, -2, 37, -2).addComponent(this.multiply, -2, 38, -2)).addComponent(this.jButton7, -2, 37, -2)).addGap(9, 9, 9).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.clear, -2, 37, -2).addComponent(this.decimal, -2, 37, -2).addComponent(this.jButton10, -2, 37, -2).addComponent(this.divide, -2, 38, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.equals, -1, -1, 32767).addComponent(this.posneg, -1, 40, 32767)).addContainerGap(12, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
        this.pack();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton1.getText());
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton2.getText());
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton3.getText());
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton4.getText());
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton5.getText());
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton6.getText());
    }

    private void jButton7ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton7.getText());
    }

    private void jButton8ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton8.getText());
    }

    private void Button9ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.Button9.getText());
    }

    private void jButton10ActionPerformed(ActionEvent evt) {
        this.display.setText(this.display.getText() + this.jButton10.getText());
    }

    private void decimalActionPerformed(ActionEvent evt) {
        if (this.decimalClick == 0) {
            this.display.setText(this.display.getText() + this.decimal.getText());
            this.decimalClick = 1;
        }

    }

    private void clearActionPerformed(ActionEvent evt) {
        this.display.setText("");
        this.decimalClick = 0;
    }

    private void posnegActionPerformed(ActionEvent evt) {
        this.plusminus = Double.parseDouble(String.valueOf(this.display.getText()));
        this.plusminus *= -1.0;
        this.display.setText(String.valueOf(this.plusminus));
    }

    private void plusActionPerformed(ActionEvent evt) {
        this.firstNum = Double.parseDouble(String.valueOf(this.display.getText()));
        this.display.setText("");
        this.plusClick = 1;
        this.decimalClick = 0;
    }

    private void minusActionPerformed(ActionEvent evt) {
        this.firstNum = Double.parseDouble(String.valueOf(this.display.getText()));
        this.display.setText("");
        this.minusClick = 1;
        this.decimalClick = 0;
    }

    private void multiplyActionPerformed(ActionEvent evt) {
        this.firstNum = Double.parseDouble(String.valueOf(this.display.getText()));
        this.display.setText("");
        this.multiplyClick = 1;
        this.decimalClick = 0;
    }

    private void divideActionPerformed(ActionEvent evt) {
        this.firstNum = Double.parseDouble(String.valueOf(this.display.getText()));
        this.display.setText("");
        this.devideClick = 1;
        this.decimalClick = 0;
    }

    private void equalsActionPerformed(ActionEvent evt) {
        this.secondNum = Double.parseDouble(String.valueOf(this.display.getText()));
        if (this.plusClick > 0) {
            this.total = this.firstNum + this.secondNum;
            this.display.setText(String.valueOf(this.total));
            this.firstNum = 0.0;
            this.secondNum = 0.0;
            this.plusClick = 0;
        }

        if (this.minusClick > 0) {
            this.total = this.firstNum - this.secondNum;
            this.display.setText(String.valueOf(this.total));
            this.firstNum = 0.0;
            this.secondNum = 0.0;
            this.minusClick = 0;
        }

        if (this.multiplyClick > 0) {
            this.total = this.firstNum * this.secondNum;
            this.display.setText(String.valueOf(this.total));
            this.firstNum = 0.0;
            this.secondNum = 0.0;
            this.multiplyClick = 0;
        }

        if (this.devideClick > 0) {
            this.total = this.firstNum / this.secondNum;
            this.display.setText(String.valueOf(this.total));
            this.firstNum = 0.0;
            this.secondNum = 0.0;
            this.devideClick = 0;
        }

    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new JavaCalculator()).setVisible(true);
            }
        });
    }
}