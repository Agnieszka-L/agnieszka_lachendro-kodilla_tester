package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> "Chemists".equalsIgnoreCase(u.getGroup()))
       //         .filter(u -> u.getGroup().equalsIgnoreCase("Chemists"))
                .map(user -> user.getUsername())
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user){
        return user.getUsername();
    }
}
