package service.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.rest.api.model.LiveStream;
import service.rest.api.repository.LiveStreamRepo;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    @Autowired
    private final LiveStreamRepo streamRepo;

    public LiveStreamController(LiveStreamRepo streamRepo) {
        this.streamRepo = streamRepo;
    }

    // Get streams http://localhost:9000/streams
    @GetMapping
    public List<LiveStream> listStreams(){
        return streamRepo.findAll();
    }
}
