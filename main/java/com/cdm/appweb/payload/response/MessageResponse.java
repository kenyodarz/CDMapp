package com.cdm.appweb.payload.response;

/* Clase que maneja los mensajes de respuesta de la API */
public class MessageResponse {
	private String message;

	public MessageResponse(String message) {
	    this.message = message;
	  }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
