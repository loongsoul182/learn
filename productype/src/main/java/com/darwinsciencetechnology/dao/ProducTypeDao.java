package com.darwinsciencetechnology.dao;

import com.darwinsciencetechnology.mapper.ProducTypeMapper;
import com.darwinsciencetechnology.model.ProducType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProducTypeDao {

    @Autowired
    ProducTypeMapper producTypeMapper;

    public void insertProducType(ProducType productType){
        producTypeMapper.insertProducType(productType);
    }
    public ProducType findProducTypeByid(int id){
        return producTypeMapper.findProducTypeByid(id);
    }
}
