package me.right42.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DisCountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DisCountCondition ...conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening){
        for(DisCountCondition condition : conditions) {
            if(condition.isSatisFiedBy(screening)) {
                return getDisCountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    protected abstract Money getDisCountAmount(Screening screening);

}
