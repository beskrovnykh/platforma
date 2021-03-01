package com.scoltech.platforma;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
public class ObjectController {
    @PostMapping(value = "/api/save")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveAll(@RequestBody ObjectListDto objects) {
        throw new UnsupportedOperationException();
    }

    @GetMapping(value = "/api/history")
    @ResponseStatus(code = HttpStatus.OK)
    public ObjectListDto getHistory(@RequestParam Long id,
                                    @RequestParam Timestamp from,
                                    @RequestParam Timestamp to) {
        throw new UnsupportedOperationException();
    }

    @GetMapping(value = "/api/latest")
    @ResponseStatus(code = HttpStatus.OK)
    public ObjectDto getLatest(@RequestParam Long id) {
        throw new UnsupportedOperationException();
    }

    @GetMapping(value = "/api/avg")
    @ResponseStatus(code = HttpStatus.OK)
    public ObjectListDto getAverage() {
        throw new UnsupportedOperationException();
    }
}
