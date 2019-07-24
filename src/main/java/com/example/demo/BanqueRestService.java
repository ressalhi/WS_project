package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
@Component
@Path("/banque")
public class BanqueRestService {
	@GET
// pour les param soit query param ou path param ici c'est path param
	@Path("/conversion/{montant}")
	@Produces(MediaType.APPLICATION_JSON)
	public double conversion(@PathParam(value="montant")double mt) {
		return mt*11;
	}

	@GET
	@Path("/hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String helloMeth() {
			return "Hello";
	}
	@GET
	//regle de restful arch respecter les URI...
	@Path("/comptes/{code}")
	@Produces(MediaType.APPLICATION_JSON)
	public Compte getCompte(@PathParam(value="code")int code) {
		return new Compte(code, Math.random()*67558, LocalDate.now());

	}
	@GET
	@Path("/comptes")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Compte> getComptes(){
		final List<Compte> liste=new ArrayList<>();
		liste.add(new Compte(1, Math.random()*67558, LocalDate.now()));
		liste.add(new Compte(2, Math.random()*67558, LocalDate.now()));
		liste.add(new Compte(3, Math.random()*67558, LocalDate.now()));
		return liste;

	}

}
