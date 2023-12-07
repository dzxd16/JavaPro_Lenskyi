package de.telran.HomeWork061212.Ex2;

import java.util.Set;
import java.util.TreeSet;

class BankService {
    private Set<Ticket> ticketSet = new TreeSet<>();

    public void registerClient(String Name, int birthYear, TypeOper operationType, float TimeOper) {
        Ticket ticket = new Ticket(Name, birthYear, operationType, TimeOper);
        ticketSet.add(ticket);
    }

    public void serviceClients() {
        for (Ticket ticket : ticketSet) {
            // Дополнительные условия обслуживания
            if (ticket.getOperationType()==TypeOper.DEPOSITING) {
                System.out.println("Клиент " + ticket.getFullName() + " с талоном " + ticket.getTicketNumber() +
                        " внесение вне очереди.");
            } else if (ticket.getBirthYear() <= 1958 && (ticket.getTimeOper() >=10 || ticket.getTimeOper() <= 12)) { // Пенсионный возраст
                System.out.println("Клиент " + ticket.getFullName() + " с талоном " + ticket.getTicketNumber() +
                        " обслуживается без очереди (пенсионный возраст).");
            } else {
                System.out.println("Клиент " + ticket.getFullName() + " с талоном " + ticket.getTicketNumber() +
                        " обслуживается в порядке очереди.");
            }
        }
    }


}
