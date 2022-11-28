package org.acme.quartz;

import io.smallrye.mutiny.Uni;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/tasks")
public class TaskResource {

    @GET
    public Uni<List<Task>> listAll() {
        return Task.listAll();
    }
}
