package io.mincong.shop.rest;

import io.mincong.shop.rest.dto.Product;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("products")
public interface ProductResource {

  @GET
  @Path("{id}")
  @Produces(MediaType.APPLICATION_JSON)
  Product getProduct(@PathParam("id") String id);
}
