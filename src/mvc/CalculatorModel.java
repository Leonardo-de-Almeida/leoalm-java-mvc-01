
// Package declaration
package mvc;

// Class declaration
public class CalculatorModel {

	// Attributes declaration
	private int calculationValue;

	// Public method to add two numbers
	public void addTwoNumbers(int firstNumber, int secondNumber) {
		calculationValue = firstNumber + secondNumber;
	}

	// Getter
	public int getCalculationValue() {
		return calculationValue;
	}

}
