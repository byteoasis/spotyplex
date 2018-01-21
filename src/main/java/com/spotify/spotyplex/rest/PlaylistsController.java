package com.spotify.spotyplex.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaylistsController {

    @RequestMapping(value = "/playlists")
    public String getPlaylists() {
        return "Test";
    }

}
