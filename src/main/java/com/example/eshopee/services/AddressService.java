package com.example.eshopee.services;

import java.util.List;

import com.example.eshopee.entites.Address;
import com.example.eshopee.payloads.AddressDTO;

public interface AddressService {
	
	AddressDTO createAddress(AddressDTO addressDTO);
	
	List<AddressDTO> getAddresses();
	
	AddressDTO getAddress(Long addressId);
	
	AddressDTO updateAddress(Long addressId, Address address);
	
	String deleteAddress(Long addressId);
}
