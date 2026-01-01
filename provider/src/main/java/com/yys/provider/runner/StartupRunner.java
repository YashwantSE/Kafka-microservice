package com.yys.provider.runner;

import com.yys.provider.producer.c1Producer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {
    private final c1Producer c1Producer;

    public StartupRunner(com.yys.provider.producer.c1Producer c1Producer) {
        this.c1Producer = c1Producer;
    }

    @Override
    public void run(String... args) throws Exception {
        c1Producer.sendMessage();
    }
}
