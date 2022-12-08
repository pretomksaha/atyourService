package com.example.atService.craftsman;

public class Craftsman {
    private Long id;
    private String name;
    private String typeOfService;
    private String address;
    private String mobile;
    private String workTime;
    private Boolean available;
    private String impression;

    public Craftsman() {
    }

    public Craftsman(
            Long id,
            String name,
            String typeOfService,
            String address,
            String mobile,
            String workTime,
            Boolean available,
            String impression
    ) {
        this.id = id;
        this.name = name;
        this.typeOfService = typeOfService;
        this.address = address;
        this.mobile = mobile;
        this.workTime = workTime;
        this.available = available;
        this.impression = impression;
    }

    public Craftsman(
            String name,
            String typeOfService,
            String address,
            String mobile,
            String workTime,
            Boolean available,
            String impression
    ) {
        this.name = name;
        this.typeOfService = typeOfService;
        this.address = address;
        this.mobile = mobile;
        this.workTime = workTime;
        this.available = available;
        this.impression = impression;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    @Override
    public String toString() {
        return "Craftsman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", workTime='" + workTime + '\'' +
                ", available=" + available +
                ", impression='" + impression + '\'' +
                '}';
    }
}
