package ChatServer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Message {
	private String time;
	private String username;
	private String info;

	public Message(String username, String info) {
		super();
		this.username = username;
		this.info = info;

		DateFormat df = new SimpleDateFormat("HH:mm");
		time = df.format(Calendar.getInstance().getTime());
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public static void main(String[] args) {
		System.out.println(new Message("a", "b").getTime());
	}

}
