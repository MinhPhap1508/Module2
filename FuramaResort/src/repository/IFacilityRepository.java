package repository;

import model.facility.Facility;
import model.facility.Villa;

import java.util.List;
import java.util.Map;

public interface IFacilityRepository {
    void addFacility(Facility facility);

    void deleteFacility(Facility facility);

    Map<Facility, Integer> getFacility();

    List<Facility> getFacilityMaintain();

    Facility getById(String id);
}
