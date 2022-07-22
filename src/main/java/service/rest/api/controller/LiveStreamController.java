package service.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id){
        return streamRepo.findById(id);
    }
}
