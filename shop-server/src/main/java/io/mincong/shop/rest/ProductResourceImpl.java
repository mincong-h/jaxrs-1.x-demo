package io.mincong.shop.rest;

import io.mincong.shop.rest.dto.Product;

public class ProductResourceImpl implements ProductResource {

  public Product getProduct(String id) {
    return new Product(id, "foo");
  }

}
