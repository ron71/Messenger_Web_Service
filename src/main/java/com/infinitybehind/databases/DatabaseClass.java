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

package com.infinitybehind.databases;

import com.infinitybehind.models.Message;
import com.infinitybehind.models.Profile;

import java.util.HashMap;
import java.util.Map;

public class DatabaseClass {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long, Message> getMessages() {
        return messages;
    }

    public static Map<String , Profile> getProfiles() {
        return profiles;
    }
}
