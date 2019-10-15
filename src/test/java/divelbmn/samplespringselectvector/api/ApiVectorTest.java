package divelbmn.samplespringselectvector.api;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiVectorTest {

    private final double RELATIVE_ERROR = .001d;

    private final String DIMENSIONS_COUNT_URL = "/vector/dimensions";
    private final String LENGTH_URL = "/vector/length";


    @Autowired
    private ApiVector apiVector;

    private MockMvc mockMvc;


    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(apiVector).build();
    }


    @Test
    public void vector1_dimension() throws Exception {
        MvcResult result = mockMvc.perform(
                post(DIMENSIONS_COUNT_URL)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"values\": [1.1]}"))
                .andReturn();

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
        assertEquals(1, Integer.parseInt(result.getResponse().getContentAsString()));
    }

    @Test
    public void vector1_length() throws Exception {
        MvcResult result = mockMvc.perform(
                post(LENGTH_URL)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"values\": [1.1]}"))
                .andReturn();

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
        assertEquals(1.1d, Double.parseDouble(result.getResponse().getContentAsString()), RELATIVE_ERROR);
    }

    @Test
    public void vector2_dimension() throws Exception {
        MvcResult result = mockMvc.perform(
                post(DIMENSIONS_COUNT_URL)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"values\": [1.2, 2.3]}"))
                .andReturn();

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
        assertEquals(2, Integer.parseInt(result.getResponse().getContentAsString()));
    }

    @Test
    public void vector2_length() throws Exception {
        MvcResult result = mockMvc.perform(
                post(LENGTH_URL)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"values\": [1.2, 2.3]}"))
                .andReturn();

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
        assertEquals(2.594d, Double.parseDouble(result.getResponse().getContentAsString()), RELATIVE_ERROR);
    }

    @Test
    public void vector3_dimension() throws Exception {
        MvcResult result = mockMvc.perform(
                post(DIMENSIONS_COUNT_URL)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"values\": [1.2, 2.3, 3.4]}"))
                .andReturn();

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
        assertEquals(3, Integer.parseInt(result.getResponse().getContentAsString()));
    }

    @Test
    public void vector3_length() throws Exception {
        MvcResult result = mockMvc.perform(
                post(LENGTH_URL)
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"values\": [1.2, 2.3, 3.4]}"))
                .andReturn();

        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
        assertEquals(4.277d, Double.parseDouble(result.getResponse().getContentAsString()), RELATIVE_ERROR);
    }
}