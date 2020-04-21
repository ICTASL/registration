package io.mosip.registration.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * This class is a DTO which parses with UI Schema Json, which decides of how
 * the UI element should behave like whether it is a TextField / Password /
 * Button.
 * 
 * And also it contains the validators to validate the respective UI element,
 * label name,controlType, format,whether it is required or not.
 * 
 * @author YASWANTH S
 *
 */
@Getter
@Setter
public class UiSchemaDTO {

	private String id;
	private boolean inputRequired;
	private String type;
	private int minimum;
	private int maximum;
	private String description;
	private String labelName;
	private String controlType;
	private String fieldType;
	private String format;
	private String[] validators;
	private String fieldCategory;
	
	@JsonProperty("isRequired")
	private boolean isRequired;

}