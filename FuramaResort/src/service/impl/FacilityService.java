package service.impl;

import model.facility.Facility;
import model.facility.House;
import model.facility.Room;
import model.facility.Villa;
import repository.IFacilityRepository;
import repository.impl.FacilityRepository;
import service.IFacilityService;
import utils.Regex;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final IFacilityRepository facilityRepository = new FacilityRepository();
    private static final Scanner scanner = new Scanner(System.in);


    @Override
    public void displayFacility() {
        Map<Facility, Integer> facilityList = facilityRepository.getFacility();
        for (Facility f : facilityList.keySet()) {
            System.out.println(f);
        }
    }

    @Override
    public void displayFacilityMaintain() {
        List<Facility> facilityListMaintain = facilityRepository.getFacilityMaintain();
        for (Facility maintain : facilityListMaintain) {
            System.out.println(maintain);
        }
    }

    @Override
    public void addFacility() {
        do {
            System.out.println("Vui lòng chọn dịch vụ\n" +
                    "1. Thêm mới Villa\n" +
                    "2. Thêm mới House\n" +
                    "3. Thêm mới Room\n" +
                    "4. Trở lại menu");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("vui lòng nhập số");
                }
            }
            switch (choice) {
//            String serviceCode, String serviceName, float usableArea, float price, int capacity, String rentalType, String roomStandard, int floors, float poolArea
                case 1:
                    String idService;
                    do {
                        System.out.println("Nhập mã dịch vụ theo định dạng SVVL-YYYY");
                        idService = scanner.nextLine();
                        Facility facility = facilityRepository.getById(idService);
                        if (facility != null) {
                            System.out.println("Mã id đã tồn tại");
                            continue;
                        }
                        if (!Regex.checkIdService(idService)) {
                            continue;
                        }
                        break;
                    } while (true);
                    String serviceName;
                    do {
                        System.out.println("Nhập tên dịch vụ(Vui lòng viết hoa chữ cái đầu tiên)");
                        serviceName = scanner.nextLine();
                    } while (!Regex.checkNameService(serviceName));
                    float usableArea;
                    while (true) {
                        try {
                            System.out.println("Nhập diện tích sử dụng");
                            usableArea = Float.parseFloat(scanner.nextLine());
                            if (usableArea > 30) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }
                    }
                    float price;
                    while (true) {
                        try {
                            System.out.println("Nhập chi phí thuê");
                            price = Float.parseFloat(scanner.nextLine());
                            if (price > 0) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập số");
                        }
                    }
                    int capacity;
                    while (true) {
                        try {
                            System.out.println("Nhập sức chứa tối đa của phòng");
                            capacity = Integer.parseInt(scanner.nextLine());
                            if (capacity > 0 && capacity < 20) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập số");
                        }
                    }
                    String rentalType;
                    do {
                        System.out.println("Nhập hình thức muốn thuê");
                        System.out.println("Năm|Tháng|Ngày|Giờ");
                        rentalType = scanner.nextLine();
                    } while (!Regex.checkRental(rentalType));
                    String roomStandard;
                    do {
                        System.out.println("Nhập loại phòng muốn thuê (Vui lòng viết hoa chữ cái đầu tiên");
                        roomStandard = scanner.nextLine();
                    } while (!Regex.checkNameService(roomStandard));
                    int floors;
                    while (true) {
                        try {
                            System.out.println("Nhập số tầng");
                            floors = Integer.parseInt(scanner.nextLine());
                            if (floors > 0) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập số nguyên dương");
                        }
                    }
                    float poolArea;
                    while (true) {
                        try {
                            System.out.println("Nhập diện tích hồ bơi");
                            poolArea = Float.parseFloat(scanner.nextLine());
                            if (poolArea > 30) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập số");
                        }
                    }
                    Villa villa = new Villa(idService, serviceName, usableArea, price, capacity, rentalType, roomStandard, floors, poolArea);
                    facilityRepository.addFacility(villa);
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    do {
                        System.out.println("Nhập mã dịch vụ theo định dạng SVHO-YYYY");
                        idService = scanner.nextLine();
                    } while (!Regex.checkIdService(idService));
                    String nameService;
                    do {
                        System.out.println("Nhập tên dịch vụ (Vui lòng viết hoa chữ cái đầu tiên");
                        nameService = scanner.nextLine();
                    } while (!Regex.checkNameService(nameService));
                    while (true) {
                        try {
                            System.out.println("Nhập diện tích sử dụng");
                            usableArea = Float.parseFloat(scanner.nextLine());
                            if (usableArea > 30) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Nhập số đê");
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Nhập giá phòng");
                            price = Float.parseFloat(scanner.nextLine());
                            if (price > 0) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập đúng định dạng");
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Nhập số lượng người tối đa");
                            capacity = Integer.parseInt(scanner.nextLine());
                            if (capacity > 0 && capacity < 20) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập đúng định dạng ");
                        }

                    }
//                 String rentalType, String roomStandard, int floors
                    do {
                        System.out.println("Nhập hình thức thuê");
                        System.out.println("Năm|Tháng|Ngày|Giờ");
                        rentalType = scanner.nextLine();
                    } while (!Regex.checkRental(rentalType));
                    do {
                        System.out.println("Nhập loại phòng");
                        roomStandard = scanner.nextLine();
                    } while (!Regex.checkNameService(roomStandard));
                    while (true) {
                        try {
                            System.out.println("Nhập số tầng");
                            floors = Integer.parseInt(scanner.nextLine());
                            if (floors > 0) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }

                    }
                    House house = new House(idService, nameService, usableArea, price, capacity, rentalType, roomStandard, floors);
                    facilityRepository.addFacility(house);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    do {
                        System.out.println("Nhập mã dịch vụ theo định dạng SVRO-YYYY");
                        idService = scanner.nextLine();
                    } while (!Regex.checkIdService(idService));
                    do {
                        System.out.println("Nhập tên dịch vụ");
                        serviceName = scanner.nextLine();
                    } while (!Regex.checkNameService(serviceName));
                    while (true)
                        try {
                            System.out.println("Nhập diện tích sử dụng");
                            usableArea = Float.parseFloat(scanner.nextLine());
                            if (usableArea > 30) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }
                    while (true) {
                        try {
                            System.out.println("Nhập giá thuê");
                            price = Float.parseFloat(scanner.nextLine());
                            if (price > 0) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }
                    }
                    //                 int capacity, String rentalType, String serviceFree
                    while (true) {
                        try {
                            System.out.println("Nhập số người ở tối đa");
                            capacity = Integer.parseInt(scanner.nextLine());
                            if (capacity > 0 && capacity < 20) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Vui lòng nhập số");
                        }
                    }
                    do {
                        System.out.println("Nhập hình thức thuê");
                        System.out.println("Năm|Tháng|Ngày|Giờ");
                        rentalType = scanner.nextLine();
                    } while (!Regex.checkRental(rentalType));
                    System.out.println("Nhập dịch vụ miễn phí đi kèm");
                    String serviceFree = scanner.nextLine();
                    Room room = new Room(idService, serviceName, usableArea, price, capacity, rentalType, serviceFree);
                    facilityRepository.addFacility(room);
                case 4:
                    return;
                default:
                    System.out.println("Vui lòng chọn 1 trong 4");
            }
        } while (true);
    }

    @Override
    public void deleteFacility() {
        System.out.println("Nhập mã phòng bạn muốn xóa");
        String id = scanner.nextLine();
        Facility facility = facilityRepository.getById(id);
        if (facility == null) {
            System.out.println("Mã dịch vụ không tồn tại");
        } else {
            System.out.println("Bạn có muốn xóa dịch vụ " + facility.getServiceName() + " không");
            System.out.println("1. Có");
            System.out.println("2. Không");
            int choice;
            while (true) {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("vui lòng nhập số");
                }
            }
            if (choice == 1) {
                facilityRepository.deleteFacility(facility);
                System.out.println("Xóa thành công");
            }
        }
    }
}
