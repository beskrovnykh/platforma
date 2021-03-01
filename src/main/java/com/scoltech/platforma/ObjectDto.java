package com.scoltech.platforma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ObjectDto {
    private Long objectId;
    private Long sensorId;
    private Long time; // epoch time in seconds
    private Double value;
}
