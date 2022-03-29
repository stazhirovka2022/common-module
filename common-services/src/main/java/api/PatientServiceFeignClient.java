package api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "person-service")
public interface PatientServiceFeignClient {

    @GetMapping("/patient/{id}")
    List<Object> getPatient();
}
