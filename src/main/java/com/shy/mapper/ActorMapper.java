package com.shy.mapper;

import com.shy.entity.Actor;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface ActorMapper {

    public List<Actor> selectActorListByColumnAndOrder(@Param("column") String column, @Param("order") String order);

    public List<Actor> selectActorList();

    @MapKey("ActorId")
    public Map<Integer,Actor> selectActorMap();

    public Actor selectActorById(int id);


    public List<Actor> selectActorByRowBounds(RowBounds rowBounds);


    public void updateActorByMap(@Param("actorMap") Map actorMap);

    public void updateActorById(Actor actor);

}
