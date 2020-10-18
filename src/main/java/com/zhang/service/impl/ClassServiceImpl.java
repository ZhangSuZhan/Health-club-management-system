package com.zhang.service.impl;

import com.zhang.dao.ClassDao;
import com.zhang.dao.impl.ClassDapImpl;
import com.zhang.domain.Classes;
import com.zhang.service.ClassService;

import java.io.IOException;
import java.util.List;

public class ClassServiceImpl implements ClassService {

    private ClassDao classDao = new ClassDapImpl();

    @Override
    public List<Classes> findAll() {
        return classDao.findAll();
    }

    @Override
    public void addClasses(Classes classes) {
        classDao.addClasses(classes);
    }

    @Override
    public void deleteClasses(String id) throws IOException {
        classDao.deleteClasses(id);
    }

    @Override
    public Classes findClassesById(String id) {

        return classDao.findClassesById(Integer.parseInt(id));
    }

    @Override
    public List<Classes> findByName(String cname) {
        return classDao.findByName(cname);
    }

    @Override
    public void updateClasses(Classes classes) {
        classDao.updateClasses(classes);
    }


}
