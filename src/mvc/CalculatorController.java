// Package declaration
package mvc;

//Imports
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Class declaration
public class CalculatorController {

	// Attributes declaration
	private CalculatorView theView;
	private CalculatorModel theModel;

	// Constructor
	public CalculatorController(CalculatorView theV, CalculatorModel theM) {

		// Instantiates the View and the Model
		this.theView = theV;
		this.theModel = theM;

		// Tell the View that whenever the calculate button
		// is clicked to execute the actionPerformed method
		// in the CalculateListener inner class
		this.theView.addCalculateListener(new CalculateListener());
	}

	// Inner class declaration
	class CalculateListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int firstNumber, secondNumber = 0;
			// Surround interactions with the View with
			// a try block in case numbers weren't
			// properly entered
			try {
				// Get the numbers from the View
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				// Use the Model to add the numbers
				theModel.addTwoNumbers(firstNumber, secondNumber);
				// The calculated value in Model is passed to the View
				theView.setCalcSolution(theModel.getCalculationValue());

			} catch (NumberFormatException ex) {
				System.out.println(ex);
				theView.displayErrorMessage("Please enter 2 integers");
			}
		}
	}
}
