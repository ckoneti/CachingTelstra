package org.telstra.filecaching.messages.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.telstra.filecaching.messages.model.ErrorMessageClass;

@Provider
public class DataNotFoundMapper implements ExceptionMapper<DataNotFoundException> {

	@Override
	public Response toResponse(DataNotFoundException exc) {
		// TODO Auto-generated method stub
		ErrorMessageClass errormessage= new ErrorMessageClass();
		errormessage.setStatusCode(404);
		errormessage.setErrorMessage(exc.getMessage());
		return Response.status(Status.NOT_FOUND).entity(errormessage).build();
				
	}

}
