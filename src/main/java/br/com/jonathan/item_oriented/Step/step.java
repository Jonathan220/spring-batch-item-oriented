package br.com.jonathan.item_oriented.Step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;
import org.springframework.transaction.PlatformTransactionManager;

import br.com.jonathan.item_oriented.entities.Pokemon;
import br.com.jonathan.item_oriented.entities.dtos.PokemonDTO;
import br.com.jonathan.item_oriented.processor.PokemonItemProcessor;
import jakarta.persistence.EntityManagerFactory;

@Configuration
public class step {

    @Value("${spring.batch.endereco}")
    private String endereco;

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Bean
    public Step processarCSVStep(JobRepository jobRepository, PlatformTransactionManager transactionManager){
        return new StepBuilder("processarCSVStep", jobRepository)
        .<PokemonDTO, Pokemon>chunk(10, transactionManager)
        .reader(reader())
        .processor(processor())
        .writer(writer())
        .build();
    }

    public FlatFileItemReader<PokemonDTO> reader(){
        FlatFileItemReader<PokemonDTO> reader = new FlatFileItemReader<>();
        reader.setResource(new PathResource(endereco));
        reader.setLineMapper(new DefaultLineMapper<>() {{
                setLineTokenizer(new DelimitedLineTokenizer() {{
                    setNames(new String[]{"numero", "name", "type1", "type2", "hp", "attack", "defense", "spAttack", "spDefense", "speed", "generation", "legendary"});
                }});
                setFieldSetMapper(new BeanWrapperFieldSetMapper<PokemonDTO>(){{
                    setTargetType(PokemonDTO.class);
                }});
            }
        });
        return reader;
    }

    public PokemonItemProcessor processor(){
        return new PokemonItemProcessor();
    }

    public JpaItemWriter<Pokemon> writer(){
        JpaItemWriter<Pokemon> writer = new JpaItemWriter<>();
        writer.setEntityManagerFactory(entityManagerFactory);
        return writer;
    }
    
}
