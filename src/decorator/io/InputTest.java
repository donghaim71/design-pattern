package decorator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
  public static void main(String[] args) throws IOException {
    int c;

    try {
      InputStream in = new LowerCaseInputStream(
          new BufferedInputStream(new FileInputStream("resources/test.txt")));

      while ((c = in.read()) >= 0) {
        System.out.print((char) c);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
