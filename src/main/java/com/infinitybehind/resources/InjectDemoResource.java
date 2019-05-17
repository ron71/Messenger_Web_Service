/*
 * This project and its content is copyright of ROHAN KUMAR - © cozinfinitybehind [2019r]. All rights reserved.
 *
 * Any redistribution or reproduction of part or all of the contents in any form is prohibited other than the following:
 *
 *     you may print or download to a local hard disk extracts for your personal and non-commercial use only
 *     you may copy the content to individual third parties for their personal use, but only if you acknowledge the website as the source of the material
 *
 * You may not, except with our express written permission, distribute or commercially exploit the content. Nor may you transmit it or store it in any other website or other form of electronic retrieval system.
 */

package com.infinitybehind.resources;
import com.infinitybehind.Service.ProfileService;
import com.infinitybehind.models.Profile;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;
import java.util.List;

@Path("/injectDemo")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)

public class InjectDemoResource {

    @GET
    public String getText(@MatrixParam("param") String matrixParam, @HeaderParam("authSessionId") String token, @CookieParam("name") String cookie){
        return "DUMMY TEXT FROM INJECT DEMO" +
                "Matrix Param : "+ matrixParam + " Auth SessionID : "+ token +" Cookie : " + cookie;
    }


}
