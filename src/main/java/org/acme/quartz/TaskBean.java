package org.acme.quartz;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import io.quarkus.scheduler.Scheduled;
import io.smallrye.mutiny.Uni;

@ApplicationScoped
public class TaskBean {

    @Transactional
    @Scheduled(every = "10s", identity = "task-job")
    Uni<Void> schedule() {
        Task task = new Task();
        return task.persist().replaceWithVoid();
    }
}
