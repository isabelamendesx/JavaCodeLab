package model.entities;

import model.exceptions.DomainException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    // "static" para que não seja feito uma cópia da formatação da data para cada post
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    Reservation(){}

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut){
        if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }


    public LocalDate getCheckOut() {
        return checkOut;
    }

    public long duration() {
        return ChronoUnit.DAYS.between(checkIn, checkOut);
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut){
        LocalDate now = LocalDate.now();
        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Reservation dates for updates must be future dates");
        }
        if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Room "
                + roomNumber
                + ", check-in: "
                + formatter.format(checkIn)
                + ", check-out: "
                + formatter.format(checkOut)
                + ", "
                + duration()
                + " nights";
    }



}
