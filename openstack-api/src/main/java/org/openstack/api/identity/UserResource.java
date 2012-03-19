package org.openstack.api.identity;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Target;
import javax.ws.rs.core.MediaType;

import org.openstack.api.common.Resource;
import org.openstack.model.identity.KeyStoneUser;

public class UserResource extends Resource {
	
	public UserResource() {
	}
	
	public UserResource(Target target) {
		super(target);
	}


	public KeyStoneUser get() {
		return target.request(MediaType.APPLICATION_XML).get(KeyStoneUser.class);
	}

	public KeyStoneUser update(Entity<KeyStoneUser> entity) {
		return target.request(MediaType.APPLICATION_JSON).put(entity, KeyStoneUser.class);
	}
	
	public void delete() {
		target.request().delete();
	}

}