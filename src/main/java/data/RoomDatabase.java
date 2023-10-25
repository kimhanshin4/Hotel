package data;

import domain.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomDatabase {
    private final List<Room> list = new ArrayList<>();

    public RoomDatabase() {
        list.add(new Room());
        list.add(new Room());
        list.add(new Room());
    }

    public Room findByIndex(int index) {
        return list.get(index);
    }
}
