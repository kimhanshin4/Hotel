import java.io.IOException;

public class HotelMain {

    private static final HotelService hotelService = new HotelService();

    public static void main(String[] args) throws IOException {
        hotelService.init();
    }
}
