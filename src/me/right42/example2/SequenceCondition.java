package me.right42.example2;

public class SequenceCondition implements DisCountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisFiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}
