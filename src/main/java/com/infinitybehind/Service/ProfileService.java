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

package com.infinitybehind.Service;

import com.infinitybehind.databases.DatabaseClass;
import com.infinitybehind.models.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProfileService {
    private Map<String, Profile> profiles = DatabaseClass.getProfiles();

    public ProfileService() {
        profiles.put("captain", new Profile(1, "ROHAN", "KUMAR", "captain"));
    }

    public List<Profile> getALLProfiles(){
        return new ArrayList<Profile>(profiles.values());
    }

    public Profile getProfile(String profileName){
        return profiles.get(profileName);
    }

    public Profile addProfile(Profile profile){
        profile.setId(profiles.size()+1);
        profiles.put(profile.getProfileName(),profile);
        return profile;
    }

    public Profile updateProfile(String profileName,Profile profile){
        if(profile.getProfileName().isEmpty()){
            return null;
        }
        if(!profileName.equals(profile.getProfileName())) {
            return null;
        }
        if(!profiles.containsKey(profileName)) {
            return null;
        }
        profile.setId(profiles.get(profileName).getId());
        profiles.put(profile.getProfileName(), profile);
        return profile;
    }

    public Profile deleteProfile(String profileName){
        return profiles.remove(profileName);
    }
}
