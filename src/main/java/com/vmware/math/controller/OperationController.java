package com.vmware.math.controller;

import com.vmware.math.model.Input;
import com.vmware.math.model.Output;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Integer.parseInt;

@Slf4j
@RestController
public class OperationController {

    @PostMapping(value = "/api/add")
    public Output add(@RequestBody Input input){
        log.info("Add request received: " + input);
        return new Output(String.valueOf(parseInt(input.getX()) + parseInt(input.getY())));
    }

    @PostMapping(value = "/api/diff")
    public Output diff(@RequestBody Input input){
        return new Output(String.valueOf(parseInt(input.getX()) - parseInt(input.getY())));
    }
}
