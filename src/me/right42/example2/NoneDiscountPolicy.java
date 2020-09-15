package me.right42.example2;

public class NoneDiscountPolicy extends DiscountPolicy{

    @Override
    protected Money getDisCountAmount(Screening screening) {
        return Money.ZERO;
    }
}
