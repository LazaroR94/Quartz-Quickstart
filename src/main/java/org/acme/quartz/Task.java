package org.acme.quartz;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TASKS")
public class Task extends PanacheEntity {
    public Instant createdAt;

    public Task() {
        createdAt = Instant.now();
    }

    public Task(Instant time) {
        this.createdAt = time;
    }
}
