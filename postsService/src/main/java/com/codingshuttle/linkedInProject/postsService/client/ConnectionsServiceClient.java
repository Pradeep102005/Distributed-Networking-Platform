package com.codingshuttle.linkedInProject.postsService.client;

import com.codingshuttle.linkedInProject.postsService.dto.PersonDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "connections-service", path = "/connections", url = "${CONNECTIONS_SERVICE_URI:}")
public interface ConnectionsServiceClient {

    @GetMapping("/core/{userId}/first-degree")
    List<PersonDto> getFirstDegreeConnections(@PathVariable Long userId);
}
