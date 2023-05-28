package com.shrank.AbstractFactoryPattern.player;

/**
 * @author shrank
 * @version 1.0
 * @description 具体角色：足球运动员
 * @date 2023/5/27 18:13
 */
public class FootballPlayer implements Player {

    @Override
    public void run() {
        System.out.println("FootballPlayer run!!");
    }

    @Override
    public void jump() {
        System.out.println("FootballPlayer jump!!");
    }
}
