package ch.cpnves.payroll.Controllers;

public class PotatoNotFoundException extends RuntimeException{

    PotatoNotFoundException(Long id){
        super("Could not find potato " + id);
    }
}
