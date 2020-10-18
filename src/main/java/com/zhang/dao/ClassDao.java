package com.zhang.dao;

import com.zhang.domain.Classes;

import java.io.IOException;
import java.util.List;


public interface ClassDao {
    public List<Classes> findAll();

    void addClasses(Classes classes);

    void deleteClasses(String id) throws IOException;

    void updateClasses(Classes classes);

    Classes findClassesById(int id);

    List<Classes> findByName(String cname);
}
