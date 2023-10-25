package data;

import domain.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * 장바구니
 */
public class BasketDatabase {
    private final List<Room> list = new ArrayList<>();

    public void addRoom(Room room) {
        list.add(room);
    }

    public void removeRoom(int index) {
        list.remove(index);
    }

    public void clear() {
        list.clear();
    }
}
