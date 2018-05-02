package org.telstra.filecaching.messages.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cache")
public class CacheModel {
//private  long timetilive= 30;

private long id;
private String message;
/*public long getTimetilive() {
	return timetilive;
}
public void setTimetilive(long timetilive) {
	this.timetilive = timetilive;
}*/

public CacheModel(){
	
}
public CacheModel( long id, String message){
	this.id= id;
	this.message= message;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}


}
