package service.rest.api.model;

import javax.validation.constraints.*;
import java.time.LocalDateTime;

public record LiveStream(
        String id,
        @NotEmpty(message = "Stream title is required") String title,
        String description,
        String url,
        LocalDateTime startDate,
        LocalDateTime endDate)
{
    /*public LiveStream(String id, @NotEmpty(message = "Stream title is required")
    String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.url = url;
        this.startDate = startDate;
        this.endDate = endDate;
    }*/
}
