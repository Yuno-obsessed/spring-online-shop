package sanity.nil.order.application.order.command;

import lombok.RequiredArgsConstructor;
import sanity.nil.order.application.order.dto.command.CreateAddressDTO;
import sanity.nil.order.application.order.interfaces.persistence.AddressDAO;
import sanity.nil.order.domain.order.entity.Address;
import sanity.nil.order.domain.order.services.AddressService;

@RequiredArgsConstructor
public class CreateAddressCommand {

    private final AddressDAO addressDAO;
    private final AddressService service;

    public Address handle(CreateAddressDTO createDTO) {
        Address address = service.createAddress(createDTO.country, createDTO.city,
                createDTO.streetName, createDTO.buildingNumber, createDTO.postalCode);
        return addressDAO.createAddress(address);
    }
}
