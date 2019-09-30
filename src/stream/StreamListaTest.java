package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamListaTest {

	public static void main(String[] args) {
		
		List<String> teste = new ArrayList<>();
		teste.add("romario");
		teste.add("bebeto");
		teste.add("rai");
		
		Stream<String> streamTest = teste.stream();
		System.out.println(streamTest.count());
	}
}
