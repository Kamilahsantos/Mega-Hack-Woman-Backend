package com.megahack.apoiame.controller;

import com.megahack.apoiame.model.Content;
import com.megahack.apoiame.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ContentController {

  @Autowired
  private ContentRepository contentRepository;

  @PostMapping("/content")
  public Content createContent(@Valid @RequestBody Content content) {
    return contentRepository.save(content);
  }

  @GetMapping("/content")
  public List<Content> getAllContent() {
    return contentRepository.findAll();
  }


}
