package com.mffalcao.crew.model;

public class CrewResponse {

    private Long crewId;
    private String crewName;
    private String role;
    private String crewOwner;
    private Long crewOwnerId;

    public CrewResponse() {
    }

    public Long getCrewId() {
        return crewId;
    }

    public void setCrewId(Long crewId) {
        this.crewId = crewId;
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCrewOwner() {
        return crewOwner;
    }

    public void setCrewOwner(String crewOwner) {
        this.crewOwner = crewOwner;
    }

    public Long getCrewOwnerId() {
        return crewOwnerId;
    }

    public void setCrewOwnerId(Long crewOwnerId) {
        this.crewOwnerId = crewOwnerId;
    }
}
