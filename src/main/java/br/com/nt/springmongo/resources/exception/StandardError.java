package br.com.nt.springmongo.resources.exception;

import java.io.Serializable;
import java.time.ZonedDateTime;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	private ZonedDateTime timestamp;
	private Integer status;
	private String error;
	private String message;
	private String path;

	public StandardError() {

	}

	public StandardError(ZonedDateTime timestamp, Integer status, String error, String message, String path) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;

	}

	public ZonedDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(ZonedDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
