package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessons = new HashSet<>();
        for (Map.Entry<String, List<String>> entry : timetable.entrySet()) {
            lessons.addAll(entry.getValue());
        }
        return lessons;
    }
}
