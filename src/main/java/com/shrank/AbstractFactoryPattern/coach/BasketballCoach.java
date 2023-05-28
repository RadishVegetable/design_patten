package com.shrank.AbstractFactoryPattern.coach;

/**
 * @author shrank
 * @version 1.0
 * @description 具体角色：篮球教练
 * @date 2023/5/28 16:19
 */
public class BasketballCoach implements Coach{
    @Override
    public void training() {
        System.out.println("BasketballCoach training");
    }
}
