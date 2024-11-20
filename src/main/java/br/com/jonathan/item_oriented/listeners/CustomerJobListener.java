package br.com.jonathan.item_oriented.listeners;

import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class CustomerJobListener implements JobExecutionListener {

    private static final org.slf4j.Logger log = LoggerFactory.getLogger(CustomerJobListener.class);

    @Override
    public void beforeJob(JobExecution jobExecution) {
        log.info("Job iniciado: {}", jobExecution.getId());
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            log.info("Job concluido com sucesso!");
        }else{
            log.error("Job falhou");
        }
    }

}
