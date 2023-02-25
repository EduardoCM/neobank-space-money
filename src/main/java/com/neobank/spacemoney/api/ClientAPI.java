package com.neobank.spacemoney.api;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.jboss.logging.Logger;

import com.neobank.spacemoney.model.Client;

@Path("/api/client")
public class ClientAPI {

	@Inject
	private Logger log;

	@POST
	public Response createClient(Client client) {
		log.info("Creando22222 cliente nuevo: " + client);
		return Response.status(Status.CREATED).build();
	}
}
