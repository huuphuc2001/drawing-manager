package com.GSU24SE43.ConstructionDrawingManagement.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskChildCreateByHeadRequest {
//    UUID parentTask;
    UUID departmentId;
    UUID projectId;
    String title;
    String description;
    int priority;
    Date beginDate;
    Date endDate;
}
