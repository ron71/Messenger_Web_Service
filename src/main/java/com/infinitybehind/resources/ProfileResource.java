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

@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource {

    ProfileService profileService = new ProfileService();

    @GET
    public List<Profile> getProfiles(){
        return profileService.getALLProfiles();
    }

    @GET
    @Path("/{profileName}")
    public Profile getProfile(@PathParam("profileName") String profileName){
        return profileService.getProfile(profileName);
    }

    @POST
    public Profile addProfile(Profile profile){
        profileService.addProfile(profile);
        return profile;
    }

    @PUT
    @Path("/{profileName}")
    public Profile updateProfile(@PathParam("profileName") String profileName,Profile profile){
       return profileService.updateProfile(profileName,profile);
    }

    @DELETE
    @Path("/{profileName}")
    public Profile deleteProfile(@PathParam("profileName") String profileName){
        return profileService.deleteProfile(profileName);
    }



}
