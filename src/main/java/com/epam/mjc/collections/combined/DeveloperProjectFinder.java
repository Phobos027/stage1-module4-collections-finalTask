package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder{
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List <String> projectsOfDeveloper = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            Set<String> developersOfProjects = entry.getValue();
            for (String developerOfProject : developersOfProjects) {
                if (developerOfProject.equals(developer)) projectsOfDeveloper.add(entry.getKey());
            }
        }
        projectsOfDeveloper.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) return o2.length() - o1.length();
                else return o2.compareTo(o1);
            }
        });
        return projectsOfDeveloper;
    }


}
