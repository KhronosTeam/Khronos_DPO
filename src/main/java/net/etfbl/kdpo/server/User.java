package net.etfbl.kdpo.server;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Stijak on 16.12.2015..
 */
public class User implements Serializable {
    private String username;
    private String key;
    private HashSet<String> blockedUsersList;
    private boolean allBlocked;
    private ArrayList<String> imageQueue;

    public User(String username, String key) {
        this.username = username;
        this.key = key;
    }

    public boolean areBlockedAll() {
        return allBlocked;
    }

    public boolean isBlocked() {
        return true;
    }

    public void blockUser(String user) {
    }

    public void unblockUser(String user) {
    }

    public void blockAll() {
    }

    public void unblockAll() {
    }

    public boolean addImageToImageQueue(String ImageID){
        return false;
    }

    public String getKey() {
        return null;
    }
}