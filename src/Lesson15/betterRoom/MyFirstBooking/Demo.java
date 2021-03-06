package Lesson15.betterRoom.MyFirstBooking;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room room0 = new Room(123, 5000, 1, new Date(), "Kyiv", "Kyiv");
        Room room1 = new Room(124, 20000, 30, new Date(), "Dream", "Lviv");
        Room room2 = new Room(125, 2500, 5, new Date(), "Victoria", "Dnipro");
        Room room3 = new Room(126, 200, 4, new Date(), "Some", "Kyiv");


        Room[] rooms = {room0, room1, room2, null};

        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);

        GoogleAPI googleAPI = new GoogleAPI(rooms);

        BookingComAPI bookingComAPI = new BookingComAPI(rooms);

        API[] apis = {bookingComAPI, tripAdvisorAPI, googleAPI, bookingComAPI};


        Controller controller = new Controller(apis);

        System.out.println(Arrays.toString(tripAdvisorAPI.findRooms(2000, 3, "Lviv", "Dream")));


        System.out.println(Arrays.toString(bookingComAPI.findRooms(500, 1, "Kyiv", "Kyiv")));


        System.out.println(Arrays.toString(googleAPI.findRooms(500, 1, "Kyiv", "Kyiv")));

        System.out.println(Arrays.toString(bookingComAPI.getAl()));

        System.out.println(Arrays.toString(googleAPI.findRooms(500, 1, "Kyiv", "Kyiv")));

        System.out.println(Arrays.toString(bookingComAPI.findRooms(499, 1, "Kyiv", "Kyiv")));

        System.out.println(Arrays.toString(bookingComAPI.findRooms(3555, 88, "Some", "Some")));

        System.out.println(Arrays.toString(controller.check(googleAPI, tripAdvisorAPI)));

        System.out.println(controller.cheapestRoom());

        System.out.println(Arrays.toString(controller.requestRooms(5000, 1, "Kyiv", "Kyiv")));

        System.out.println();
        System.out.println(Arrays.toString(googleAPI.findRooms(200, 4, "Kyiv", "Some")));
        System.out.println(controller.cheapestRoom());

    }
}
