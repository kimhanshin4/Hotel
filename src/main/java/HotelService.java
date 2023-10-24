import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HotelService {

    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    private int getInputNumber() throws IOException {
        st = new StringTokenizer(br.readLine());

        try {
            return Integer.parseInt(st.nextToken());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public void init() throws IOException {
        System.out.println("[ 뇌정지 호텔 ]");
        System.out.println("1. 로그인\t2. 회원가입");
        int pick = getInputNumber();
        if (pick != 1 && pick != 2) {
            throw new IllegalArgumentException();
        }
    }
}
