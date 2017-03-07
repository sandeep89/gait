package com.practo.entity;
import java.util.Map;

public class Event {

	private String actor;
	private String action;
	private String object;
	private String platform;
	private Map<String, String> objectContext;
	private Map<String, String> actorContext;
	private Map<String, String> webContext;
	private Map<String, String> pageContext;
	private Map<String, String> geolocationContext;
	private Map<String, String> attributionContext;
	private Map<String, String> productContext;
	private Map<String, String> screenContext;
	private Map<String, String> deviceContext;
	private Map<String, String> actionContext;

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	public Map<String, String> getObjectContext() {
		return objectContext;
	}

	public void setObjectContext(Map<String, String> objectContext) {
		this.objectContext = objectContext;
	}

	public Map<String, String> getActorContext() {
		return actorContext;
	}

	public void setActorContext(Map<String, String> actorContext) {
		this.actorContext = actorContext;
	}

	public Map<String, String> getWebContext() {
		return webContext;
	}

	public void setWebContext(Map<String, String> webContext) {
		this.webContext = webContext;
	}

	public Map<String, String> getPageContext() {
		return pageContext;
	}

	public void setPageContext(Map<String, String> pageContext) {
		this.pageContext = pageContext;
	}

	public Map<String, String> getGeolocationContext() {
		return geolocationContext;
	}

	public void setGeolocationContext(Map<String, String> geolocationContext) {
		this.geolocationContext = geolocationContext;
	}

	public Map<String, String> getAttributionContext() {
		return attributionContext;
	}

	public void setAttributionContext(Map<String, String> attributionContext) {
		this.attributionContext = attributionContext;
	}

	public Map<String, String> getProductContext() {
		return productContext;
	}

	public void setProductContext(Map<String, String> productContext) {
		this.productContext = productContext;
	}

	public Map<String, String> getScreenContext() {
		return screenContext;
	}

	public void setScreenContext(Map<String, String> screenContext) {
		this.screenContext = screenContext;
	}

	public Map<String, String> getDeviceContext() {
		return deviceContext;
	}

	public void setDeviceContext(Map<String, String> deviceContext) {
		this.deviceContext = deviceContext;
	}

	public Map<String, String> getActionContext() {
		return actionContext;
	}

	public void setActionContext(Map<String, String> actionContext) {
		this.actionContext = actionContext;
	}
	
}