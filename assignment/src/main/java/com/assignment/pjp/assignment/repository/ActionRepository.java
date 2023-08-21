package com.assignment.pjp.assignment.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.assignment.pjp.assignment.model.Action;

import lombok.Data;

@Data
@Repository
public class ActionRepository {
    private ArrayList<Action> actions = new ArrayList<Action>();
}
