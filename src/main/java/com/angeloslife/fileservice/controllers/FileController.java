package com.angeloslife.fileservice.controllers;

import com.angeloslife.fileservice.entities.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/file")
public class FileController {

    @GetMapping("/{fileId}")
    public ResponseEntity<?> getFile(@PathVariable String fileId) {
        // get the file from the DB and return it
        HashMap<String, String> response =  new HashMap<>();
        response.put("Name", "Pupazzo di neve");
        response.put("Description", "Un bellissimo pupazzo di neve");
        return ResponseEntity
                .ok(response);
    }

    @PostMapping("/path")
    public void handlePostRequest(@RequestBody FileEntity fileEntity) {
        // insert the file into the DB
    }

}
