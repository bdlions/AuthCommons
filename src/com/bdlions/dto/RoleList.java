package com.bdlions.dto;

import com.bdlions.dto.response.ClientResponse;
import java.util.ArrayList;

/**
 *
 * @author nazmul hasan
 */
public class RoleList extends ClientResponse{
    private ArrayList<Role> roles;

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }    
}
