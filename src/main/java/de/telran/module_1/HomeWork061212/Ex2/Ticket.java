package de.telran.HomeWork061212.Ex2;

class Ticket implements Comparable<Ticket> {
    private static int counter = 0;

    private int ticketNumber;
    private String Name;
    private int birthYear;
    private TypeOper operationType;
    private float TimeOper;

    public float getTimeOper() {
        return TimeOper;
    }

    public void setTimeOper(float timeOper) {
        TimeOper = timeOper;
    }

    public Ticket(String fullName, int birthYear, TypeOper operationType, float timeOper) {
        this.ticketNumber = ++counter;
        this.Name = fullName;
        this.birthYear = birthYear;
        this.operationType = operationType;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getFullName() {
        return Name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public TypeOper getOperationType() {
        return operationType;
    }

    @Override
    public int compareTo(Ticket ticket) {
        return Integer.compare(this.ticketNumber, ticket.ticketNumber);
    }
}

