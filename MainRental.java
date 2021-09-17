public class MainRental{
    public static void main(String[] args){

        Movie my_movie = new Movie("七人の侍",0);

        Customer my_customer = new Customer("akiraakira");
        Rental my_rental = new Rental(my_movie, 10);

        my_customer.addRental(my_rental);



        System.out.println(my_customer.statement());

    }
    
}
