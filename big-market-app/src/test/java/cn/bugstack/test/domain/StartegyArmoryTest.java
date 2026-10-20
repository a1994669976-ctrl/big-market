package cn.bugstack.test.domain;

import cn.bugstack.domain.strategy.service.armory.IStrategyArmory;
import cn.bugstack.domain.strategy.service.armory.IStrategyDispatch;
import cn.bugstack.infrastructure.persistent.dao.IStrategyAwardDao;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
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
    @Resource
    private IStrategyDispatch strategyDispatch;

    @Before
    public void test_strategyArmory(){
        strategyArmory.assembleLotteryStrategy(100001L);
    }

    @Test
    public void test_getAssembleRandomVal(){
        log.info("测试结果:{} - 奖品ID值", strategyDispatch.getRandomAwardId(  100001L));
    }
    @Test
    public void test_getAssembleRandomVal_ruleWeightValue(){
        log.info("测试结果:{} - 60策略配置", strategyDispatch.getRandomAwardId(100001L, "60:102,103,104,105"));
        log.info("测试结果:{} - 200策略配置", strategyDispatch.getRandomAwardId(100001L, "200:106,107"));
        log.info("测试结果:{} - 1000策略配置", strategyDispatch.getRandomAwardId(100001L, "1000:105"));
    }
}
