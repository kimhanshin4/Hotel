package io.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputView {
    private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private StringTokenizer st;

    public int getInputNumber() throws IOException {
        st = new StringTokenizer(br.readLine());

        try {
            return Integer.parseInt(st.nextToken());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
