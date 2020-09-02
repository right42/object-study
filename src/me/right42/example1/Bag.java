package me.right42.example1;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;


    public Bag(Long amount) {
        this(amount, null);
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    private boolean hasInvitation(){
        return this.invitation != null;
    }

    private boolean hasTicket(){
        return ticket != null;
    }

    public Long hold(Ticket ticket) {
        if (this.hasInvitation()) {
            this.ticket = ticket;
            return 0L;
        } else {
            Long ticketPrice = ticket.getFee();
            this.ticket = ticket;
            this.minusAmount(ticketPrice);
            return ticketPrice;
        }
    }

    private void minusAmount(Long ticketPrice) {
        this.amount -= ticketPrice;
    }

}
