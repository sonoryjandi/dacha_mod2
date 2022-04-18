public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Alex", 22, "admin");
        User use2 = new User(1, "Alex", 22, "admin");
        String DIRECTORY = "C:\\Users\\Anastasia\\Desktop\\DirectoryTask\\";
        String fileName = "name" + user1.getName() + ".csv";
//        try {
//            FileWriter writer = new FileWriter(DIRECTORY + fileName);
//            writer.write(user1.getId() + ",");
//            writer.write(user1.getName() + ",");
//            writer.write(user1.getAge() + ",");
//            writer.write(user1.getPermissions());
//            writer.close();
//        } catch (Exception exception) {
//            System.out.println(exception.getMessage());
//        }
    }
}
