package com.shrank.FactoryMethodPattern.association;

import com.shrank.FactoryMethodPattern.player.Player;

/**
 * @author shrank
 * @version 1.0
 * @description 抽象工厂：体育协会，用于注册运动员，就是生产运动员
 * @date 2023/5/27 18:16
 */

public interface SportsAssociation {
    /**
     * 注册运动员
     * @return
     */
    public Player register();
}
