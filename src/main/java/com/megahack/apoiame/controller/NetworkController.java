package com.megahack.apoiame.controller;

import com.megahack.apoiame.model.Network;
import com.megahack.apoiame.repository.NetworkRepository;
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

  @PostMapping("/network")
  public Network createNetwork(@Valid @RequestBody Network network) {
    return networkRepository.save(network);
  }

  @GetMapping("/network")
  public List<Network> getAllNetwork() {
    return networkRepository.findAll();
  }

}
