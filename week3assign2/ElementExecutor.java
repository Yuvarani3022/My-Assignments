package week3assign2;

public class ElementExecutor {
	public static void main(String[] args) {
		Button button = new Button();
		button.click();
		button.submit();

		TextField textField = new TextField();
		textField.setText("Hello");
		System.out.println(textField.getText());

		CheckBoxButton checkBoxButton = new CheckBoxButton();
		checkBoxButton.click();
		checkBoxButton.submit();
		checkBoxButton.check();

		RadioButton radioButton = new RadioButton();
		radioButton.click();
		radioButton.submit();
		radioButton.selectRadioButton();
	}
}

