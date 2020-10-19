package com.company;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class OperationButton extends JButton {
    private char operation;
    private static final List<Character> OPERATIONS = Arrays.asList('=', '+',
            '-');

    public OperationButton(String title) {
        this(title, title.charAt(0));
    }

    public OperationButton(String title, char operation) {
        super(title);

        if(OPERATIONS.contains(operation)) {
            this.operation = operation;
        } else {
            throw new IllegalArgumentException("Unknown operation! " + operation);
        }
    }

    public char getOperation() {
        return operation;
    }
}
