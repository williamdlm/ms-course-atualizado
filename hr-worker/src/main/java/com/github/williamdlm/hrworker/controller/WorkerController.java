package com.github.williamdlm.hrworker.controller;

import com.github.williamdlm.hrworker.model.Worker;
import com.github.williamdlm.hrworker.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workers")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerRepository workerRepository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> workerList = workerRepository.findAll();
        return ResponseEntity.ok(workerList);
    }

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Worker> findById(@PathVariable Long workerId){
        Worker worker = workerRepository.findById(workerId).get();
        return ResponseEntity.ok(worker);
    }


}
