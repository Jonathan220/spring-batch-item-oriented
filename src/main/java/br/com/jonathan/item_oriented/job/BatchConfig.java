package br.com.jonathan.item_oriented.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import br.com.jonathan.item_oriented.listeners.CustomerJobListener;

@Configuration
public class BatchConfig {

    @Autowired
    CustomerJobListener customerJobListener;
    
    private final JobRepository jobRepository;
    private final PlatformTransactionManager transactionManager;

    public BatchConfig(JobRepository jobRepository, PlatformTransactionManager transactionManager){
        this.jobRepository = jobRepository;
        this.transactionManager = transactionManager;
    }

    @Bean
    public Job processarCSVJob(Step processarCsvStep){
        return new JobBuilder("processarCSV", jobRepository)
        .start(processarCsvStep)
        .incrementer(new RunIdIncrementer())
        .listener(customerJobListener)
        .build();
    }
}
