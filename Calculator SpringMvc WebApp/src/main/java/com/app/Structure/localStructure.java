package com.app.Structure;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//@NamedQuery(name = "find_all_localStructures", query = "select l from localStructure  l")
public class localStructure implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long _id;

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		this._id = id;
	}

	int option;
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
	public localStructure(long id, int option, String selectedString,
			String optionSelectedString,
			String userFirstDateString, String userSecondDateString, String result) {
		super();
		this._id = id;
		this.option = option;
		this.selectedString = selectedString;
		this.optionSelectedString = optionSelectedString;
		this.userFirstDateString = userFirstDateString;
		this.userSecondDateString = userSecondDateString;
		this.result = result;
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
