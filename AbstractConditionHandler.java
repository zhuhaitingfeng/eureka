package com.refordom.roleplay.base.service.condition;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import java.util.Map;

/**
 * <p></p>
 *
 * @date 2018/9/25 18:22
 */
public abstract class AbstractConditionHandler<T> implements ConditionProvider<T> {

    @Override
    public void opExecute(EntityWrapper<T> entityWrapper, Map<String, String[]> requestMap) {
        if (isHandler(requestMap)) {
            execute(entityWrapper, requestMap);
        }
    }

    abstract boolean isHandler(Map requestMap);

    abstract void execute(EntityWrapper<T> entityWrapper, Map requestMap);
}
