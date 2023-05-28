package com.shrank.AbstractFactoryPattern.association;

import com.shrank.AbstractFactoryPattern.coach.BasketballCoach;
import com.shrank.AbstractFactoryPattern.coach.Coach;
import com.shrank.AbstractFactoryPattern.player.BasketballPlayer;
import com.shrank.AbstractFactoryPattern.player.Player;

/**
 * @author shrank
 * @version 1.0
 * @description 具体工厂：足球协会，生产足球运动员
 * @date 2023/5/27 18:19
 */
public class BasketballAssociation implements SportsAssociation {
    @Override
    public Player registerPlayer() {
        return new BasketballPlayer();
    }


    @Override
    public Coach registerCoach() {
        return new BasketballCoach();
    }
}
