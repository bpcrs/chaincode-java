package fpt.edu.bpcrs.contract;

import java.time.LocalDateTime;

public class Contract {
    private int accountRenter;
    private int accountLessor;
    private int carId;
    private double price;
    private LocalDateTime createdTime;
    private int bookingId;
    private Agreement agreement;
    private StatusEnum status;
    private double distance;
}
