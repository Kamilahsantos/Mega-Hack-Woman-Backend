package com.megahack.apoiame.controller;

import com.megahack.apoiame.model.Content;
import com.megahack.apoiame.repository.ContentRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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

  @ApiOperation(value = "Create a new content on our API ")
  @ApiResponses(value = {
    @ApiResponse(code = 201, message = "successfully content created"),
    @ApiResponse(code = 500, message = "an internal error occurred, it was not possible to complete this request")
  }
  )
  @PostMapping("/content")
  public Content createContent(@Valid @RequestBody Content content) {
    return contentRepository.save(content);
  }


  @ApiOperation(value = "List all contents in our API")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "successfully get all contents "),
    @ApiResponse(code = 500, message = "an internal error occurred, it was not possible to complete this request")
  }
  )
  @GetMapping("/content")
  public List<Content> getAllContent() {
    return contentRepository.findAll();
  }


}
