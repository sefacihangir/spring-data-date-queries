package com.bawono.tutorial.springdata;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bawono.tutorial.springdata.model.Pemain;
import com.bawono.tutorial.springdata.repository.PemainRepository;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext context = SpringApplication.run(SpringDataApplication.class, args);
		PemainRepository pemainrepository = context.getBean(PemainRepository.class);
		Date tanggal = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1988");
		Date tanggalAkhir = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1992");
		System.out.println("Perintah Tanggal Lahir After");
		for (Pemain contohAfter : pemainrepository.findByTanggalLahirAfter(tanggal)) {
			System.out.println(contohAfter);
		}
		System.out.println("Perintah Tanggal Lahir Before");
		for (Pemain contohBefore : pemainrepository.findByTanggalLahirBefore(tanggal)) {
			System.out.println(contohBefore);
		}
		System.out.println("Perintah Tanggal Lahir Between");
		for (Pemain contohBeetween : pemainrepository.findByTanggalLahirBetween(tanggal, tanggalAkhir)) {
			System.out.println(contohBeetween);
		}

	}
}
