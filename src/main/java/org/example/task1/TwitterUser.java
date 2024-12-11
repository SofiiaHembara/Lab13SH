package org.example.task1;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class TwitterUser {
    private String email;
    private String country;
    private String lastActiveTime;

    public String getUserMail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public String getLastActiveTime() {
        return lastActiveTime;
    }
}
