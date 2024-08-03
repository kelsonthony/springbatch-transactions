package com.kelsonthony.springbatchtransactions.step;

import com.kelsonthony.springbatchtransactions.model.Pessoa;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class PessoaStep {

    private final StepBuilderFactory stepBuilderFactory;


    private final PlatformTransactionManager transactionManager;

    public PessoaStep(StepBuilderFactory stepBuilderFactory,
                      @Qualifier("transactionManagerApp") PlatformTransactionManager transactionManager) {
        this.stepBuilderFactory = stepBuilderFactory;
        this.transactionManager = transactionManager;
    }

    @Bean
    public Step step(ItemReader<Pessoa> reader, ItemWriter<Pessoa> writer) {
        return stepBuilderFactory
                .get("step")
                .<Pessoa, Pessoa>chunk(200)
                .reader(reader)
                .writer(writer)
                .transactionManager(transactionManager)
                .build();
    }
}
