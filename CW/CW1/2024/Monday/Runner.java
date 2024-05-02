public class Runner {
    public static void main(String[] args) {
        Room rm1 = new Room("Lobby");
        Radiator rd1 = new Radiator();
        Radiator rd2 = new Radiator();
        System.out.println(rm1.isHeatedBy(rd2));
        System.out.println(rm1.isHeatedBy(rd2));
        System.out.println(rm1.isHeatedBy(rd1));
        System.out.println(rm1.isHeatedBy(new Radiator()));
        System.out.println(rm1.toString());
        System.out.println(rd1.toString());
        System.out.println(rd2.toString());
    }
}
