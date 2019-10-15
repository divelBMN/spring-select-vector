package divelbmn.samplespringselectvector.service;

import divelbmn.samplespringselectvector.config.VectorConfig;
import divelbmn.samplespringselectvector.vector.Vector;
import divelbmn.samplespringselectvector.vector.VectorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class VectorService {

    @Autowired
    ApplicationContext context = new AnnotationConfigApplicationContext(VectorConfig.class);


    public Integer getDimensionsCount(VectorDao vectorDao) {
        Vector vector = (Vector) context.getBean("vector", vectorDao);

        return vector.dimensionsCount();
    }
}
