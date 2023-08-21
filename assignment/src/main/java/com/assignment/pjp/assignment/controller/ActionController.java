package com.assignment.pjp.assignment.controller;

import org.springframework.web.bind.annotation.RestController;

import com.assignment.pjp.assignment.model.Action;
import com.assignment.pjp.assignment.service.ActionService;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ActionController {
    @Autowired
    private ActionService actionService;


    @GetMapping(value="/sum")
    public Action getMethodName(@RequestParam Integer a, @RequestParam Integer b) {
        return actionService.newAdd(a, b);
    }

    @GetMapping(value="/search")
    public ArrayList<Action> getMethodName(@RequestParam(required = false) Integer val, @RequestParam Boolean asc) {
        ArrayList<Action> actions = actionService.searchAdd(val, asc);
        return actions;
    }
    
    
    
}
