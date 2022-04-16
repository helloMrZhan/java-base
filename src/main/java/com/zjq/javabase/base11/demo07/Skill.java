package com.zjq.javabase.base11.demo07;

/**
 * @author zjq
 */
public interface Skill {

    /**
     * 释放技能的抽象方法
     * @param name 英雄
     * @param skillType 技能类型
     */
    void use(String name,String skillType);
}
