package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> listOfProjects = new ArrayList<>();
        for (Map.Entry<String, Set<String>> stringSetEntry : projects.entrySet()) {
            String key = stringSetEntry.getKey();
            Set<String> value = stringSetEntry.getValue();
            if(value.contains(developer)){
                listOfProjects.add(key);
            }
        }
        listOfProjects.sort(Comparator.comparingInt(String::length).reversed());
        return listOfProjects;
    }
}
