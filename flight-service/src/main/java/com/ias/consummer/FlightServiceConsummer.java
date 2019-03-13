package com.ias.consummer;

import com.ias.producer.FlightServiceProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageListener;

public class FlightServiceConsummer implements MessageListener {

    @Autowired
    private FlightServiceProducer flightServiceProducer;

    @Resource(name = "producerDestinationQeuue")
    public Destination producerDestinationQeuue;

    private Destination destination;
    @Override
    public void onMessage(Message message) {

        System.out.println("1234567");

        flightServiceProducer.sendMessage(producerDestinationQeuue, "7654321");

    }
}
