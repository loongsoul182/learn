package com.darwinsciencetechnology.mapper;

import com.darwinsciencetechnology.model.ProducType;

public interface ProducTypeMapper {
    public void insertProducType(ProducType productType);
    public ProducType findProducTypeByid(int id);
}
