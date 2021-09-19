package com.shy.service;

import com.shy.entity.Actor;
import com.shy.mapper.ActorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


public interface ActorService {
    Actor getActorById(int id);
    void modifyActor(Actor actor) throws Exception;
}
