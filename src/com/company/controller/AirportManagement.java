package com.company.controller;

import com.company.task1.model.Flight;
import com.company.task1.model.Ticket;

import java.io.FileReader;
import java.io.FileWriter;

public class AirportManagement implements Management{
    private Flight[] flights = new Flight[10];
    private Ticket[] tickets = new Ticket[100];

    public void addNewFlight(Flight flight) {// метод добавить новые рейсы
                for (int i = 0; i < flights.length; i ++){ // перебираем массив рейсов
                if (flights[i] == null) { // если i-тая ячейка (flight) не заполненная(т.е. null)
                    flights[i] = flight; // то мы добавляем следующий рейс,т.е. заполняем
                    break; // останавливаем цикл
                }
            }
        }

    public void buyingTicketByFlightNumber();
        Ticket ticket = new Ticket(5, "UK", "06:00", "10:00", 7);// объявляем объект Тиккет
        boolean check = false; // по умолчанию наш чек равен нулю, т.е. false
        int number = 0;
             for (Flight flight : flights) { // перебираем массив рейсов
                 if (flight.getId() == number) { // получаем от пользователя номер рейса
                     for (int j = 0; j < tickets.length; j++) { // перебираем массив билетов
                         if (tickets[j] != null) {// если тиккет свободный
                             tickets[j] = ticket; // покупаем его
                             check = true;// чек истинный
                             break; // останавливаем цикл
                         }
                     }
                 }
                 if (check) {// если чек истинный
                     System.out.println("Ваш билет: " + ticket.getId()); // то вывести в консоль Вы купили билет
                 } else { // иначе
                     System.out.println("Билетов не осталось"); // вывести в консоль Билетов не осталось
                 }
             }

    @Override
    public void showAllFlights() {
        for (int i = 0; i < flights.length; i++) {
            if (flights[i] != null) {
                System.out.println(flights[i]);
            }
        }

    }

    @Override
    public void TicketInfo() throws Exception {
        FileWriter fw = new FileWriter("TicketInfo.txt");
        nFile.write("")
        fw.close();

        FileReader fr = new FileReader("TicketInfo.txt");
        fr.close();

    }






    @Override
    public void searchFlightByTicketNumber();


    }
}
