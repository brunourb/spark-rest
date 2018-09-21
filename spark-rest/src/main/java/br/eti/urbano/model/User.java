package br.eti.urbano.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@Builder
@AllArgsConstructor
public class User extends DefaultModel {

    protected String uuid;
    protected String userName;
    protected byte[] avatar;
}
