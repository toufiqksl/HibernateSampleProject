package bean;

import java.sql.Blob;

public class User {
	private int id;
	private Blob publicKey;
	private String keyHandle;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Blob getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(Blob blob) {
		this.publicKey = blob;
	}
	public String getKeyHandle() {
		return keyHandle;
	}
	public void setKeyHandle(String keyHandle) {
		this.keyHandle = keyHandle;
	}


}
