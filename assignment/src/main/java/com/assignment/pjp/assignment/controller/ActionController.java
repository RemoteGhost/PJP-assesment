package com.assignment.pjp.assignment.controller;

import org.springframework.web.bind.annotation.RestController;

import com.assignment.pjp.assignment.exception.InvalidInputException;
import com.assignment.pjp.assignment.model.Action;
import com.assignment.pjp.assignment.service.ActionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ActionController {
    @Autowired
    private ActionService actionService;

    
    @GetMapping(value="/sum")
    public Action getMethodName(@RequestParam Integer a, @RequestParam Integer b) throws InvalidInputException {
        return actionService.newAdd(a, b);
    }

    @GetMapping(value="/search")
    public Action[] getMethodName(@RequestParam(required = false) Integer val, @RequestParam Boolean asc) throws InvalidInputException {
        Action[] actions = actionService.searchAdd(val, asc);
        return actions;
    }
    
    
    
}
