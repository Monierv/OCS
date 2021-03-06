package com.subutai.nova.web.ws;

import com.subutai.nova.web.entities.ReadRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/textToSpeech")
@Consumes(MediaType.APPLICATION_JSON)
public interface TextToSpeechWS {

    @POST
    Response readText(ReadRequest request);
}
