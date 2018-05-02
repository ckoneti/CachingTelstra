package org.telstra.filecaching.messages.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.telstra.filecaching.messages.model.CacheModel;
import org.telstra.filecaching.messages.service.CacheService;

@Path("/cache")

public class MessageResource {
	CacheService cacheservice = new CacheService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<CacheModel> getMessages(){
		return cacheservice.getAllDocuments();
	}
	
	@GET
	@Path("/{documentId}")
	@Produces(MediaType.APPLICATION_XML)
	public CacheModel retrieveDoc(@PathParam("documentId") long id){
		return cacheservice.getMessage(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public CacheModel addDoc(CacheModel cache){
		return cacheservice.addDocument(cache);
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	public void  deletecache(@PathParam("documentId") long id){
		System.out.println("the id is"+id);
		cacheservice.deletecache(id);
		
	}
	
	
}
