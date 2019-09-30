package stream;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIOTest {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Stream<String> linha = Files.lines(Paths.get("teste.txt"),
		 * Charset.defaultCharset()); System.out.println(linha);
		 */
		Stream<Integer> num = Stream.of(2,2,3,4,5);
		System.out.println(num.findAny());
		
		IntStream num2 = Arrays.stream(new int[] {1,2,3,10});
		System.out.println(num2.count());
	}
}
