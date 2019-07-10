package com.company.HomeWork22.DAO;

public interface GenericDAO <T, ID>{
    void save(T t);
    void update(T t);
    void remove(T t);
    ID getById();
}
