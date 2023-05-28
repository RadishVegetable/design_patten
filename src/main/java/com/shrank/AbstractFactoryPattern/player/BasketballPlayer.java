package com.shrank.AbstractFactoryPattern.player;

/**
 * @author shrank
 * @version 1.0
 * @description 具体角色：篮球运动员
 * @date 2023/5/27 18:14
 */
public class BasketballPlayer implements Player {
    @Override
    public void run() {
        System.out.println("BasketballPlayer run!!");
    }

    @Override
    public void jump() {
        System.out.println("BasketballPlayer jump!!");
    }
}
