package co.aurasphere.botmill.rasa.incoming.rasa.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StringEntityValue extends RasaEntityValue{
	
	@SerializedName("value")
	private String stringValue;
	private List<String> allEntities ;

	public String getStringValue() {
		if(stringValue != null) {
			return stringValue.replaceAll("^\"|\"$", "");
		}
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}


	public void setAllEntities(List<String> allEntities) {

		this.allEntities = allEntities;
	}

	public List<String> getAllEntities() {

		return allEntities;
	}
}
