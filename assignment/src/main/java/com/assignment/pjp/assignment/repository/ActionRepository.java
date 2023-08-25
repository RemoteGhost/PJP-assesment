package com.assignment.pjp.assignment.repository;


import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.assignment.pjp.assignment.model.Action;

import lombok.Data;

@Data
@Repository
public class ActionRepository {
    private final CopyOnWriteArrayList<Action> actions = new CopyOnWriteArrayList<Action>();

    public Action add(Action action) {
        this.actions.add(action);
        return action;
    }

    public Action[] search(Integer val, Boolean asc) {
        Stream<Action> actionStream = actions.stream().filter((Action a)->  a.getA().equals(val) || a.getB().equals(val) || a.getSum().equals(val));
        if(asc) {
            return  actionStream.sorted(Comparator.comparing(Action::getSum)).toArray(Action[]::new);
        }
        else return actionStream.sorted(Comparator.comparing(Action::getSum).reversed()).toArray(Action[]::new);
    }

    public Action[] getAllSorted(Boolean asc) {
        if (asc) {
            return actions.stream().sorted(Comparator.comparing(Action::getSum)).toArray(Action[]::new);
        } else return actions.stream().sorted(Comparator.comparing(Action::getSum).reversed()).toArray(Action[]::new);
    }


}
