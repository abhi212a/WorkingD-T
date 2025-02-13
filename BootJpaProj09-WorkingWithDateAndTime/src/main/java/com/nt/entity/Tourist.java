package com.nt.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tourist implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer tid;
	@Column(length=25)
	private String tname;
	@Column(length=25)
	private String taddrs;
	private LocalDateTime dob;
	private LocalDate doj;
	private LocalTime toj;
	public int getTid() {
		// TODO Auto-generated method stub
		return 0;
	}
    public Tourist(String name, String address, LocalDateTime dateTime, LocalDate date, LocalTime time) {
        this.tname = name;
        this.taddrs = address;
        this.dob = dateTime;
        this.doj = date;
        this.toj = time;
    }


}
