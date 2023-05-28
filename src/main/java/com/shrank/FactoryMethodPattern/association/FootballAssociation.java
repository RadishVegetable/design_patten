package com.shrank.FactoryMethodPattern.association;

import com.shrank.FactoryMethodPattern.player.FootballPlayer;
import com.shrank.FactoryMethodPattern.player.Player;

/**
 * @author shrank
 * @version 1.0
 * @description 具体工厂：足球协会，生产足球运动员
 * @date 2023/5/27 18:17
 */
public class FootballAssociation implements SportsAssociation{
    @Override
    public Player register() {
        return new FootballPlayer();
    }
}
