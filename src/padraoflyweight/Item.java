package padraoflyweight;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Item implements Serializable {

	//@Transient
	private StatusItem statusItem;
	private String produto;
	
	public StatusItem getStatusItem() {
		return statusItem;
	}

	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(statusItem.getNome());
	}
	
	public void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String status = ois.readObject().toString();
		this.statusItem = FabricaStatusItem.getInstance().get(status);
	}
}
