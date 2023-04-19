package com.epam.mjc.collections.map;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean result = functionMap.containsValue(requiredValue);
        return result;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();
        if (sourceList.isEmpty()) {
            return map;
        }
        int temp = 0;
        for (Integer e : sourceList) {
            temp = 5 * e + 2;
            map.put(e, temp);
        }
        return map;
    }
}
