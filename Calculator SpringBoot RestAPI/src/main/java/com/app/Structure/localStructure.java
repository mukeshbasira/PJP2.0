package com.app.Structure;

import java.io.Serializable;

public class localStructure implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	//	private Long _id;
	//
	//	public Long getId() {
	//		return _id;
	//	}
	//
	//	public void setId(long id) {
	//		this._id = id;
	//	}

	Integer option;
	private String selectedString;
	private String optionSelectedString;
	private String userFirstDateString;
	private String userSecondDateString;
	private String result;



	public void setOption(int option) {
		this.option = option;
	}

	public Integer getOption() {
		return this.option;
	}

	public localStructure() {

	}


	public localStructure(Integer option, String selectedString, String optionSelectedString,
			String userFirstDateString,
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

	@Override
	public String toString() {
		return " Option selected - " + getOption() +
				"\n option phrase  was - " + getOptionSelectedString()+

				"\n operation was - " + getSelectedString()+
				"\n User First input was - " + getUserFirstDateString()+
				"\n User Second input was - " + getUserSecondDateString()+
				"\n Output was - " + getResult();



	}

}
