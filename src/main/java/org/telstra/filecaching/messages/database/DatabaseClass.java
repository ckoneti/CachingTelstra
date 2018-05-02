package org.telstra.filecaching.messages.database;

import java.util.HashMap;
import java.util.Map;

import org.telstra.filecaching.messages.model.CacheModel;
import org.telstra.filecaching.messages.model.Profile;

public class DatabaseClass {
	private static Map<Long, CacheModel> cachemodel= new HashMap<>();
	//private static Map<Long, Profile> profile = new HashMap<>();
	
	public static Map<Long,CacheModel >getDocument(){
		return cachemodel;
	}
	
	
}
