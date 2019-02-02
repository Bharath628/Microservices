package com.techfreak.imageservice.controller;

import com.techfreak.imageservice.model.Image;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class ImageController {

    @GetMapping("/images")
    public List<Image> getImageList(){
        List<Image> images = Stream.of(
                new Image(1, "https://www.imdb.com/title/tt0096697/mediaviewer/rm3842005760"),
                new Image(2, "https://www.imdb.com/title/tt0096697/mediaviewer/rm3698134272"),
                new Image(3, "https://www.imdb.com/title/tt0096697/mediaviewer/rm1445594112")
        ).collect(Collectors.toList());

        return images;
    }
}
