package Structure;

import java.io.Serializable;

public class localStructure implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	int option;
	private String selectedString;
	private String optionSelectedString;
	private String userFirstDateString;
	private String userSecondDateString;
	private String result;

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}



	public localStructure(int option, String selectedString, String optionSelectedString, String userFirstDateString,
			String userSecondDateString, String result) {
		super();
		this.option = option;
		this.selectedString = selectedString;
		this.optionSelectedString = optionSelectedString;
		this.userFirstDateString = userFirstDateString;
		this.userSecondDateString = userSecondDateString;
		this.result = result;
	}

	public String getUserFirstDateString() {
		return userFirstDateString;
	}

	public void setUserFirstDateString(String userFirstDateString) {
		this.userFirstDateString = userFirstDateString;
	}

	public String getUserSecondDateString() {
		return userSecondDateString;
	}

	public void setUserSecondDateString(String userSecondDateString) {
		this.userSecondDateString = userSecondDateString;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getSelectedString() {
		return selectedString;
	}

	public void setSelectedString(String selectedString) {
		this.selectedString = selectedString;
	}

	public String getOptionSelectedString() {
		return optionSelectedString;
	}

	public void setOptionSelectedString(String optionSelectedString) {
		this.optionSelectedString = optionSelectedString;
	}

}
