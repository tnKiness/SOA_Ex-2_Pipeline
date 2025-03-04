package com.example.pipelineex;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pipelineex.core.entities.Message;
import com.example.pipelineex.pipes.Pipeline;
import com.example.pipelineex.process.read.credit.CreditNoteReader;
import com.example.pipelineex.process.read.invoice.InvoiceReader;
import com.example.pipelineex.process.read.note.NoteReader;
import com.example.pipelineex.process.read.payment.PaymentReader;
import com.google.gson.Gson;

// @SpringBootApplication
public class Main {

	private static String readResourceFile(String fileName) {
		try {
			return new String(Main.class.getResourceAsStream(fileName).readAllBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String[] args) {
		Gson gson = new Gson();
		Message msg = gson.fromJson(readResourceFile("/order_data.json"), Message.class);
		System.out.println(msg);
		
		Pipeline pipeline = new Pipeline(new ArrayList<>(Arrays.asList(
			new CreditNoteReader(),
			new InvoiceReader(),
			new NoteReader(),
			new PaymentReader()
		)));
		pipeline.processFilters(msg);
		// SpringApplication.run(Main.class, args);
	}

}
