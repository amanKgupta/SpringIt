package com.vega.springit.controller;

import com.vega.springit.domain.Link;
import com.vega.springit.repository.LinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/link")
public class LinkController {

    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    @GetMapping("/")
    public List<Link> list(){
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(Link link){
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id){
        return linkRepository.findById(id);
    }

    @PutMapping("/{id}")
    public  Link update(@PathVariable Long id,@PathVariable Link link){
        return linkRepository.save(link);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
          linkRepository.deleteById(id);
    }
}
