package org.example.adapter.service;

import org.example.port.service.JsonService;
import org.springframework.stereotype.Service;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonServiceImpl implements JsonService {
    private static final Gson GSON = new GsonBuilder().create();

    @Override
    public <T> String toJson(T obj) {
        return GSON.toJson(obj);
    }

    @Override
    public <T> T fromJson(String json, Class<T> clazz) {
        return GSON.fromJson(json, clazz);
    }
}