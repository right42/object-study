package me.right42.example2;

public class PercentDiscountPolicy extends DiscountPolicy{

    private double percent;

    public PercentDiscountPolicy(double percent, DisCountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDisCountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
