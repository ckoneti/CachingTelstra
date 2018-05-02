 package org.telstra.filecaching.messages.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.core.Response;

import org.telstra.filecaching.messages.database.DatabaseClass;
import org.telstra.filecaching.messages.exceptions.DataNotFoundException;
import org.telstra.filecaching.messages.model.CacheModel;

public class CacheService {
	
	private Map<Long,CacheModel>cachemodel= DatabaseClass.getDocument();
	public long timetolive= 30;
	public long lastAccessed;
	
	public CacheService(){
		cachemodel.put(1L, new CacheModel(1L, "2019 telstra graduate program"));
		cachemodel.put(2L, new CacheModel(2L,"go giver book"));
	}
	
	public List<CacheModel> getAllDocuments(){
		
		return new ArrayList<CacheModel> (cachemodel.values());
		
		}

	public CacheModel getMessage(long id)
	{
		cachemodel.containsKey(id);
		lastAccessed= System.currentTimeMillis();
		CacheModel response= cachemodel.get(id);
		if(response==null){
		 throw  new DataNotFoundException("This document with"+id+"does not exist");
		}
		
		return response;
		
	}
	
	public CacheModel addDocument(CacheModel cachemodels ){
		cachemodels.setId(cachemodel.size()+1);
		cachemodel.put(cachemodels.getId(), cachemodels);
		return cachemodels;
			
	}
	
	public void  deletecache(long id) {
		cachemodel.remove(id);
	
}
}
