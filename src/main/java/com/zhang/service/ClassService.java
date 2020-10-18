package com.zhang.service;

import com.zhang.domain.Classes;

import java.io.IOException;
import java.util.List;

public interface ClassService {
    List<Classes> findAll();

    void addClasses(Classes classes);

    void deleteClasses(String id) throws IOException;

    void updateClasses(Classes classes);

    Classes findClassesById(String id);

    List<Classes> findByName(String cname);
}
