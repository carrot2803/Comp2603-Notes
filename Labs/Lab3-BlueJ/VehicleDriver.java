// public class VehicleDriver {
//     private String name;
//     private Vehicle vehicle1;
//     private Vehicle vehicle2;

//     public VehicleDriver(String name) {
//         this.name = name;
//         this.vehicle1 = null;
//         this.vehicle2 = null;
//     }

//     public String getName() {
//         return this.name;
//     }

//     public boolean addVehicle(Vehicle v) {
//         if (v == null)
//             return false;
//         if (vehicle1 == null || vehicle1.equals(v)) {
//             vehicle1 = v;
//             return true;
//         } else if (vehicle2 == null || vehicle2.equals(v)) {
//             vehicle2 = v;
//             return true;
//         }
//         return false;
//     }

//     public String toString() {
//         return getName() +
//                 "\n 1.Here" + vehicle1.toString() +
//                 "\n 2." + vehicle2.toString();
//     }
// }
