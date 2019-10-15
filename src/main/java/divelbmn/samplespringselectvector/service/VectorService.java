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


    public Integer getDimensionsCount(VectorDao dao) {
        return vector(dao).dimensionsCount();
    }

    public Double getLength(VectorDao dao) {
        return vector(dao).length();
    }


    private Vector vector(VectorDao dao) {
        return (Vector) context.getBean("vector", dao);
    }
}
