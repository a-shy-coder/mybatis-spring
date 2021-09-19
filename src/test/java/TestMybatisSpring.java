import com.shy.entity.Actor;
import com.shy.mapper.ActorMapper;
import com.shy.service.ActorService;
import com.shy.service.impl.ActorServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试 Spring 整合 Mybatis
 */
public class TestMybatisSpring {

    @Test
    public void testActorMapper(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 整合之后, 便可以直接getBean()获取XXXMapper
        ActorMapper actorMapper = (ActorMapper) applicationContext.getBean(ActorMapper.class);
        Actor actor = actorMapper.selectActorById(1);
        System.out.println(actor.toString());
        actor.setActorChineseName("吉米");
        actorMapper.updateActorById(actor);
        // 这里不需要提交事务, Druid连接池会默认提交事务
        // 在学习Spring事务管理之后, 我们会使用Spring来管理事务
    }

    /**
     * 测试事务控制
     */
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ActorService actorService = (ActorService) applicationContext.getBean("actorService");
        Actor actor = actorService.getActorById(1);
        System.out.println(actor.toString());
    }

    /**
     * 测试回滚策略
     */
    @Test
    public void test03() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
        ActorService actorService = (ActorService) applicationContext.getBean("actorService");
        Actor actor = actorService.getActorById(1);
        actor.setActorChineseName("鲍勃·奥登科克");
        actorService.modifyActor(actor);
    }
}
