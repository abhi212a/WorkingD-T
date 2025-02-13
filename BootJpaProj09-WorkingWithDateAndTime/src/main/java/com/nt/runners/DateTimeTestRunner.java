package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.ITouristRepository;
import com.nt.service.ITouristMgmtService;
import com.nt.entity.Tourist;

@Component
public class DateTimeTestRunner implements CommandLineRunner {

    @Autowired
    private ITouristMgmtService touristService;

    @Override
    public void run(String... args) throws Exception {
       /* try {
            Tourist trst = new Tourist("raja", "hyd", LocalDateTime.of(1990, 10, 20, 20, 10, 20),
                    LocalDate.of(2024, 2, 10),
                    LocalTime.of(16, 10, 20));
            String msg = touristService.registerTourist(trst);
            System.out.println(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    	/*try {
    		touristService.getAllTourists().forEach(System.out::println);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}*/
    	try {
    		System.out.println("Person age::"+touristService.showTouristAgeTid(1));
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}