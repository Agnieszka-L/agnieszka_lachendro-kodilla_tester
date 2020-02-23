package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalToSchoolMap = new HashMap<>();

        Principal principalKennedy = new Principal("Kennedy");
        Principal principalWest = new Principal("West");
        Principal principalMoore = new Principal("Moore");

        School primarySchool = new School("Primary School", 20, 22, 20, 25, 30);
        School secondarySchool = new School("Secondary School", 34, 30, 32);
        School highSchool = new School("High School", 35, 32, 34, 36, 37);

        principalToSchoolMap.put(principalKennedy, primarySchool);
        principalToSchoolMap.put(principalMoore, secondarySchool);
        principalToSchoolMap.put(principalWest, highSchool);

        Set<Principal> principals = principalToSchoolMap.keySet();

        for (Principal principal : principals) {
            School school = principalToSchoolMap.get(principal);
            System.out.println("Principal " + principal.getName() + " has " + school.getSumOfStudentsInSchool() + " students in his " + school.getName());
        }
    }
}
