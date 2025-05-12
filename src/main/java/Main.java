import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HouseManager_fake oraziosHouse = new HouseManager_fake();
        Room tempR;
        int scelta;
        boolean x;
        x = true;

        while(x) {      //Scelta generale
            System.out.println("1.ADD/REMOVE room\n2.ADD/REMOVE pool\n3.Manage room amenities\n4.Visualizza stanze e piscina/e con relativi dispositivi\n5.Quit?");
            System.out.print("Cosa vuoi fare? ");
            scelta = userInput.nextInt();

            switch (scelta) {
                case 1:
                    boolean y = true;
                    while(y){       // + o - camera
                        System.out.println("1.Add a room\n2.Remove a room\n3. Go back");
                        System.out.print("What would you like to do? ");
                        switch (userInput.nextInt()){
                            case 1:
                                System.out.print("Insert the room name: ");
                                tempR = new Room(userInput.nextLine());
                                oraziosHouse.addRoom(tempR);
                                break;
                            case 2:
                                System.out.print("Insert the room name: ");
                                if(oraziosHouse.removeRoom(userInput.nextLine())== -1)
                                    System.out.println("Unable to remove the room!");
                                else
                                    System.out.println("Room removed successfully");
                                break;
                            case 3:
                                y = false;
                                break;
                            default:
                                System.out.println("Choice not valid!");
                        }
                    }
                    break;
                case 2:
                    boolean z = true;
                    while(z) {      // + o - piscina
                        System.out.println("1.Add a pool\n2.Remove a pool\n3. Go back");
                        System.out.print("What would you like to do? ");
                        switch (userInput.nextInt()) {
                            case 1:
                                System.out.print("Insert the pool name: ");
                                String tempS = userInput.nextLine();
                                System.out.print("Insert the pool width: ");
                                float width = userInput.nextFloat();
                                System.out.print("Insert the pool height: ");
                                float height = userInput.nextFloat();
                                Pool tempP = new Pool(tempS,width,height);
                                oraziosHouse.addPool(tempP);
                                break;
                            case 2:
                                System.out.print("Insert the pool name: ");
                                if (oraziosHouse.removePool(userInput.nextLine()) == -1)
                                    System.out.println("Unable to remove the pool!");
                                else
                                    System.out.println("Pool removed successfully");
                                break;
                            case 3:
                                z = false;
                                break;
                            default:
                                System.out.println("Choice not valid!");
                        }
                    }
                    break;
                case 3: // room amenities
                    y = true;
                    System.out.println("Insert the room name");
                    String roomN = userInput.nextLine();
                    tempR = oraziosHouse.getRoom(roomN);
                    if(tempR == null)
                        System.out.println("Couldn't find room!");
                    else{

                        while (y){
                            System.out.println("1.Add appliance\n2.Add a light\n3. remove either");
                            System.out.println("What would you like to do?");
                            switch (userInput.nextInt()){
                                case 1:
                                    System.out.print("Insert the appliance name: ");
                                    String tempName = userInput.nextLine();
                                    System.out.print("Insert the type: ");
                                    String tempType = userInput.nextLine();
                                    System.out.print("Insert the pool height: ");
                                    int tempWatt = userInput.nextInt();
                                    tempR.addAppliance(tempName,tempType,tempWatt);
                                    oraziosHouse.replaceRoom(roomN,tempR);
                            }
                        }

                    }
                    // chiedi nome stanza, se la trova chiedi cosa fare, altrimenti
                    break;
                case 4:
                    //
                    break;
                case 5:
                    Logger.writeLog("User exited the program \n");
                    x = false;
                    break;
                case 6:
                    //
                    break;
                case 7:
                    //
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }
    }
}