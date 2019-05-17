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
import com.infinitybehind.models.Message;
import com.infinitybehind.models.Profile;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

public class MessageService {

    private Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {
        messages.put(1L,new Message(1L, "Where are you?", "captain"));
        messages.put(2L, new Message(2L, "Fuck you!", "captain"));

    }

    public List<Message> getAllMessageForYear(int year){

       /*
       * returns list of messages of given year
       * */
        List<Message> messagesForYear = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        for(Message message : messages.values()){
            cal.setTime(message.getCreated());
            if(cal.get(Calendar.YEAR)==year){
                messagesForYear.add(message);
            }
        }
        return messagesForYear;
    }

    public List<Message> getAllMeassagesPaginated(int start, int size){

        /*
        * returns list of messages from given index to specified size.
        * */
        List<Message> messagesPaginated = new ArrayList<>(messages.values());

        return messagesPaginated.subList(start, start+size);
    }


    public List<Message> getAllMessages(){

        return new ArrayList<Message>(messages.values());
    }

    public Message getMessage(long id){
        return messages.get(id);
    }

    public Message addMessage(Message message){
        message.setId(messages.size()+1);
        messages.put(message.getId(), message);
        return message;
    }

    public Message updateMessage(Message message){
        if(message.getId()<=0){
            return null;
        }
        messages.put(message.getId(), message);
        return message;
    }

    public Message removeMessage(long id){
        return messages.remove(id);
    }

}
