package com.company;

import javax.swing.*;

public class Calculator extends JFrame {
    private Double current;
    private Character operation;

    private OperationListener operationButton = new OperationListener(this);
    public JTextField input = new JTextField("");
    public JButton equal = new OperationButton("=");
    public JButton plus = new OperationButton("+");
    public JButton minus = new OperationButton("-");


    public Calculator() {
        super("Calculator");

        GridLayout grid = new GridLayout(this);
        grid.createLayout(this);

        //
    }


    public Character getOperation() {
        return operation;
    }

    public void setOperation(Character operation) {
        this.operation = operation;
    }

    public void setCurrent(double value) {
        this.current = value;
    }

    public Double getCurrent() {
        return current;
    }


//    plus.addActionListener(new ActionListener() {
//
//    });
//
//    minus.addActionListener(new ActionListener() {
//
//    });
//
//    equal.addActionListener(new ActionListener() {
//
//    });
}
