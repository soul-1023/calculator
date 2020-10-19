package com.company;

import javax.swing.*;
import java.awt.*;

public class GridLayout {
    private final JButton equal;
    private final JButton minus;
    private final JButton plus;
    private final JTextField input;
    private GridBagLayout container;
    private GridBagConstraints line;
    private Container buttons;

    public GridLayout(Calculator calculator) {
        this.equal = calculator.equal;
        this.minus = calculator.minus;
        this.plus = calculator.plus;
        this.input = calculator.input;
    }

    public void createLayout(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(100, 100, 400, 400);
        input.setBounds(0,0,100,60);

        this.setLine();
        this.setButtons(plus, minus);
        this.setContainer(input, buttons, equal);

        frame.setLayout(container);
        frame.add(input);
        frame.add(buttons);
        frame.add(equal);
    }

    private void setLine() {
        line = new GridBagConstraints();
        line.anchor = GridBagConstraints.NORTH;
        line.fill   = GridBagConstraints.BOTH;
        line.gridheight = 1;
        line.gridwidth  = 1;
        line.gridx = 0;
        line.gridy = GridBagConstraints.RELATIVE;
        line.insets = new Insets(0, 0, 1, 1);
        line.ipadx = 0;
        line.ipady = 0;
        line.weightx = 1.0;
        line.weighty = 1.0;
    }

    private void setButtons(JButton... btns) {
        buttons = new Container();
        buttons.setLayout(new java.awt.GridLayout(0,2,0,0));

        for(JButton btn : btns) buttons.add(btn);
    }

    private void setContainer(Component... elems) {
        container = new GridBagLayout();

        for(Component elem : elems) container.setConstraints(elem, line);
    }
}
