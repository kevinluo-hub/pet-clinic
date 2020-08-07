package kevinlearnspring_petClinic.services;
import kevinlearnspring_petClinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
