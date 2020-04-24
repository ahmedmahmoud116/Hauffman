package pkj;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

       Compressor test = new Compressor("test_huffman.txt");
       test.compress("bla.txt");

       Decompressor dc = new Decompressor("bla.txt");
       dc.decompress();
       
      // System.out.println((char) -127);

    }
}
