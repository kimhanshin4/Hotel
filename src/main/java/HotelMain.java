import java.io.IOException;

public class HotelMain {

    private static final HotelLounge hotelLounge = new HotelLounge();

    public static void main(String[] args) throws IOException {
        hotelLounge.init();
    }
}
