package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;

public class Train {
    private String traindId;
    private String trainNo;
    private List<List<Integer>> seats;
    private List<Map<String, Time>> seatAvailability;
    private List<String> stations;
}
