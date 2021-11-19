package Assignments;

import java.util.concurrent.atomic.AtomicInteger;

public class Rooms extends Home{

    public static void main(String[] args) {
        int drawingRoomLights = 4;
        int bedRoomLights = 5;
        int guestRoomLights = 2;
        int allRooms = 0;
        allRooms = drawingRoomLights + bedRoomLights + guestRoomLights;

        Rooms room = new Rooms();
        room.noOfLights(drawingRoomLights);
        room.noOfLights(bedRoomLights);
        room.noOfLights(guestRoomLights);
        room.noOfLights(allRooms);

        }

    }

