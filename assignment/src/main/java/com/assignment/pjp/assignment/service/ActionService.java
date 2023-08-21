package com.assignment.pjp.assignment.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.pjp.assignment.model.Action;
import com.assignment.pjp.assignment.repository.ActionRepository;

@Service
public class ActionService {
    @Autowired
    private ActionRepository actionRepository;

    public Action newAdd(Integer a, Integer b) {
        Integer sum = Integer.valueOf(a+b);
        Action newAcion = new Action(a, b, sum);
        actionRepository.getActions().add(newAcion);
        return newAcion;
    }

    public ArrayList<Action> searchAdd(Integer val, Boolean asc) {
        return actionRepository.getActions();
    }
    
}
