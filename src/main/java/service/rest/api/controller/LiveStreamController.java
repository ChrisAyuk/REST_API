package service.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.rest.api.model.LiveStream;
import service.rest.api.repository.LiveStreamRepo;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    @Autowired
    private final LiveStreamRepo streamRepo;

    public LiveStreamController(LiveStreamRepo streamRepo) {
        this.streamRepo = streamRepo;
    }

    // Get all streams from http://localhost:9000/streams
    @GetMapping
    public List<LiveStream> findAll(){
        return streamRepo.findAll();
    }

    // Get all streams by id from http://localhost:9000/streams{id}
    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id){
        return streamRepo.findById(id);
    }

    // Post a streams to http://localhost:9000/streams
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@RequestBody LiveStream stream) {
        return streamRepo.create(stream);
    }
}
