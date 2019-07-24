package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

/**
 * The Class HomeEndPoint.
 */
@Path("/")
@Component
public class HomeEndPoint {

	/**
	 * Index.
	 *
	 * @return the map
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> index() {
		 final Map<String, String> mapInfo=new HashMap<>();
		 mapInfo.put("welcome", "Bienvenu dans le plus grand poc spring boot");
		return mapInfo;
	}

}
