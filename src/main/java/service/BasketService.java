package service;

import data.BasketDatabase;
import data.RoomDatabase;
import domain.Room;

public class BasketService {

    private final BasketDatabase basketDatabase;
    private final RoomDatabase roomDatabase;

    public BasketService(BasketDatabase basketDatabase, RoomDatabase roomDatabase) {
        this.basketDatabase = basketDatabase;
        this.roomDatabase = roomDatabase;
    }

    /**
     * 장바구니에 방을 넣는 메소드
     *
     * @param num
     */
    public void pickRoom(int num) {
        Room room = roomDatabase.findByIndex(num - 1);
        basketDatabase.addRoom(room);
    }
}
