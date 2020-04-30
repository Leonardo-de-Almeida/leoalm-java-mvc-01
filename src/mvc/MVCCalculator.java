// Package declaration
package mvc;

//Class declaration
public class MVCCalculator {

	// Main method
	public static void main(String[] args) {
		
		// Instantiate the classes
		CalculatorView mvcView = new CalculatorView();
		CalculatorModel mvcModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(mvcView, mvcModel);
		
		// Set the View visible
		mvcView.setVisible(true);
	}

}
