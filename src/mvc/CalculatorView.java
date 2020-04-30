// Package declaration
package mvc;

// Imports
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

// Suppress warnings of serial class
@SuppressWarnings("serial")

//Class declaration
public class CalculatorView extends JFrame {

	// Attributes definition
	private JTextField firstNumber = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JTextField calcSolution = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JButton calculateButton = new JButton("Calculate");
	private static final int screenWidth = 600;
	private static final int screenHeight = 90;

	// Constructor
	public CalculatorView() {

		// Size of the JFrame and exit-on-close
		this.setSize(screenWidth, screenHeight);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Instantiate a JPanel object
		JPanel calcPanel = new JPanel();
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		// Add the panel to the frame
		this.add(calcPanel);
	}

	// Getter
	public int getFirstNumber() {
		return Integer.parseInt(firstNumber.getText());
	}

	// Getter
	public int getSecondNumber() {
		return Integer.parseInt(secondNumber.getText());
	}

	// Setter
	public void setCalcSolution(int solution) {
		calcSolution.setText(Integer.toString(solution));
	}

	// When the calculateButton is clicked, the actionPerformed method in the
	// Controller Class is executed
	public void addCalculateListener(ActionListener listenForCalcButton) {
		calculateButton.addActionListener(listenForCalcButton);
	}

	// Pop-up that contains the error message passed
	public void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
