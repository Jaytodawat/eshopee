package com.example.eshopee.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
public class Role {

	@Id
	private Long roleId;
	private String roleName;



}
