package com.shy.service.impl;

import com.shy.entity.Actor;
import com.shy.mapper.ActorMapper;
import com.shy.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

public class ActorServiceImpl implements ActorService {

    private ActorMapper actorMapper;

    public ActorMapper getActorMapper() {
        return actorMapper;
    }

    public void setActorMapper(ActorMapper actorMapper) {
        this.actorMapper = actorMapper;
    }

    @Transactional(isolation = Isolation.DEFAULT, propagation = Propagation.REQUIRED, timeout = 2, rollbackFor = {RuntimeException.class}, noRollbackFor = {Exception.class})
    @Override
    public Actor getActorById(int id) {
        Actor actor = actorMapper.selectActorById(id);
        return actor;
    }

    @Override
    public void modifyActor(Actor actor) throws Exception {
        actorMapper.updateActorById(actor);
        throw new Exception();
    }
}
