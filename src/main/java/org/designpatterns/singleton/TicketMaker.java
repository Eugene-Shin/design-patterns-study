package org.designpatterns.singleton;

public class TicketMaker {
    private int ticket;
    private static TicketMaker ticketMaker = new TicketMaker(1000);

    private TicketMaker(int ticket) {
        this.ticket = ticket;
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    //상태 변경 메소드는 thread-safe 고려해야 함
    public synchronized int getNextTicketNumber() {
        return this.ticket++;
    }
}
