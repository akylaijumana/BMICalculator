package org.example.myjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMICalculatorController {


    @FXML
    private TextField weightField;
    @FXML
    private TextField heightField;
    @FXML
    private Label resultLabel;
    @FXML
    private Button calculateButton;

    @FXML
    private void initialize() {
        calculateButton.setOnAction(event -> calculateBMI());
    }

    private void calculateBMI() {
        try {
            double weight = Double.parseDouble(weightField.getText());
            double height = Double.parseDouble(heightField.getText());
            double bmi = weight / (height * height);

            // Classify BMI
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            resultLabel.setText(String.format("Your BMI is: %.2f (%s)", bmi, category));
        } catch (NumberFormatException e) {
            resultLabel.setText("Please enter valid numbers.");
        }
    }
}

