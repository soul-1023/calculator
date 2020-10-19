package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OperationListener implements ActionListener {
    private final Calculator calculator;
    private Character prevOperation;

    public OperationListener(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        perform();
    }

    private void perform() {
        Double value = Double.parseDouble(calculator.input.getText());

        if(calculator.getOperation() == null) {
            calculator.setCurrent(value);
        }
        else {
            performOperation(value);
        }
    }

    private void performOperation(Double value) {
        // если предыдущая операция null, то запоминаем предыдущую операцию
        Character operation = calculator.getOperation();
//        if(prevOperation != null)
        switch(operation) {
            case '+':
                calculator.setCurrent(calculator.getCurrent() + value);
                this.prevOperation = operation;
                break;
            case '-':
                calculator.setCurrent(calculator.getCurrent() - value);
                this.prevOperation = operation;
                break;
            case '=':
                performOperation(calculator.getCurrent());
                break;
            default:
                throw new IllegalStateException("Unknown operation! " + calculator.getOperation());
        }
    }

//    private Character getOperation(Object source) {
//        Character operation = null;
//
//        if(source instanceof OperationButton) {
//            operation = ((JButton) source).getOperation();
//        }
//
//        return operation;
//    }
}
