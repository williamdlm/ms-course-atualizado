package com.github.williamdlm.hrworker.repository;

import com.github.williamdlm.hrworker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Worker,Long> {
}
