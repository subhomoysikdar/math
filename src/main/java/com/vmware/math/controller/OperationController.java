package com.vmware.math.controller;

import com.vmware.math.model.Input;
import com.vmware.math.model.Output;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OperationController {

    @PostMapping(value = "/api/add")
    public Output add(@RequestBody Input input){
        log.info(String.format("Add request received. X: %d and Y: %d", input.getX(), input.getY()));
        return new Output(String.valueOf(input.getX() + input.getY()));
    }

    @PostMapping(value = "/api/diff")
    public Output diff(@RequestBody Input input){
        log.info(String.format("Diff request received. X: %d and Y: %d", input.getX(), input.getY()));
        return new Output(String.valueOf(input.getX() - input.getY()));
    }
}
