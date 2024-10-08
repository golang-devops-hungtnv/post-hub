package org.example.port.service;

public interface JsonService {
    <T> String toJson(T obj);

    <T> T fromJson(String json, Class<T> clazz);
}