import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HouseManager orazioHouse = new HouseManager();
        boolean x = true;
        while (x) {
            System.out.println("\n House Management System ");
            System.out.println("    1. Manage Rooms");
            System.out.println("    2. Manage Pools");
            System.out.println("    3. Manage Room Amenities");
            System.out.println("    4. View All Rooms and Pools");
            System.out.println("    5. Exit");
            System.out.print("Enter your choice: ");

            int mainChoice = userInput.nextInt();
            userInput.nextLine(); // Consume newline

            switch (mainChoice) {
                case 1:                                                                                 // Manage Rooms
                    boolean roomMenu = true;
                    while (roomMenu) {
                        System.out.println("\n Room Management ");
                        System.out.println("    1. Add Room");
                        System.out.println("    2. Remove Room");
                        System.out.println("    3. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        int roomChoice = userInput.nextInt();
                        userInput.nextLine();

                        switch (roomChoice) {
                            case 1:
                                System.out.print("Enter room name: ");
                                String roomName = userInput.nextLine();
                                orazioHouse.addRoom(new Room(roomName));
                                System.out.println("Room added successfully!");
                                break;
                            case 2:
                                System.out.print("Enter room name to remove: ");
                                String roomToRemove = userInput.nextLine();
                                int result = orazioHouse.removeRoom(roomToRemove);
                                if (result == 0) {
                                    System.out.println("Room removed successfully!");
                                } else {
                                    System.out.println("Room not found or couldn't be removed!");
                                }
                                break;
                            case 3:
                                roomMenu = false;
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again.");
                        }
                    }
                    break;
                case 2:                                                                                 // Manage Pools
                    boolean poolMenu = true;
                    while (poolMenu) {
                        System.out.println("\n Pool Management ");
                        System.out.println("    1. Add Pool");
                        System.out.println("    2. Remove Pool");
                        System.out.println("    3. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        int poolChoice = userInput.nextInt();
                        userInput.nextLine();
                        switch (poolChoice) {
                            case 1:
                                System.out.print("Enter pool name: ");
                                String poolName = userInput.nextLine();
                                System.out.print("Enter pool width: ");
                                float width = userInput.nextFloat();
                                System.out.print("Enter pool height: ");
                                float height = userInput.nextFloat();
                                orazioHouse.addPool(new Pool(poolName, width, height));
                                System.out.println("Pool added successfully!");
                                break;
                            case 2:
                                System.out.print("Enter pool name to remove: ");
                                String poolToRemove = userInput.nextLine();
                                int poolResult = orazioHouse.removePool(poolToRemove);
                                if (poolResult == 0) {
                                    System.out.println("Pool removed successfully!");
                                } else {
                                    System.out.println("Pool not found or couldn't be removed!");
                                }
                                break;
                            case 3:
                                poolMenu = false;
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again.");
                        }
                    }
                    break;
                case 3:                                                                        // Manage Room Amenities
                    if(orazioHouse.getRoomManager().isEmpty()){
                        System.out.println("The house is empty");
                        break;
                    }
                    System.out.print("Enter room name to manage amenities: ");
                    String roomName = userInput.nextLine();
                    Room room = orazioHouse.getRoom(roomName);

                    if (room == null) {
                        System.out.println("Room not found!");
                        break;
                    }
                    boolean manage = true;
                    while (manage) {
                        System.out.println("\n Amenities Management for " + roomName + " ");
                        System.out.println("    1. Add Appliance");
                        System.out.println("    2. Add Sensor");
                        System.out.println("    3. View All Amenities");
                        System.out.println("    4. Remove Amenity");
                        System.out.println("    5. Back to Main Menu");
                        System.out.print("Enter your choice: ");

                        int amenityChoice = userInput.nextInt();
                        userInput.nextLine();

                        switch (amenityChoice) {
                            case 1:
                                System.out.print("Enter appliance name: ");
                                String appName = userInput.nextLine();
                                System.out.print("Enter appliance type: ");
                                String type = userInput.nextLine();
                                System.out.print("Enter wattage: ");
                                int wattage = userInput.nextInt();
                                userInput.nextLine();

                                Appliance tempA = new Appliance(appName,type,wattage);
                                room.addAmenity(appName,tempA);
                                System.out.println("Appliance added successfully!");
                                break;

                            case 2:
                                System.out.print("Enter sensor name: ");
                                String sensorName = userInput.nextLine();
                                System.out.println("Select sensor type:");
                                System.out.println("1. Temperature Sensor");
                                System.out.println("2. Humidity Sensor");
                                System.out.println("3. VOC Sensor");
                                System.out.print("Your choice: ");
                                int sensorType = userInput.nextInt();
                                userInput.nextLine();

                                Sensor sensor = null;
                                if (sensorType == 1) {
                                    sensor = new TempSensor(sensorName);
                                } else if (sensorType == 2) {
                                    sensor = new HumiditySensor(sensorName);
                                } else if (sensorType == 3) {
                                    sensor = new VocSensor(sensorName);
                                } else {
                                    System.out.println("Invalid sensor type!");
                                    break;
                                }
                                room.addAmenity(sensorName, sensor);
                                System.out.println("Sensor added successfully!");
                                break;
                            case 3:
                                System.out.print(" All Amenities in: ");
                                System.out.print(room.toString());
                                break;
                            case 4:
                                System.out.print("Enter amenity name to remove: ");
                                String amenityToRemove = userInput.nextLine();
                                Amenities removed = room.getAmenity(amenityToRemove);
                                if (removed != null) {
                                    room.removeRoomFeature(amenityToRemove);
                                    System.out.println("Amenity '" + amenityToRemove + "' removed successfully!");
                                } else {
                                    System.out.println("Amenity not found!");
                                }
                                break;
                            case 5:
                                manage = false;
                                break;
                            default:
                                System.out.println("Invalid choice! Please try again.");
                        }
                    }
                    break;
                case 4:                                                                              // View All
                    if(orazioHouse.getRoomManager().isEmpty() && orazioHouse.getPoolManager().isEmpty()) {
                        System.out.println("No rooms or pools found!");
                        break;
                    }

                    System.out.println("\n All Rooms ");
                    for (Room tempRoom : orazioHouse.getRoomManager().values()) {
                        System.out.println("\n" + tempRoom.getRoomName() + ":");
                        for (Amenities amenity : tempRoom.getRoomFeatures().values()) {
                            System.out.println("  - " + amenity);
                        }
                    }

                    System.out.println("\n All Pools ");
                    for (Pool pool : orazioHouse.getPoolManager().values()) {
                        System.out.println("\n" + pool.getPoolName() + ":");
                        System.out.println("  " + pool.getWaterTemperature().getTemp());
                    }
                    break;
                case 5:                                                                                         // Exit
                    Logger.writeLog("User exited the program\n");
                    x = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}