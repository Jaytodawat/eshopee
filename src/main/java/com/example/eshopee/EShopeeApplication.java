//package com.example.eshopee;
//
//import com.example.eshopee.config.AppConstants;
//import com.example.eshopee.repositories.RoleRepo;
//import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
//import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
//import io.swagger.v3.oas.annotations.security.SecurityScheme;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//import java.util.List;
//
//@SpringBootApplication
//public class EShopeeApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(EShopeeApplication.class, args);
//    }
//
//}

package com.example.eshopee;

import java.util.List;

import com.example.eshopee.config.AppConstants;
import com.example.eshopee.entites.Role;
import com.example.eshopee.repositories.RoleRepo;
import org.modelmapper.ModelMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;

@SpringBootApplication
@SecurityScheme(name = "E-Commerce Application", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class EShopeeApplication implements CommandLineRunner {

    private final RoleRepo roleRepo;

    EShopeeApplication(RoleRepo roleRepo) {
        this.roleRepo = roleRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(EShopeeApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public void run(String... args) throws Exception {
        try {
            Role adminRole = new Role();
            adminRole.setRoleId(AppConstants.ADMIN_ID);
            adminRole.setRoleName("ADMIN");

            Role userRole = new Role();
            userRole.setRoleId(AppConstants.USER_ID);
            userRole.setRoleName("USER");

            List<Role> roles = List.of(adminRole, userRole);

            List<Role> savedRoles = roleRepo.saveAll(roles);

            savedRoles.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
