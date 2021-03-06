package Lesson15.betterRoom.MyFirstBooking;

import java.util.Date;
import java.util.Objects;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String HotelName;
    private String cityName;

    public Room(long id,
                int price,
                int persons,
                Date dateAvailableFrom,
                String hotelName,
                String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        HotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", HotelName='" + HotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return HotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return id == room.id
                && price == room.price
                && persons == room.persons
                && HotelName.equals(room.HotelName)
                && cityName.equals(room.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, persons, HotelName, cityName);
    }
}
