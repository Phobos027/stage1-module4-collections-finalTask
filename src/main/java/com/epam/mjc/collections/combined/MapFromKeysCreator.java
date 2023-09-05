package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> lengthOfKeys = new HashMap<>();
        Set <String> values = sourceMap.keySet();
        for (String value : values) {
            Set <String> number = new HashSet<>();
            for (String s : values) {
                if (s.length() == value.length()) number.add(s);
            }
            lengthOfKeys.put(value.length(), number);
        }
        return lengthOfKeys;
        }

    }

