package com.assignment.pjp.assignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.pjp.assignment.exception.InvalidInputException;
import com.assignment.pjp.assignment.model.Action;
import com.assignment.pjp.assignment.repository.ActionRepository;

@Service
public class ActionService {
    @Autowired
    private ActionRepository actionRepository;

    public Action newAdd(Integer a, Integer b) throws InvalidInputException {
        if(0 <= a && 100 >= a && 0 <= b && 100 >= b) {
            Integer sum = Integer.valueOf(a+b);
            Action newAcion = new Action(a, b, sum);
            actionRepository.getActions().add(newAcion);
            return newAcion;
        }
        else throw new InvalidInputException("invalid input: check that input a and b are 0 <= x <= 100");
    }

    public Action[] searchAdd(Integer val, Boolean asc) throws InvalidInputException {
        if (val == null) {
            return actionRepository.getAllSorted(asc);
        }
        if (0 <= val && 100 >= val) {
            return actionRepository.search(val, asc);
        } else throw new InvalidInputException("invalid input: check that input val conforms to constraint 0 <= val <= 100");
        
    }
    
}
