package com.shrank.AbstractFactoryPattern;

import com.shrank.AbstractFactoryPattern.association.FootballAssociation;
import com.shrank.AbstractFactoryPattern.association.SportsAssociation;
import com.shrank.AbstractFactoryPattern.coach.Coach;
import com.shrank.AbstractFactoryPattern.player.Player;

/**
 * @author shrank
 * @version 1.0
 * @description 具体使用：足球俱乐部，获取运动员
 * @date 2023/5/27 18:21
 */
public class FootballClub {
    public Player player1;
    public Player player2;

    public Coach coach1;

    /**
     * 测试。使用工厂（体育协会）生产角色（运动员）
     */
    public void init() {
        SportsAssociation sportsAssociation = new FootballAssociation();
        this.player1 = sportsAssociation.registerPlayer();
        this.player2 = sportsAssociation.registerPlayer();
        this.coach1 = sportsAssociation.registerCoach();
    }
}
