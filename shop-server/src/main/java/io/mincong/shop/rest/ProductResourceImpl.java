package io.mincong.shop.rest;

import javax.ws.rs.core.Response;

public class ProductResourceImpl implements ProductResource {

  public Response getProduct(String id) {
    return Response.ok().entity("{\"id\":\"" + id + "\",\"name\":\"foo\"}").build();
  }

}
