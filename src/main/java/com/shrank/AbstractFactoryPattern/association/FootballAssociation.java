package com.shrank.AbstractFactoryPattern.association;

import com.shrank.AbstractFactoryPattern.coach.Coach;
import com.shrank.AbstractFactoryPattern.coach.FootballCoach;
import com.shrank.AbstractFactoryPattern.player.FootballPlayer;
import com.shrank.AbstractFactoryPattern.player.Player;

/**
 * @author shrank
 * @version 1.0
 * @description 具体工厂：足球协会，生产足球运动员
 * @date 2023/5/27 18:17
 */
public class FootballAssociation implements SportsAssociation {
    @Override
    public Player registerPlayer() {
        return new FootballPlayer();
    }



    @Override
    public Coach registerCoach() {
        return new FootballCoach();
    }
}
