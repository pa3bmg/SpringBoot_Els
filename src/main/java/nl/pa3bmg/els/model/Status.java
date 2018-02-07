package nl.pa3bmg.els.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Getter;
import lombok.Setter;

@Document(indexName = "ssss", type = "InfraDevice")
public class Status {
	@Id
    @Getter @Setter private String id;
	@Getter @Setter private long TimeStamp;
	@Getter @Setter private String DeviceName;
	@Getter @Setter private String DeviceIp;
	@Getter @Setter private int Health;
	@Getter @Setter private int Condition;
	@Getter @Setter private int ContactStatus;
	@Getter @Setter private String SoutceName;
	
	public Status() {
		
	}
	
	public Status(String DeviceName, String deviceIp, int health, int condition, int contactStatus, String soutceName) {
		this.DeviceName = DeviceName;
		this.DeviceIp = deviceIp;
		this.Health = health;
		this.Condition = condition;
		this.ContactStatus = contactStatus;
		this.SoutceName = soutceName;
	}
}
