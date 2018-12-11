package com;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Event implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "EventCategory")
	private java.lang.String eventCategory;
	@org.kie.api.definition.type.Label(value = "EventSource")
	private java.lang.String eventSource;
	@org.kie.api.definition.type.Label(value = "EventDate")
	private java.util.Date eventDate;
	@org.kie.api.definition.type.Label(value = "eventId")
	private java.lang.String eventId;
	@org.kie.api.definition.type.Label(value = "EventValue")
	private java.lang.String eventValue;

	public Event() {
	}

	public java.lang.String getEventCategory() {
		return this.eventCategory;
	}

	public void setEventCategory(java.lang.String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public java.lang.String getEventSource() {
		return this.eventSource;
	}

	public void setEventSource(java.lang.String eventSource) {
		this.eventSource = eventSource;
	}

	public java.util.Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(java.util.Date eventDate) {
		this.eventDate = eventDate;
	}

	public java.lang.String getEventId() {
		return this.eventId;
	}

	public void setEventId(java.lang.String eventId) {
		this.eventId = eventId;
	}

	public java.lang.String getEventValue() {
		return this.eventValue;
	}

	public void setEventValue(java.lang.String eventValue) {
		this.eventValue = eventValue;
	}

	public Event(java.lang.String eventCategory, java.lang.String eventSource,
			java.util.Date eventDate, java.lang.String eventId,
			java.lang.String eventValue) {
		this.eventCategory = eventCategory;
		this.eventSource = eventSource;
		this.eventDate = eventDate;
		this.eventId = eventId;
		this.eventValue = eventValue;
	}

}