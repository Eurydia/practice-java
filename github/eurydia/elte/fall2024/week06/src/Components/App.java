package Components;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Key;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class App {
    private String fieldValue = "";

    private final JTextField textField;

    public App() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel actionPanel = new JPanel();
        actionPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        actionPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        textField = new JTextField(fieldValue, 50);
        textField.setEditable(false);
        actionPanel.add(textField);

        var clearBtn = new JButton("CLR");
        clearBtn.addActionListener(new AppActionListener('c'));
        actionPanel.add(clearBtn);

        var backspaceBtn = new JButton("BACKSPACE");
        backspaceBtn.addActionListener(new AppActionListener('b'));
        actionPanel.add(backspaceBtn);


        JPanel keyboardPanel = new JPanel();
        keyboardPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        keyboardPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        String keys = "qwerty";
        for (char key : keys.toCharArray()) {
            var btn = new JButton(String.valueOf(key));
            btn.addActionListener(new AppActionListener(key));
            keyboardPanel.add(btn);
        }

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        mainPanel.setAlignmentY(Component.TOP_ALIGNMENT);

        mainPanel.add(actionPanel);
        mainPanel.add(keyboardPanel);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JMenu appMenu = new JMenu("KB");
        menuBar.add(appMenu);
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        appMenu.add(exitMenuItem);
        exitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        frame.getContentPane().add(BorderLayout.PAGE_START, mainPanel);

        frame.pack();
        frame.setVisible(true);
    }

    class AppActionListener implements ActionListener {
        private final char operation;
        public AppActionListener(char op) {
            operation = op;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String newValue = switch (operation) {
                case 'b' -> fieldValue = fieldValue.length() > 1 ? fieldValue.substring(0, fieldValue.length() - 1) : "";
                case 'c' -> fieldValue = "";
                default -> fieldValue += this.operation;
            };
            textField.setText(newValue);
        }
    }

}
