package com.darwinsciencetechnology.control;

import com.darwinsciencetechnology.model.ProducType;
import com.darwinsciencetechnology.service.ProducTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProducTypeControl {



    @Autowired
    ProducTypeService producTypeService;


    @RequestMapping(value = "/insertProducType",method = RequestMethod.POST)
    public void insertProducType(ProducType productType){
        producTypeService.insertProducType(productType);
    }

    @RequestMapping(value = "/findProducTypeByid",method = RequestMethod.GET)
    public String findProducTypeByid(int id, Model model){
        ProducType producType = producTypeService.findProducTypeByid(id);
        if(producType == null){
            producType = new ProducType();
            producType.setId(0);
        }
        model.addAttribute("producType",producType);
        return "productypeadd";
    }
}
