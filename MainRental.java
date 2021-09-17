<<<<<<< HEAD
// ahase1にて修正
=======
>>>>>>> origin/master
public class MainRental{
    public static void main(String[] args){

        Movie my_movie = new Movie("七人の侍",0);

<<<<<<< HEAD
        Customer my_customer = new Customer("hiroko");
=======
        Customer my_customer = new Customer("akira");
>>>>>>> origin/master
        Rental my_rental = new Rental(my_movie, 10);

        my_customer.addRental(my_rental);

<<<<<<< HEAD
=======


>>>>>>> origin/master
        System.out.println(my_customer.statement());

    }
    
}
