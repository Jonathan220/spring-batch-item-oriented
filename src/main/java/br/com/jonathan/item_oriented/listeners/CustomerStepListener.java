package br.com.jonathan.item_oriented.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerStepListener implements StepExecutionListener{
    
    private static final Logger log = LoggerFactory.getLogger(CustomerStepListener.class);

    private long startTime;

    @Override
    public void beforeStep(StepExecution stepExecution) {
        startTime = System.currentTimeMillis();
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        long endTime = System.currentTimeMillis();
        log.info("Step {} levou {} ms para executar.", stepExecution.getStepName(), endTime - startTime);
        return stepExecution.getExitStatus();
    }
}
