package org.example.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

public class  UserBookingService {
    private User user;
    public UserBookingService(User user) {
        this.user = user;
    }
}

