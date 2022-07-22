package service.rest.api.repository;

import org.springframework.stereotype.Component;
import service.rest.api.model.LiveStream;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class LiveStreamRepo {

    List<LiveStream> streams = new ArrayList<>();

    public LiveStreamRepo() {
        streams.add(new LiveStream(
                UUID.randomUUID().toString(),
                "Attempting to Build a REST API with Spring Boot",
                """
                           Spring Boot is highly useful for designing REST APIs since it allows you to start with minimum setup.
                           But there's always the possibility of difficulty. Join us for the upcoming IntelliJ IDEA Live Stream to discover how to avoid this issue in your project development.
                           I will demonstrate how to work with Spring Initializr while adhering to best standards this July.
                        """,
                "https://github.com/ChrisAyuk/REST_API.git",
                LocalDateTime.of(2022,7,21,11,0),
                LocalDateTime.of(2022,7,30,12,0)
        ));
    }

    public List<LiveStream> findAll() {
        return streams;
    }

    public LiveStream findById(String id) {
        return streams.stream().filter(stream -> stream.id().equals(id)).findFirst().orElse(null);
    }

    public LiveStream create(LiveStream stream) {
        streams.add(stream);
        return stream;
    }

    public void update(LiveStream stream, String id) {
        LiveStream existing = streams.stream().filter(s -> s.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Stream not found"));
        int i = streams.indexOf(existing);
        streams.set(i, stream);
    }

    public void delete(String id) {
        streams.removeIf(stream -> stream.id().equals(id));
    }
}
