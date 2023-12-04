package com.ejercicoRestController.controllers;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import com.ejercicioRestControllers.pojo.TextToJSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView test() {
        ModelAndView modelAndView = new ModelAndView("index.html");
        return modelAndView;
    }

    @GetMapping("/categories")
    public ModelAndView categories() {
        ModelAndView modelAndView = new ModelAndView("index2.html");
        return modelAndView;
    }

    @GetMapping("/support")
    public ModelAndView support() {
        ModelAndView modelAndView = new ModelAndView("index3.html");
        return modelAndView;
    }

    @GetMapping("/randomnum")
    @ResponseBody
    public ObjectNode testJsonRandomNum() {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode objectNode = mapper.createObjectNode();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);
        objectNode.put("value", randomNum);
        switch (randomNum) {
            case 1:
                throw new ResponseStatusException(HttpStatus.OK, "Salio un 1");
            case 0:
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Salio un 0");
            default:
                throw new IllegalArgumentException("Unexpected value: " + randomNum);
        }
    }
    
    // En un ejercicio nos piden realizar un metodo con dos endpoints 
    @RequestMapping(value={"/doubleendpointsone","/doubleendpointstwo"})
    @ResponseBody
	public String doubleEndpoint(){
		return "muestra lo mismo en los 2 endpoints";
	}
    
    // Metodo para indtroducir un parametro 
    @RequestMapping("/wellcome")
    @ResponseBody
    public String getPerson(@RequestParam(required=false, defaultValue ="desconocido") String name) {
		return "Wellcome "+ name;
	}
    
    
    // Metodo para indtroducir un parametro 
    @RequestMapping("/ejercicio259")
    @ResponseBody
    public ObjectNode getFullName(@RequestParam(required=false, defaultValue ="desconocido") String name, @RequestParam(required=false, defaultValue ="garcia") String surname) {
    	ObjectMapper mapper = new ObjectMapper();
        ObjectNode objectNode = mapper.createObjectNode();
        objectNode.put("name", name);
        objectNode.put("surname", surname);
        return objectNode;
	}
    
    
    @RequestMapping("/ejercicioParamsInfinitos")
    @ResponseBody
    public ObjectNode creaJSONMiembros(@RequestParam(required=false, defaultValue ="desconocido") Map<String, String> allParams) {

		ObjectMapper mapper = new ObjectMapper();
	    ObjectNode objectNode = mapper.createObjectNode();
	    // Recorrer los valores del mapa usando un bucle for
	    for (Map.Entry<String, String> entry : allParams.entrySet()) {
	        String paramName = entry.getKey();
	        String paramValue = entry.getValue();
	
			objectNode.put(paramName,paramValue);
	    }
	
		return objectNode;
    }

    @GetMapping("/categories/json")
    @ResponseBody
    @ResponseStatus(value=HttpStatus.I_AM_A_TEAPOT, reason="La bella y la bestia") // definimos la respuesta si es exitosa
    // Si la respuesta no es exitosa mandara el error correspondiente
    public TextToJSON testJson1() {
        return new TextToJSON("index.html");
    }
}
