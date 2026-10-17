package cn.bugstack.test.domain;

import cn.bugstack.domain.strategy.service.armory.IStrategyArmory;
import cn.bugstack.infrastructure.persistent.dao.IStrategyAwardDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class StartegyArmoryTest {
    @Resource
    private IStrategyArmory strategyArmory;

    @Test
    public void test_strategyArmory(){
        strategyArmory.assembleLotteryStrategy(100002L);
    }

    @Test
    public void test_getAssembleRandomVal(){
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId(  100002L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId( 100002L));
        log.info("测试结果:{} - 奖品ID值", strategyArmory.getRandomAwardId( 100002L));
    }
}
