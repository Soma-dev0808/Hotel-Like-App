package com.hotel_like.hotellikeapplication.dto;

public interface ReservationInfo {

    public String getReservNo();

    public String getRoomType();

    public String getReservName();

    public String getUserId();

    public String getStartDate();

    public String getEndDate();

    public String getStayPeople();

    public String getPhoneNumber();

    public String getEmail();

    public String getRoomName();
    // JPA will understand that this is a getter method.
    // and it will use this method to get the value of column
}
