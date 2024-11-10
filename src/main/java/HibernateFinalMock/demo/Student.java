package HibernateFinalMock.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
    private int Sid;
	@Column(nullable = false)
	private String SName;
	@Lob
	private byte[] SImage;
	private String SDOB;
	@CreationTimestamp
	private Date oct;
	private double Spercentage;
}
