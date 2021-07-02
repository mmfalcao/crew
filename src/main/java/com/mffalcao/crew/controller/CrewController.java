package com.mffalcao.crew.controller;

import com.mffalcao.crew.model.CrewRequest;
import com.mffalcao.crew.model.CrewResponse;
import com.mffalcao.crew.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/crew")
public class CrewController {

    @PostMapping()
    ResponseEntity<Response> createCrew(@RequestBody CrewRequest newCrew) {

        Response response = new Response("OK", 200);

        return ResponseEntity.status(HttpStatus.OK)
                .body(response);
    }

    @GetMapping("/{id}")
    ResponseEntity<CrewResponse> getCrew(@PathVariable Long id) {

        CrewResponse crewResponse = new CrewResponse();
        crewResponse.setCrewId(1L);
        crewResponse.setCrewName("Caronte");
        crewResponse.setCrewOwner("Hades");
        crewResponse.setCrewOwnerId(1L);
        crewResponse.setRole("ADMIN_USERS");

        return ResponseEntity.status(HttpStatus.OK)
                .body(crewResponse);
    }

    @PutMapping("/{id}")
    ResponseEntity<CrewResponse> updateCrew(@RequestBody CrewRequest alterCrew, @PathVariable Long id) {

        CrewResponse crewResponse = new CrewResponse();
        crewResponse.setCrewId(1L);
        crewResponse.setCrewName("Egito");
        crewResponse.setCrewOwner("Anubis");
        crewResponse.setCrewOwnerId(2L);
        crewResponse.setRole("ADMIN_USERS");

        return ResponseEntity.status(HttpStatus.OK)
                .body(crewResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCrew(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT)
                .body(null);
    }
}
