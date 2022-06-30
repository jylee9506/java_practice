package org.zerock.store;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter

public class StoreDTO {

    int sno;
    String name;
    double lat;
    double lng;



}
