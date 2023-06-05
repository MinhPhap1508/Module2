package repository.impl;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IFacilityRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static {
//        String serviceCode, String serviceName, float usableArea, float price, int capacity, String rentalType, String roomStandard, int floors
        Facility house = new House("SVHO-1234", "House", 40, 999999, 5, "month", "Standard", 2);
        Facility room = new Room("SVRO-0001", "Room", 35, 500000, 2, "date", "Free breakfast");
        Facility villa = new Villa("SVVL-0002", "Villa", 100, 10000000, 10, "date", "VIP", 3, 35);
        facilityIntegerMap.put(house, 2);
        facilityIntegerMap.put(room, 9);
        facilityIntegerMap.put(villa, 1);
    }

    @Override
    public void addFacility(Facility facility) {
        facilityIntegerMap.put(facility, 0);

    }

    @Override
    public void deleteFacility(Facility facility) {
        facilityIntegerMap.remove(facility);
    }

    @Override
    public Map<Facility, Integer> getFacility() {
        return facilityIntegerMap;
    }

    @Override
    public List<Facility> getFacilityMaintain() {
        List<Facility> facilityMaintain = new ArrayList<>();
        for (Facility key : facilityIntegerMap.keySet()) {
            Integer value = facilityIntegerMap.get(key);
            if (value >= 5) {
                facilityMaintain.add(key);
            }
        }
        return facilityMaintain;
    }

    @Override
    public Facility getById(String id) {
        for (Facility key : facilityIntegerMap.keySet()) {
            if (key.getServiceCode().equals(id)) {
                return key;
            }
        }
        return null;
    }
}
