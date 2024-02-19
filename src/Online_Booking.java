public interface Online_Booking {

    //This interface will be used by the Management Team and Matire

    void login(String username,String password);

    void logout();

    void addBooking(String firstName, String LastName,int Date,int Time);

    void removeBooking(int Booking_ID);

    void editBooking_Status(int Booking_ID, int Booking_Status_ID);

    /*
        Booking Status_ID States: Online Booking Only.

        Booking Status             ID
        Received                   0
        Waiting for Approval       1
        Approved                   2
        Cancelled                  3
     */

    void viewAllBookings();




}
