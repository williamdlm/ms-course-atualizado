package com.github.williamdlm.hrpayroll.feignclient;

import com.github.williamdlm.hrpayroll.model.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClient {
    @GetMapping(value = "/{workerId}")
    ResponseEntity<Worker> findById(@PathVariable Long workerId);
}
