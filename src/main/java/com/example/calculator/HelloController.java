package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblOutput;
    @FXML
    private Label lblCalculation;

    @FXML
    private String firstNumber = "";

    private String currentNumber = "";

    private String calculationType;

    @FXML
    void sumAction(ActionEvent event) {
        calculationSetup("+");
    }

    @FXML
    void subtractAction(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    void divideAction(ActionEvent event) {
        calculationSetup("/");
    }

    @FXML
    void multiplyAction(ActionEvent event) {
        calculationSetup("*");
    }

    @FXML
    void modulusAction(ActionEvent event) {
        calculationSetup("%");
    }

    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
        lblCalculation.setText(firstNumber + " " + calculationType);
    }

    @FXML
    void equalsAction(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                int calculatedNumber = firstNumberInt + secondNumberInt;
                lblCalculation.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
                lblOutput.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                lblCalculation.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                lblOutput.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / (double)secondNumberInt;
                lblCalculation.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                lblOutput.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                lblCalculation.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                lblOutput.setText(String.valueOf(calculatedNumber));
            }
            case "%" -> {
                int calculatedNumber = firstNumberInt % secondNumberInt;
                lblCalculation.setText(firstNumber + " % " + currentNumber + " = " + calculatedNumber);
                lblOutput.setText(String.valueOf(calculatedNumber));
            }
            case "" -> {
                int calculatedNumber = firstNumberInt % secondNumberInt;
                lblCalculation.setText(firstNumber + " % " + currentNumber + " = " + calculatedNumber);
                lblOutput.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    void clearAction(ActionEvent event) {
        currentNumber = "";
        lblOutput.setText("");
        lblCalculation.setText("");
    }

    @FXML
    void btnZero(ActionEvent event) {
        if(!currentNumber.equals("")){
            addNumber("0");
        }
    }

    @FXML
    void btnOne(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void btnTwo(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void btnThree(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void btnFour(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void btnFive(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void btnSix(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void btnSeven(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void btnEight(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void btnNine(ActionEvent event) {
        addNumber("9");
    }

    public void updateCalc(){
        lblOutput.setText(currentNumber);
    }

    public void addNumber(String number){
        currentNumber += number;
        updateCalc();
    }
}