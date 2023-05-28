package com.shrank.FactoryMethodPattern;

import com.shrank.FactoryMethodPattern.association.FootballAssociation;
import com.shrank.FactoryMethodPattern.association.SportsAssociation;
import com.shrank.FactoryMethodPattern.player.Player;

/**
 * @author shrank
 * @version 1.0
 * @description 具体使用：足球俱乐部，获取运动员
 * @date 2023/5/27 18:21
 */
public class FootballClub {
    public Player player1;
    public Player player2;

    /**
     * 测试。使用工厂（体育协会）生产角色（运动员）
     */
    public void init() {
        SportsAssociation sportsAssociation = new FootballAssociation();
        this.player1 = sportsAssociation.register();
        this.player2 = sportsAssociation.register();
    }
}
