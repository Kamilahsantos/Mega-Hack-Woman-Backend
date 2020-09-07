package com.megahack.apoiame.controller;

import com.megahack.apoiame.model.Network;
import com.megahack.apoiame.repository.NetworkRepository;
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
public class NetworkController {

  @Autowired
  private NetworkRepository networkRepository;

  @ApiOperation(value = "Create a new network information ")
  @ApiResponses(value = {
    @ApiResponse(code = 201, message = "successfully network information created"),
    @ApiResponse(code = 500, message = "an internal error occurred, it was not possible to complete this request")
  }
  )
  @PostMapping("/network")
  public Network createNetwork(@Valid @RequestBody Network network) {
    return networkRepository.save(network);
  }

  @ApiOperation(value = "List all network information in this region")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "successfully get all network informations "),
    @ApiResponse(code = 500, message = "an internal error occurred, it was not possible to complete this request")
  }
  )
  @GetMapping("/network")
  public List<Network> getAllNetwork() {
    return networkRepository.findAll();
  }

}
