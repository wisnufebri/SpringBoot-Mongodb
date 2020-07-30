package com.tugas5.wisnufebriramadhan.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Utility {
    public static Map objectToMap(Object object) {
        ObjectMapper oMapper = new ObjectMapper();
        Map<String, Object> map = oMapper.convertValue(object, Map.class);
        return map;
    }
}
