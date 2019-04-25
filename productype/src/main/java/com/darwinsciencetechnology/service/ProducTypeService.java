package com.darwinsciencetechnology.service;

import com.darwinsciencetechnology.dao.ProducTypeDao;
import com.darwinsciencetechnology.model.ProducType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProducTypeService {


    @Autowired
    ProducTypeDao producTypeDao;

    public void insertProducType(ProducType productType){
        producTypeDao.insertProducType(productType);
    }
    public ProducType findProducTypeByid(int id){
        return producTypeDao.findProducTypeByid(id);
    }
}
