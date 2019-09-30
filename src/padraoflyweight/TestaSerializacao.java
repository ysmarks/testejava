package padraoflyweight;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestaSerializacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		Item t1 = new Item();
		t1.setProduto("Livro ysmarks ensinando spring");
		t1.setStatusItem(FabricaStatusItem.getInstance().get("Pago"));
		
		Item t2 = (Item) copiarPorSerializacao(t1);
		if(t1.getStatusItem() == t2.getStatusItem()) {
			System.out.println("Mesma instancia");
		}
	}

	public static Serializable copiarPorSerializacao(Serializable o) throws IOException, ClassNotFoundException {

		ObjectOutputStream outputStream = null;
		ObjectInputStream inputStream = null;

		try {
			ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
			outputStream = new ObjectOutputStream(arrayOutputStream);
			outputStream.writeObject(o);
			outputStream.flush();
			byte[] byteArray = arrayOutputStream.toByteArray();
			ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(byteArray);
			inputStream = new ObjectInputStream(arrayInputStream);
			return (Serializable) inputStream.readObject();
		} finally {
			outputStream.close();
			inputStream.close();
		}
	}
}
