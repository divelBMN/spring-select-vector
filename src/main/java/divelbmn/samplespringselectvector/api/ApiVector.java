package divelbmn.samplespringselectvector.api;

import divelbmn.samplespringselectvector.service.VectorService;
import divelbmn.samplespringselectvector.vector.VectorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vector")
public class ApiVector {

    private final VectorService service;


    @Autowired
    public ApiVector(VectorService service) {
        this.service = service;
    }


    @PostMapping("/dimensions")
    public Integer getDimensionsCount(@RequestBody VectorDao vectorDao) {
        return service.getDimensionsCount(vectorDao);
    }

    @PostMapping("/length")
    public Double getLength(@RequestBody VectorDao vectorDao) {
        return service.getLength(vectorDao);
    }
}
