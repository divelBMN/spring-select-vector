package divelbmn.samplespringselectvector.config;

import divelbmn.samplespringselectvector.vector.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class VectorConfig {

    @Bean(name = "vector")
    @Scope(value = "prototype")
    public Vector getVector(VectorDao dao) {

        switch (dao.getValues().size()) {
            case 1: return new Vector1(dao);
            case 2: return new Vector2(dao);
            case 3: return new Vector3(dao);
        }

        throw new IllegalArgumentException("wrong arguments count");
    }
}
