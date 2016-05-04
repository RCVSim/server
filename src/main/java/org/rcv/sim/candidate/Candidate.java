package org.rcv.sim.candidate;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */
public interface Candidate {
    String getId();
    String getName();
    String getPhoto();
    Integer getVoteCount();

    class DTO {
        @JsonProperty
        String id;

        @JsonProperty
        String name;

        @JsonProperty
        String photo;

        @JsonProperty
        Integer votes;
    }


}
