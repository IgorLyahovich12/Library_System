package ua.edu.kneu.library_system.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ua.edu.kneu.library_system.entity.Message;
import ua.edu.kneu.library_system.service.MessageService;


@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class MainController {

    private final MessageService messageService;

    @GetMapping
    public Flux<Message> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "3") Long count) {
        return messageService.list();
    }

    @PostMapping
    public Mono<Message> create(@RequestBody Message message) {
        return messageService.addOne(message);
    }
}
