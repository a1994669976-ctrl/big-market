package cn.bugstack.domain.strategy.service.rule;

import cn.bugstack.domain.strategy.model.entity.RuleActionEntity;
import cn.bugstack.domain.strategy.model.entity.RuleMatterEntity;

/**
 * @author Mn
 * @description 抽奖规则过滤接口
 * @create 2026/10/21 14:11
 */
public interface ILogicFilter<T extends RuleActionEntity.RaffleEntity> {
    RuleActionEntity<T> filter(RuleMatterEntity ruleMatterEntity);
}
